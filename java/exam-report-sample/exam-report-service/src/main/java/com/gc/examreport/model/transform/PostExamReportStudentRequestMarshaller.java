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
 * PostExamReportStudentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostExamReportStudentRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> STUDENTREPORTMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final PostExamReportStudentRequestMarshaller instance = new PostExamReportStudentRequestMarshaller();

    public static PostExamReportStudentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostExamReportStudentRequest postExamReportStudentRequest, ProtocolMarshaller protocolMarshaller) {

        if (postExamReportStudentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postExamReportStudentRequest.getStudentReportModel(), STUDENTREPORTMODEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
