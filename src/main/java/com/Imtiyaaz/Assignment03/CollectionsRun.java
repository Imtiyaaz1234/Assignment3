package com.Imtiyaaz.Assignment03;
import java.util.*;
/**
 * Created by imtiyaaz on 2017/03/25.
 */
public class CollectionsRun {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        HashSet<String> setAb = new HashSet<String>();
        HashMap<String, String> mapA = new HashMap<String, String>();
        Collection<String> vehiclesAb = new HashSet<String>();


        Collections carsObject = new Collections();
        Collections carsObject2 = new Collections();
        Collections carsObject3= new Collections();
        Collections carsObject4 = new Collections();
        Collections carsObject5 = new Collections();
        carsObject.setVehicle("Toyota", "Corolla", 1996);
        carsObject2.setVehicle("Golf", "G7", 2016);
        carsObject3.setVehicle("Lamborghini", "Hurcan", 2014);
        carsObject4.setVehicle("Nissan", "GTR", 2015);
        carsObject5.setVehicle("Mercedes", "C63s AMG", 2016);
        cars.add(carsObject.toString());
        cars.add(carsObject2.toString());
        cars.add(carsObject3.toString());
        cars.add(carsObject4.toString());
        cars.add(carsObject5.toString());


        Collections bikeObject1 = new Collections();
        Collections bikeObject2 = new Collections();
        Collections bikeObject3 = new Collections();
        Collections bikeObject4 = new Collections();
        bikeObject1.setVehicle("Honda", "Fireblade", 2015);
        bikeObject2.setVehicle("BMW", "S1000rr", 2014);
        bikeObject3.setVehicle("Yamaha", "R1", 2014);
        bikeObject4.setVehicle("Kawasaki", "Ninja ZX-10", 2015);
        setAb.add(bikeObject1.toString());
        setAb.add(bikeObject2.toString());
        setAb.add(bikeObject3.toString());
        setAb.add(bikeObject4.toString());


        mapA.put("1",bikeObject1.toString());
        mapA.put("2", carsObject.toString());
        mapA.put("3", bikeObject2.toString());
        mapA.put("4", carsObject5.toString());
        String[] mapElements = new String[4];
        mapElements[0] = (String) mapA.get("1");
        mapElements[1] = (String) mapA.get("2");
        mapElements[2] = (String) mapA.get("3");
        mapElements[3] = (String) mapA.get("4");


        vehiclesAb.add(carsObject2.toString());
        vehiclesAb.add(bikeObject3.toString());
        vehiclesAb.add(carsObject3.toString());
        vehiclesAb.add(bikeObject4.toString());
        vehiclesAb.add(carsObject4.toString());
        vehiclesAb.toArray();
        System.out.println("This is an ArrayList collection");
        for( int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }
        System.out.println("\n\nThis is a HashSet collection");
        for(int j = 0; j < setAb.size(); j++)
        {
            System.out.println(setAb);
        }
        System.out.println("\n\nThis is a Map collection");
        for(int k = 0; k < mapElements.length; k++)
        {
            System.out.println(mapElements[k]);
        }

        System.out.println("\n\nThis is a generic Collection");
        for(int k = 0; k < mapElements.length; k++)
        {
            System.out.println(vehicles);
        }
    }
}
