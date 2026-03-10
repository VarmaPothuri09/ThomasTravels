package com;
import java.util.Arrays;
public class TestDriver {
public static void main(String[] args) {
	  Driver driver1 = new Driver("Car",181188,"Virat",10000);
	    Driver driver2=new Driver("Car",300486,"Rohit",8000);
	    Driver driver3= new Driver("Auto",700783,"Mahi",6000);
	    Driver driver4=new Driver("Bike",900804,"Varma",7000);
	    Driver driver5=new Driver("Auto",311203,"Sai",31000);
	    Driver driver6=new Driver("Auto",160905,"Mani",5000);
	    Driver driver7=new Driver("Car",290405,"Ganesh",2000);
	    Driver driver8=new Driver("Bike",250202,"Vinay",3000);
	    Driver driver9=new Driver("Car",220404,"Lucky",4000);
		
		
		Driver[] driverArr=new Driver[9];
		driverArr[0]=driver1;
		driverArr[1]=driver2;
		driverArr[2]=driver3;
		driverArr[3]=driver4;
		driverArr[4]=driver5;
		driverArr[5]=driver6;
		driverArr[6]=driver7; 
		driverArr[7]=driver8;
		driverArr[8]=driver9;
		
		
		Travel travel=new Travel();
		System.out.println("Is Car Driver:");
		System.out.println(travel.isCarDriver(driver1));
		System.out.println(); 
		
		System.out.println("Driver Details by ID:");
		System.out.println(travel.retrieveByDriverId(driverArr, 181188));
		System.out.println();
		
		System.out.println("Driver Count:");
		System.out.println(travel.retrieveCountOfDrivers(driverArr, "Auto"));
		System.out.println();
		
		System.out.println("Driver Array:");
		Driver[] drivers = travel.retrieveDriver(driverArr, "Car");
		System.out.println(Arrays.toString(drivers));
		System.out.println();
		
		System.out.println("Maximum Distance Travelled Driver:");
		System.out.println(travel.retrieveMaximumDistanceTravelledDriver(driverArr));
		System.out.println();
}

	
}        

