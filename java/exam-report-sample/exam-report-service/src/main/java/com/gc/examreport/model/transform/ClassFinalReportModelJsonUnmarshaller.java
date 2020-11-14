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
 * ClassFinalReportModel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassFinalReportModelJsonUnmarshaller implements Unmarshaller<ClassFinalReportModel, JsonUnmarshallerContext> {

    public ClassFinalReportModel unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClassFinalReportModel classFinalReportModel = new ClassFinalReportModel();

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
                if (context.testExpression("class_key", targetDepth)) {
                    context.nextToken();
                    classFinalReportModel.setClassKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("division", targetDepth)) {
                    context.nextToken();
                    classFinalReportModel.setDivision(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return classFinalReportModel;
    }

    private static ClassFinalReportModelJsonUnmarshaller instance;

    public static ClassFinalReportModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClassFinalReportModelJsonUnmarshaller();
        return instance;
    }
}
