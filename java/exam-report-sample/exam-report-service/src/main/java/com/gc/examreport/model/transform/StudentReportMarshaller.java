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
 * StudentReportMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StudentReportMarshaller {

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

    private static final StudentReportMarshaller instance = new StudentReportMarshaller();

    public static StudentReportMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StudentReport studentReport, ProtocolMarshaller protocolMarshaller) {

        if (studentReport == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(studentReport.getAcademicYear(), ACADEMICYEAR_BINDING);
            protocolMarshaller.marshall(studentReport.getClassInfoKey(), CLASSINFOKEY_BINDING);
            protocolMarshaller.marshall(studentReport.getDivision(), DIVISION_BINDING);
            protocolMarshaller.marshall(studentReport.getSchoolKey(), SCHOOLKEY_BINDING);
            protocolMarshaller.marshall(studentReport.getStudentKey(), STUDENTKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
