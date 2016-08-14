package busbooking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Entity
public class BusSupplier implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String contactNumber;

    public BusSupplier(SupplierBuilder suplierBuilder){
        this.id=suplierBuilder.id;
        this.name=suplierBuilder.name;
        this.contactNumber=suplierBuilder.contactNumber;
    }
    private BusSupplier(){}
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    public static class SupplierBuilder{
        private  Long id;
        private String name;
        private String contactNumber;

        public SupplierBuilder id(Long id){
            this.id=id;
            return  this;
        }
        public SupplierBuilder name(String name){
            this.name=name;
            return  this;
        }
        public SupplierBuilder contactNumber(String contactNumber){
            this.contactNumber=contactNumber;
            return this;
        }
        public SupplierBuilder copy(BusSupplier supplier){
            this.id=supplier.id;
            this.name=supplier.name;
            this.contactNumber=supplier.contactNumber;
            return  this;
        }
        public BusSupplier build(){
            return new BusSupplier(this);
        }
    }

}
