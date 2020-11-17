/**
 * null
 */
package com.gc.examreport.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.gc.examreport.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StudentReport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudentReportJsonUnmarshaller implements Unmarshaller<StudentReport, JsonUnmarshallerContext> {

    public StudentReport unmarshall(JsonUnmarshallerContext context) throws Exception {
        StudentReport studentReport = new StudentReport();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("academic_year", targetDepth)) {
                    context.nextToken();
                    studentReport.setAcademicYear(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("class_info_key", targetDepth)) {
                    context.nextToken();
                    studentReport.setClassInfoKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("division", targetDepth)) {
                    context.nextToken();
                    studentReport.setDivision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("school_key", targetDepth)) {
                    context.nextToken();
                    studentReport.setSchoolKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("student_key", targetDepth)) {
                    context.nextToken();
                    studentReport.setStudentKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return studentReport;
    }

    private static StudentReportJsonUnmarshaller instance;

    public static StudentReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudentReportJsonUnmarshaller();
        return instance;
    }
}
