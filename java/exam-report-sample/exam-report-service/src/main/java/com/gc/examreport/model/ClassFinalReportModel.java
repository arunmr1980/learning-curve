/**
 * null
 */
package com.gc.examreport.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/ClassFinalReportModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassFinalReportModel implements Serializable, Cloneable, StructuredPojo {

    private String classKey;

    private String division;

    /**
     * @param classKey
     */

    public void setClassKey(String classKey) {
        this.classKey = classKey;
    }

    /**
     * @return
     */

    public String getClassKey() {
        return this.classKey;
    }

    /**
     * @param classKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassFinalReportModel classKey(String classKey) {
        setClassKey(classKey);
        return this;
    }

    /**
     * @param division
     */

    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * @return
     */

    public String getDivision() {
        return this.division;
    }

    /**
     * @param division
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassFinalReportModel division(String division) {
        setDivision(division);
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
        if (getClassKey() != null)
            sb.append("ClassKey: ").append(getClassKey()).append(",");
        if (getDivision() != null)
            sb.append("Division: ").append(getDivision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassFinalReportModel == false)
            return false;
        ClassFinalReportModel other = (ClassFinalReportModel) obj;
        if (other.getClassKey() == null ^ this.getClassKey() == null)
            return false;
        if (other.getClassKey() != null && other.getClassKey().equals(this.getClassKey()) == false)
            return false;
        if (other.getDivision() == null ^ this.getDivision() == null)
            return false;
        if (other.getDivision() != null && other.getDivision().equals(this.getDivision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassKey() == null) ? 0 : getClassKey().hashCode());
        hashCode = prime * hashCode + ((getDivision() == null) ? 0 : getDivision().hashCode());
        return hashCode;
    }

    @Override
    public ClassFinalReportModel clone() {
        try {
            return (ClassFinalReportModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.gc.examreport.model.transform.ClassFinalReportModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
