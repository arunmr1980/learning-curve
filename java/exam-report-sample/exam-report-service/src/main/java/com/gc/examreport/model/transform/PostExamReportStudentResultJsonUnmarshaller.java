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
 * PostExamReportStudentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExamReportStudentResultJsonUnmarshaller implements Unmarshaller<PostExamReportStudentResult, JsonUnmarshallerContext> {

    public PostExamReportStudentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostExamReportStudentResult postExamReportStudentResult = new PostExamReportStudentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postExamReportStudentResult;
        }

        while (true) {
            if (token == null)
                break;

            postExamReportStudentResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postExamReportStudentResult;
    }

    private static PostExamReportStudentResultJsonUnmarshaller instance;

    public static PostExamReportStudentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostExamReportStudentResultJsonUnmarshaller();
        return instance;
    }
}
