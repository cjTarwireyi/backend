package busbooking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Entity
public class Trip implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String departure;
    private String time;
    private String destination;


    private Trip(TripBuilder objBuilder) {
        this.id = objBuilder.id;
        this.departure = objBuilder.departure;
        this.time = objBuilder.time;
        this.destination = objBuilder.destination;
    }
    private  Trip(){}
    public Long getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }

    public String getTime() {
        return time;
    }

    public String getDestination() {
        return destination;
    }


    public static class TripBuilder {
        private String departure;
        private String time;
        private String destination;
        private Long id;


        public TripBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public TripBuilder departure(String departure) {
            this.departure = departure;
            return this;
        }

        public TripBuilder time(String time) {
            this.time = time;
            return this;
        }

        public TripBuilder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public TripBuilder copy(Trip objTrip) {
            this.id = objTrip.id;
            this.departure = objTrip.departure;
            this.time = objTrip.time;
            this.destination = objTrip.destination;
            return this;
        }

        public Trip build() {
            return new Trip(this);
        }


    }
    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}