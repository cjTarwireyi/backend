package busbooking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Entity
public class EmployeeEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String idNumber;
    private String empName;
    private String empLastName;
    @Embedded
    private EmployeeAddress objAddress;


    private EmployeeEntity(EmployeeBuilder objEmployeeBuilder)
    {
        this.id =objEmployeeBuilder.id;
        this.idNumber =objEmployeeBuilder.idNumber;
        this.empName=objEmployeeBuilder.empName;
        this.empLastName=objEmployeeBuilder.empLastName;
        this.objAddress=objEmployeeBuilder.objAddress;
    }
private  EmployeeEntity(){}
    public Long getId() {
        return id;
    }

    public String getEmpId() {
        return idNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public EmployeeAddress getObjAddress() {
        return objAddress;
    }

    public static class EmployeeBuilder
    {
        private Long id;
        private String idNumber;
        private String empName;
        private String empLastName;
        private EmployeeAddress objAddress;

        public EmployeeBuilder id(Long id)
        {
            this.id=id;
            return  this;
        }

        public EmployeeBuilder idNumber(String idNumber)
        {
            this.idNumber= idNumber;
            return this ;
        }
        public EmployeeBuilder name(String empName)
        {
            this.empName=empName;
            return this;
        }
        public EmployeeBuilder lastName(String emplastName)
        {
            this.empLastName=emplastName;
            return this;
        }
        public EmployeeBuilder address(EmployeeAddress objAddress){
            this.objAddress=objAddress;
            return this;
        }
        public EmployeeBuilder copy(EmployeeEntity empValue)
        {
            this.id=empValue.id;
            this.idNumber=empValue.idNumber;
            this.empName=empValue.empName;
            this.empLastName=empValue.empLastName;
            this.objAddress=empValue.objAddress;
            return this;
        }

        public EmployeeEntity build()
        {
            return new EmployeeEntity(this);
        }

    }
    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
