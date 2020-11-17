/**
 * null
 */
package com.gc.examreport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-17T12:33:27Z/GetExamReportExam_report_key"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExamReportExam_report_keyResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private StudentReport studentReport;

    /**
     * @param studentReport
     */

    public void setStudentReport(StudentReport studentReport) {
        this.studentReport = studentReport;
    }

    /**
     * @return
     */

    public StudentReport getStudentReport() {
        return this.studentReport;
    }

    /**
     * @param studentReport
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExamReportExam_report_keyResult studentReport(StudentReport studentReport) {
        setStudentReport(studentReport);
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
        if (getStudentReport() != null)
            sb.append("StudentReport: ").append(getStudentReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExamReportExam_report_keyResult == false)
            return false;
        GetExamReportExam_report_keyResult other = (GetExamReportExam_report_keyResult) obj;
        if (other.getStudentReport() == null ^ this.getStudentReport() == null)
            return false;
        if (other.getStudentReport() != null && other.getStudentReport().equals(this.getStudentReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudentReport() == null) ? 0 : getStudentReport().hashCode());
        return hashCode;
    }

    @Override
    public GetExamReportExam_report_keyResult clone() {
        try {
            return (GetExamReportExam_report_keyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
