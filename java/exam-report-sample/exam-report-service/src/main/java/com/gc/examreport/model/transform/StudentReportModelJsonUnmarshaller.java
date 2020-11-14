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
 * StudentReportModel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudentReportModelJsonUnmarshaller implements Unmarshaller<StudentReportModel, JsonUnmarshallerContext> {

    public StudentReportModel unmarshall(JsonUnmarshallerContext context) throws Exception {
        StudentReportModel studentReportModel = new StudentReportModel();

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
                    studentReportModel.setAcademicYear(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("class_info_key", targetDepth)) {
                    context.nextToken();
                    studentReportModel.setClassInfoKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("division", targetDepth)) {
                    context.nextToken();
                    studentReportModel.setDivision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("school_key", targetDepth)) {
                    context.nextToken();
                    studentReportModel.setSchoolKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("student_key", targetDepth)) {
                    context.nextToken();
                    studentReportModel.setStudentKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return studentReportModel;
    }

    private static StudentReportModelJsonUnmarshaller instance;

    public static StudentReportModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudentReportModelJsonUnmarshaller();
        return instance;
    }
}
