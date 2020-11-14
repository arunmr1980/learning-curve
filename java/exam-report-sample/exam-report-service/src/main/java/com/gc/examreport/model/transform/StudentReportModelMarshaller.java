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
 * StudentReportModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StudentReportModelMarshaller {

    private static final MarshallingInfo<String> ACADEMICYEAR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("academic_year").build();
    private static final MarshallingInfo<String> CLASSINFOKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("class_info_key").build();
    private static final MarshallingInfo<String> DIVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("division").build();
    private static final MarshallingInfo<String> SCHOOLKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("school_key").build();
    private static final MarshallingInfo<String> STUDENTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("student_key").build();

    private static final StudentReportModelMarshaller instance = new StudentReportModelMarshaller();

    public static StudentReportModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StudentReportModel studentReportModel, ProtocolMarshaller protocolMarshaller) {

        if (studentReportModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(studentReportModel.getAcademicYear(), ACADEMICYEAR_BINDING);
            protocolMarshaller.marshall(studentReportModel.getClassInfoKey(), CLASSINFOKEY_BINDING);
            protocolMarshaller.marshall(studentReportModel.getDivision(), DIVISION_BINDING);
            protocolMarshaller.marshall(studentReportModel.getSchoolKey(), SCHOOLKEY_BINDING);
            protocolMarshaller.marshall(studentReportModel.getStudentKey(), STUDENTKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
