/**
 * null
 */
package com.gc.examreport.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.gc.examreport.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetExamReportExam_report_keyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetExamReportExam_report_keyRequestMarshaller {

    private static final MarshallingInfo<String> EXAMREPORTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("exam_report_key").build();

    private static final GetExamReportExam_report_keyRequestMarshaller instance = new GetExamReportExam_report_keyRequestMarshaller();

    public static GetExamReportExam_report_keyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetExamReportExam_report_keyRequest getExamReportExam_report_keyRequest, ProtocolMarshaller protocolMarshaller) {

        if (getExamReportExam_report_keyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getExamReportExam_report_keyRequest.getExamReportKey(), EXAMREPORTKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
