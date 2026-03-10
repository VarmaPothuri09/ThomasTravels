package com;

import java.util.Arrays;

public class Travel {
   boolean isCarDriver(Driver driver1) {
	   if(driver1.getCategory().equals("Car")){
	   return true;
	   }
	  
	   return false;
	   }
   
  String retrieveByDriverId(Driver[] driverArr,int driverId){
	     for(int i=0;i<driverArr.length;i++) {
	    	 if(driverArr[i]!=null && driverArr[i].getDriverId()==driverId) {
	    		 return "Driver name is " + driverArr[i].getDriverName()+ " Belonging to the category "+ driverArr[i].getCategory()+" traveled "+driverArr[i].getTotalDistance()+"KM so far.";
	    	 }
	    	 
	     }
	     return " Driver id"+driverId +"not found"; 
   }
  int retrieveCountOfDrivers(Driver[] driverArr, String category ) {
	     int count=0;
	     for(int i=0;i<driverArr.length;i++) {
	    	 if(driverArr[i]!=null && driverArr[i].getCategory().equals(category)) {
	    		 count++;
	    	 }
	    	
	     }
	    return count;
  }
  Driver[] retrieveDriver(Driver[] driverArr, String category) {
	   Driver[] tempArr=new Driver[driverArr.length];
	   int index=0;
	   for(int i=0;i<driverArr.length;i++) {
		   if(driverArr[i]!=null && driverArr[i].getCategory().equals(category)) {
			   tempArr[index]=driverArr[i];
			   index++;
		   }
		  
	   }
	   return tempArr;
  }
  Driver retrieveMaximumDistanceTravelledDriver(Driver[] driverArr) {
	  int maxDistance=0;
	  Driver maxDriver=null;
	  for(int i=0;i<driverArr.length;i++) {
		  if(driverArr[i]!=null && driverArr[i].getTotalDistance()>maxDistance) {
			  maxDistance=driverArr[i].getTotalDistance();
			  maxDriver=driverArr[i];
			 
		  }
		  
	  }
	 return maxDriver;
	  
	  
  }
  
}