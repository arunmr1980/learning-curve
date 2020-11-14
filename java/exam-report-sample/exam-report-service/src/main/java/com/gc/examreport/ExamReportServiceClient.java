/**
 * null
 */
package com.gc.examreport;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import com.gc.examreport.model.*;
import com.gc.examreport.model.transform.*;

/**
 * Client for accessing ExamReportService. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ExamReportServiceClient implements ExamReportService {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(com.gc.examreport.model.ExamReportServiceException.class));

    /**
     * Constructs a new client to invoke service methods on ExamReportService using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    ExamReportServiceClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param getExamReportExam_report_keyRequest
     * @return Result of the GetExamReportExam_report_key operation returned by the service.
     * @sample ExamReportService.GetExamReportExam_report_key
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/GetExamReportExam_report_key"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetExamReportExam_report_keyResult getExamReportExam_report_key(GetExamReportExam_report_keyRequest getExamReportExam_report_keyRequest) {
        HttpResponseHandler<GetExamReportExam_report_keyResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExamReportExam_report_keyResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetExamReportExam_report_keyRequest, GetExamReportExam_report_keyResult>()
                .withMarshaller(new GetExamReportExam_report_keyRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getExamReportExam_report_keyRequest));
    }

    /**
     * @param postExamReportClassRequest
     * @return Result of the PostExamReportClass operation returned by the service.
     * @sample ExamReportService.PostExamReportClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/PostExamReportClass"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostExamReportClassResult postExamReportClass(PostExamReportClassRequest postExamReportClassRequest) {
        HttpResponseHandler<PostExamReportClassResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostExamReportClassResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostExamReportClassRequest, PostExamReportClassResult>()
                .withMarshaller(new PostExamReportClassRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postExamReportClassRequest));
    }

    /**
     * @param postExamReportStudentRequest
     * @return Result of the PostExamReportStudent operation returned by the service.
     * @sample ExamReportService.PostExamReportStudent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/PostExamReportStudent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostExamReportStudentResult postExamReportStudent(PostExamReportStudentRequest postExamReportStudentRequest) {
        HttpResponseHandler<PostExamReportStudentResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostExamReportStudentResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostExamReportStudentRequest, PostExamReportStudentResult>()
                .withMarshaller(new PostExamReportStudentRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postExamReportStudentRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
