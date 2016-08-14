package busbooking.domain;

import javax.persistence.*;

import java.io.Serializable;



/**
 * Created by Cornelious on 7/30/2016.
 */
@Entity
public class Passenger implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    @Embedded
    private  PassengerAddress objAdress;
    private Passenger(PassengerBuilder objBuilder)
    {
        this.id=objBuilder.id;
        this.name=objBuilder.name;
        this.lastName=objBuilder.lastName;
        this.objAdress=objBuilder.objAdress;
    }
    private  Passenger(){}
    public Long getId(){
    return id;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public PassengerAddress getObjAdress() {
        return objAdress;
    }

    public static class PassengerBuilder
    {
        private Long id;
        private String name;
        private String lastName;
        private  PassengerAddress objAdress;

        public PassengerBuilder id(Long id)
        {
            this.id=id;
            return this;
        }

        public PassengerBuilder name(String name)
        {
            this.name=name;
            return this;
        }
        public PassengerBuilder lastName(String lastName)
        {
            this.lastName=lastName;
            return this;
        }
        public PassengerBuilder address(PassengerAddress objAdress)
        {
            this.objAdress=objAdress;
            return this;
        }
        public PassengerBuilder copy(Passenger objPassenger)
        {
            this.id=objPassenger.id;
            this.name=objPassenger.name;
            this.lastName=objPassenger.lastName;
            this.objAdress=objPassenger.objAdress;
            return  this;
        }
        public Passenger build()
        {
            return new Passenger(this);
        }


    }


}
