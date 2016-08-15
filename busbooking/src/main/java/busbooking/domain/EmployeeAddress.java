package busbooking.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Embeddable
public class EmployeeAddress implements Serializable {


    private String street;
    private String city;
    private String code;
    private EmployeeAddress()
    {}

    public EmployeeAddress(AddressBuilder objAdressBuilder)
    {

        this.street=objAdressBuilder.street;
        this.city=objAdressBuilder.city;
        this.code=objAdressBuilder.code;
    }



    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }

    public static class AddressBuilder
    {

        private String street;
        private String city;
        private String code;



        public AddressBuilder street(String street)
        {
            this.street=street;
            return this;
        }
        public AddressBuilder city(String city)
        {
            this.city=city;
            return  this;
        }
        public AddressBuilder code(String code)
        {
            this.code=code;
            return this;
        }
        public AddressBuilder copy(EmployeeAddress addressValues)
        {

            this.street=addressValues.street;
            this.code=addressValues.code;
            this.city=addressValues.city;
            return this;
        }

        public EmployeeAddress build()
        {
            return new EmployeeAddress(this);
        }
    }

}
