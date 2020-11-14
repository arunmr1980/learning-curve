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
 * PostExamReportClassResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExamReportClassResultJsonUnmarshaller implements Unmarshaller<PostExamReportClassResult, JsonUnmarshallerContext> {

    public PostExamReportClassResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostExamReportClassResult postExamReportClassResult = new PostExamReportClassResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postExamReportClassResult;
        }

        while (true) {
            if (token == null)
                break;

            postExamReportClassResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postExamReportClassResult;
    }

    private static PostExamReportClassResultJsonUnmarshaller instance;

    public static PostExamReportClassResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostExamReportClassResultJsonUnmarshaller();
        return instance;
    }
}
