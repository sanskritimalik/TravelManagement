package main.java.com.models;

import java.util.ArrayList;
import java.util.List;

import main.java.com.exceptions.AlreadyExistsException;

/**
 * TravelAgency - a travelAgency is an entity that can add a list of travel packages to 
 * be booked by passengers
 */
public class TravelAgency {
    private String id;
    private List<TravelPackage> travelPackages;

    public TravelAgency(String id) {
        this.id = id;
        this.travelPackages = new ArrayList<>();
    }

    public void addTravelPackage(TravelPackage travelPackage) {
         if (travelPackages.contains(travelPackage)){
          throw new AlreadyExistsException();
        }
        travelPackages.add(travelPackage);
    }
}
