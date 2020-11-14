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
 * ClassFinalReportModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClassFinalReportModelMarshaller {

    private static final MarshallingInfo<String> CLASSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("class_key").build();
    private static final MarshallingInfo<String> DIVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("division").build();

    private static final ClassFinalReportModelMarshaller instance = new ClassFinalReportModelMarshaller();

    public static ClassFinalReportModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClassFinalReportModel classFinalReportModel, ProtocolMarshaller protocolMarshaller) {

        if (classFinalReportModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(classFinalReportModel.getClassKey(), CLASSKEY_BINDING);
            protocolMarshaller.marshall(classFinalReportModel.getDivision(), DIVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
