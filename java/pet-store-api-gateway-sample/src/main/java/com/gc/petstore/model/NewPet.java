/**
 * null
 */
package com.gc.petstore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bl8u6h465k-2020-11-14T10:31:13Z/NewPet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewPet implements Serializable, Cloneable, StructuredPojo {

    private Double price;

    private String type;

    /**
     * @param price
     */

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return
     */

    public Double getPrice() {
        return this.price;
    }

    /**
     * @param price
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPet price(Double price) {
        setPrice(price);
        return this;
    }

    /**
     * @param type
     * @see PetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see PetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PetType
     */

    public NewPet type(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @see PetType
     */

    public void setType(PetType type) {
        type(type);
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PetType
     */

    public NewPet type(PetType type) {
        this.type = type.toString();
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
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewPet == false)
            return false;
        NewPet other = (NewPet) obj;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NewPet clone() {
        try {
            return (NewPet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.gc.petstore.model.transform.NewPetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
