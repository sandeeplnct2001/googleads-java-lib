// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201403.reportservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201403.ReportDownloader;
import com.google.api.ads.dfp.axis.v201403.Column;
import com.google.api.ads.dfp.axis.v201403.DateRangeType;
import com.google.api.ads.dfp.axis.v201403.Dimension;
import com.google.api.ads.dfp.axis.v201403.ExportFormat;
import com.google.api.ads.dfp.axis.v201403.ReportJob;
import com.google.api.ads.dfp.axis.v201403.ReportQuery;
import com.google.api.ads.dfp.axis.v201403.ReportServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.io.File;

/**
 * This example runs a report that an upgraded publisher would use to include
 * statistics recorded before the upgrade. Not all dimensions (such as
 * CUSTOM_TARGETING) are supported with MERGED_ columns, so it is suggested that
 * this only be used for a short time after the upgrade.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ReportService.runReportJob
 *
 * @author Adam Rogal
 */
public class RunMergedDeliveryReport {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the ReportService.
    ReportServiceInterface reportService = dfpServices.get(session, ReportServiceInterface.class);

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDimensions(
        new Dimension[] {Dimension.DATE, Dimension.ORDER_ID, Dimension.ORDER_NAME});
    reportQuery.setColumns(new Column[] {Column.MERGED_AD_SERVER_IMPRESSIONS,
        Column.MERGED_AD_SERVER_CLICKS, Column.MERGED_AD_SERVER_CTR,
        Column.MERGED_AD_SERVER_CPM_AND_CPC_REVENUE,
        Column.MERGED_AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM});

    // Set the dynamic date range type or a custom start and end date.
    reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);

    // Create report job.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    ReportDownloader reportDownloader = new ReportDownloader(reportService, reportJob.getId());

    // Wait for the report to be ready.
    reportDownloader.waitForReportReady();

    // Change to your file location.
    String filePath = File.createTempFile("merged-delivery-report-", ".csv.gz").toString();

    System.out.printf("Downloading report to %s ...", filePath);

    // Download the report.
    reportDownloader.downloadReport(ExportFormat.CSV_DUMP, filePath);

    System.out.println("done.");
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
