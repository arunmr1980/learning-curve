/**
 * null
 */
package com.gc.examreport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/PostExamReportClass"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExamReportClassRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private ClassFinalReportModel classFinalReportModel;

    /**
     * @param classFinalReportModel
     */

    public void setClassFinalReportModel(ClassFinalReportModel classFinalReportModel) {
        this.classFinalReportModel = classFinalReportModel;
    }

    /**
     * @return
     */

    public ClassFinalReportModel getClassFinalReportModel() {
        return this.classFinalReportModel;
    }

    /**
     * @param classFinalReportModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostExamReportClassRequest classFinalReportModel(ClassFinalReportModel classFinalReportModel) {
        setClassFinalReportModel(classFinalReportModel);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClassFinalReportModel() != null)
            sb.append("ClassFinalReportModel: ").append(getClassFinalReportModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostExamReportClassRequest == false)
            return false;
        PostExamReportClassRequest other = (PostExamReportClassRequest) obj;
        if (other.getClassFinalReportModel() == null ^ this.getClassFinalReportModel() == null)
            return false;
        if (other.getClassFinalReportModel() != null && other.getClassFinalReportModel().equals(this.getClassFinalReportModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassFinalReportModel() == null) ? 0 : getClassFinalReportModel().hashCode());
        return hashCode;
    }

    @Override
    public PostExamReportClassRequest clone() {
        return (PostExamReportClassRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostExamReportClassRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
