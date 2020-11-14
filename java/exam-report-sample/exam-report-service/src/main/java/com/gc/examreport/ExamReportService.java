/**
 * null
 */
package com.gc.examreport;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.gc.examreport.model.*;

/**
 * Interface for accessing ExamReportService.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ExamReportService {

    /**
     * @param getExamReportExam_report_keyRequest
     * @return Result of the GetExamReportExam_report_key operation returned by the service.
     * @sample ExamReportService.GetExamReportExam_report_key
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/GetExamReportExam_report_key"
     *      target="_top">AWS API Documentation</a>
     */
    GetExamReportExam_report_keyResult getExamReportExam_report_key(GetExamReportExam_report_keyRequest getExamReportExam_report_keyRequest);

    /**
     * @param postExamReportClassRequest
     * @return Result of the PostExamReportClass operation returned by the service.
     * @sample ExamReportService.PostExamReportClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/PostExamReportClass"
     *      target="_top">AWS API Documentation</a>
     */
    PostExamReportClassResult postExamReportClass(PostExamReportClassRequest postExamReportClassRequest);

    /**
     * @param postExamReportStudentRequest
     * @return Result of the PostExamReportStudent operation returned by the service.
     * @sample ExamReportService.PostExamReportStudent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/PostExamReportStudent"
     *      target="_top">AWS API Documentation</a>
     */
    PostExamReportStudentResult postExamReportStudent(PostExamReportStudentRequest postExamReportStudentRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ExamReportServiceClientBuilder builder() {
        return new ExamReportServiceClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
