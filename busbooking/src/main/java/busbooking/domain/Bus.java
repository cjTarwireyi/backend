package busbooking.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numberPlate;
    private int numberOfSeats;


    public Bus(BusBuilder objBusBuilder) {
        this.id = objBusBuilder.id;
        this.numberPlate = objBusBuilder.numberPlate;
        this.numberOfSeats = objBusBuilder.numberOfseats;

    }

    public Long getId() {
        return id;
    }

    public Long getBusNumber() {
        return id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public int getSeats() {
        return numberOfSeats;
    }

    public static class BusBuilder {
        private Long id;
        private String numberPlate;
        private int numberOfseats;

        public BusBuilder Id(Long id) {
            this.id = id;
            return this;
        }

        public BusBuilder getnumberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public BusBuilder seats(int numberOfSeats) {
            this.numberOfseats = numberOfSeats;
            return this;
        }

        public BusBuilder copy(Bus objBus) {
            this.id = objBus.id;
            this.numberPlate = objBus.numberPlate;
            this.numberOfseats = objBus.numberOfSeats;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }


    }
}
