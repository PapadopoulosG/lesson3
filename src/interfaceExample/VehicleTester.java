package interfaceExample;
/*
to VehicleTester kathos kai to override tis toString() einai dika mou den ipirxan stin askisi
 */

public class VehicleTester {
    public static void main(String[] args)
    {

        Vehicle[] vehicles = new Vehicle[1];
        vehicles[0] = new Car("car","30", "red");
        vehicles[0].toString();
        //System.out.println(vehicles[0]);


    }
}
