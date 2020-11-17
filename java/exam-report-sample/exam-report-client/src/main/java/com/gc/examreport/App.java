package com.gc.examreport;

import java.io.IOException;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;

import com.gc.examreport.*;
import com.gc.examreport.model.*;
// import com.gc.examreport.ExamReportServiceClient.*;

/**
* Hello world!
*
*/
public class App
{
  ExamReportService sdkClient;

  public App() {
    initSdk();
  }

  // The configuration settings are for illustration purposes and may not be a recommended best practice.
  private void initSdk() {
    sdkClient = ExamReportService.builder()
    .connectionConfiguration(
    new ConnectionConfiguration()
    .maxConnections(100)
    .connectionMaxIdleMillis(1000))
    .timeoutConfiguration(
    new TimeoutConfiguration()
    .httpRequestTimeout(3000)
    .totalExecutionTimeout(10000)
    .socketTimeout(2000))
    .build();

  }

  // Calling shutdown is not necessary unless you want to exert explicit control of this resource.
  public void shutdown() {
    sdkClient.shutdown();
  }


  // public Output getResultByPostInputBody(Double x, Double y, String o) {
  //   PostApiRootResult postResult = sdkClient.postApiRoot(
  //   new PostApiRootRequest().input(new Input().a(x).b(y).op(o)));
  //   return postResult.getResult().getOutput();
  // }

  // public GetExamReportExam_report_keyResult getExamReportExam_report_key(GetExamReportExam_report_keyRequest getExamReportExam_report_keyRequest) {
  public StudentReport getExamReport(String reportKey){
    GetExamReportExam_report_keyResult result = sdkClient.getExamReportExam_report_key(
    new GetExamReportExam_report_keyRequest().examReportKey(reportKey)
    );
    return result.getStudentReport();
  }



  public static void main( String[] args )
  {
    System.out.println( "Simple calc" );
    // to begin
    App examReportAPI = new App();

    // call the SimpleCalc API
    // Output res = calc.getResultWithPathParameters("1", "2", "-");
    // System.out.printf("GET /1/2/-: %s\n", res.getC());
    //
    // // Use the type query parameter
    // res = calc.getResultWithQueryParameters("1", "2", "+");
    // System.out.printf("GET /?a=1&b=2&op=+: %s\n", res.getC());

    // Call POST with an Input body.
    examReportAPI.getExamReport("18");
    // System.out.printf("PUT /\n\n{\"a\":1, \"b\":2,\"op\":\"*\"}\n %s\n", res.getC());


  }

}
