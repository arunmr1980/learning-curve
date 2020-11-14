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
 * GetExamReportExam_report_keyResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExamReportExam_report_keyResultJsonUnmarshaller implements Unmarshaller<GetExamReportExam_report_keyResult, JsonUnmarshallerContext> {

    public GetExamReportExam_report_keyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetExamReportExam_report_keyResult getExamReportExam_report_keyResult = new GetExamReportExam_report_keyResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getExamReportExam_report_keyResult;
        }

        while (true) {
            if (token == null)
                break;

            getExamReportExam_report_keyResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getExamReportExam_report_keyResult;
    }

    private static GetExamReportExam_report_keyResultJsonUnmarshaller instance;

    public static GetExamReportExam_report_keyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetExamReportExam_report_keyResultJsonUnmarshaller();
        return instance;
    }
}
