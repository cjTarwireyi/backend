package busbooking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Cornelious on 8/6/2016.
 */
@Entity
public class Account implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;

    public Account(AccountBuilder accountBuilder){
        this.id=accountBuilder.id;
        this.username=accountBuilder.username;
        this.password=accountBuilder.password;
    }
    public Account(){}

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class AccountBuilder{
        private  Long id;
        private String username;
        private String password;

        public AccountBuilder id(Long id){
            this.id=id;
            return  this;
        }
        public AccountBuilder username(String username){
            this.username= username;
            return this;
        }
        public AccountBuilder password(String password){
            this.password=password;
            return  this;
        }
        public AccountBuilder copy(Account account){
            this.id=account.id;
            this.username=account.username;
            this.password=account.password;
            return  this;
        }

        public Account build(){
            return  new Account(this);
        }


        @Override
        public int hashCode() {
            return (int) (id ^ (id >>> 32));
        }

    }

}
