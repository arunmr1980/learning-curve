/**
 * null
 */
package com.gc.examreport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/PostExamReportStudent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExamReportStudentRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private StudentReportModel studentReportModel;

    /**
     * @param studentReportModel
     */

    public void setStudentReportModel(StudentReportModel studentReportModel) {
        this.studentReportModel = studentReportModel;
    }

    /**
     * @return
     */

    public StudentReportModel getStudentReportModel() {
        return this.studentReportModel;
    }

    /**
     * @param studentReportModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostExamReportStudentRequest studentReportModel(StudentReportModel studentReportModel) {
        setStudentReportModel(studentReportModel);
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
        if (getStudentReportModel() != null)
            sb.append("StudentReportModel: ").append(getStudentReportModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostExamReportStudentRequest == false)
            return false;
        PostExamReportStudentRequest other = (PostExamReportStudentRequest) obj;
        if (other.getStudentReportModel() == null ^ this.getStudentReportModel() == null)
            return false;
        if (other.getStudentReportModel() != null && other.getStudentReportModel().equals(this.getStudentReportModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudentReportModel() == null) ? 0 : getStudentReportModel().hashCode());
        return hashCode;
    }

    @Override
    public PostExamReportStudentRequest clone() {
        return (PostExamReportStudentRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostExamReportStudentRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
