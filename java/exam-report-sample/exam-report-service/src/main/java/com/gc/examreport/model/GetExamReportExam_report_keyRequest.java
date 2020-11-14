/**
 * null
 */
package com.gc.examreport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/GetExamReportExam_report_key"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExamReportExam_report_keyRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String examReportKey;

    /**
     * @param examReportKey
     */

    public void setExamReportKey(String examReportKey) {
        this.examReportKey = examReportKey;
    }

    /**
     * @return
     */

    public String getExamReportKey() {
        return this.examReportKey;
    }

    /**
     * @param examReportKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExamReportExam_report_keyRequest examReportKey(String examReportKey) {
        setExamReportKey(examReportKey);
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
        if (getExamReportKey() != null)
            sb.append("ExamReportKey: ").append(getExamReportKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExamReportExam_report_keyRequest == false)
            return false;
        GetExamReportExam_report_keyRequest other = (GetExamReportExam_report_keyRequest) obj;
        if (other.getExamReportKey() == null ^ this.getExamReportKey() == null)
            return false;
        if (other.getExamReportKey() != null && other.getExamReportKey().equals(this.getExamReportKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExamReportKey() == null) ? 0 : getExamReportKey().hashCode());
        return hashCode;
    }

    @Override
    public GetExamReportExam_report_keyRequest clone() {
        return (GetExamReportExam_report_keyRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetExamReportExam_report_keyRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
