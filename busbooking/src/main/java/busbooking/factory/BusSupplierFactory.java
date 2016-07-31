package busbooking.factory;

import busbooking.domain.BusSupplier;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class BusSupplierFactory {
    public static BusSupplier createSupplier(String name,String contactNumber){
        return new BusSupplier.SupplierBuilder()
                .name(name)
                .contactNumber(contactNumber)
                .build();
    }
}
