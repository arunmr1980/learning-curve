/**
 * null
 */
package com.gc.examreport;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.gc.examreport.ExamReportService}.
 * 
 * @see com.gc.examreport.ExamReportService#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ExamReportServiceClientBuilder extends SdkSyncClientBuilder<ExamReportServiceClientBuilder, ExamReportService> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("5g6rbncf2d.execute-api.us-west-2.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-west-2";

    /**
     * Package private constructor - builder should be created via {@link ExamReportService#builder()}
     */
    ExamReportServiceClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of ExamReportService using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ExamReportService.
     */
    @Override
    protected ExamReportService build(AwsSyncClientParams params) {
        return new ExamReportServiceClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
