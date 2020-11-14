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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/5g6rbncf2d-2020-11-09T16:35:56Z/StudentReportModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudentReportModel implements Serializable, Cloneable, StructuredPojo {

    private String academicYear;

    private String classInfoKey;

    private String division;

    private String schoolKey;

    private String studentKey;

    /**
     * @param academicYear
     */

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    /**
     * @return
     */

    public String getAcademicYear() {
        return this.academicYear;
    }

    /**
     * @param academicYear
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudentReportModel academicYear(String academicYear) {
        setAcademicYear(academicYear);
        return this;
    }

    /**
     * @param classInfoKey
     */

    public void setClassInfoKey(String classInfoKey) {
        this.classInfoKey = classInfoKey;
    }

    /**
     * @return
     */

    public String getClassInfoKey() {
        return this.classInfoKey;
    }

    /**
     * @param classInfoKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudentReportModel classInfoKey(String classInfoKey) {
        setClassInfoKey(classInfoKey);
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

    public StudentReportModel division(String division) {
        setDivision(division);
        return this;
    }

    /**
     * @param schoolKey
     */

    public void setSchoolKey(String schoolKey) {
        this.schoolKey = schoolKey;
    }

    /**
     * @return
     */

    public String getSchoolKey() {
        return this.schoolKey;
    }

    /**
     * @param schoolKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudentReportModel schoolKey(String schoolKey) {
        setSchoolKey(schoolKey);
        return this;
    }

    /**
     * @param studentKey
     */

    public void setStudentKey(String studentKey) {
        this.studentKey = studentKey;
    }

    /**
     * @return
     */

    public String getStudentKey() {
        return this.studentKey;
    }

    /**
     * @param studentKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudentReportModel studentKey(String studentKey) {
        setStudentKey(studentKey);
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
        if (getAcademicYear() != null)
            sb.append("AcademicYear: ").append(getAcademicYear()).append(",");
        if (getClassInfoKey() != null)
            sb.append("ClassInfoKey: ").append(getClassInfoKey()).append(",");
        if (getDivision() != null)
            sb.append("Division: ").append(getDivision()).append(",");
        if (getSchoolKey() != null)
            sb.append("SchoolKey: ").append(getSchoolKey()).append(",");
        if (getStudentKey() != null)
            sb.append("StudentKey: ").append(getStudentKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudentReportModel == false)
            return false;
        StudentReportModel other = (StudentReportModel) obj;
        if (other.getAcademicYear() == null ^ this.getAcademicYear() == null)
            return false;
        if (other.getAcademicYear() != null && other.getAcademicYear().equals(this.getAcademicYear()) == false)
            return false;
        if (other.getClassInfoKey() == null ^ this.getClassInfoKey() == null)
            return false;
        if (other.getClassInfoKey() != null && other.getClassInfoKey().equals(this.getClassInfoKey()) == false)
            return false;
        if (other.getDivision() == null ^ this.getDivision() == null)
            return false;
        if (other.getDivision() != null && other.getDivision().equals(this.getDivision()) == false)
            return false;
        if (other.getSchoolKey() == null ^ this.getSchoolKey() == null)
            return false;
        if (other.getSchoolKey() != null && other.getSchoolKey().equals(this.getSchoolKey()) == false)
            return false;
        if (other.getStudentKey() == null ^ this.getStudentKey() == null)
            return false;
        if (other.getStudentKey() != null && other.getStudentKey().equals(this.getStudentKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcademicYear() == null) ? 0 : getAcademicYear().hashCode());
        hashCode = prime * hashCode + ((getClassInfoKey() == null) ? 0 : getClassInfoKey().hashCode());
        hashCode = prime * hashCode + ((getDivision() == null) ? 0 : getDivision().hashCode());
        hashCode = prime * hashCode + ((getSchoolKey() == null) ? 0 : getSchoolKey().hashCode());
        hashCode = prime * hashCode + ((getStudentKey() == null) ? 0 : getStudentKey().hashCode());
        return hashCode;
    }

    @Override
    public StudentReportModel clone() {
        try {
            return (StudentReportModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.gc.examreport.model.transform.StudentReportModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
