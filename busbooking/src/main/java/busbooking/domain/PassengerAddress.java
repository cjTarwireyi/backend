package busbooking.domain;

import javax.persistence.Embeddable;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Embeddable
public class PassengerAddress {

    private String street;
    private String city;
    private String code;
    private PassengerAddress(AddressBuilder objAddressBuilder)
    {
        this.street=objAddressBuilder.street;
        this.city=objAddressBuilder.city;
        this.code=objAddressBuilder.code;
    }
    private PassengerAddress(){}
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


        public AddressBuilder copy(PassengerAddress addressValues)
        {
            this.street=addressValues.street;
            this.city=addressValues.city;
            this.code=addressValues.code;


            return this;
        }

        public PassengerAddress build()
        {
            return new PassengerAddress(this);
        }
    }

}
