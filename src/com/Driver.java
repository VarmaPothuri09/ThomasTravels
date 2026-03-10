package com;

public class Driver {
	private String category;
  private int driverId;
  private String driverName;
  private int totalDistance;
  Driver(){
	  
  }
  Driver(String category,int driverId,String driverName,int totalDistance){
	  this.category=category;
	  this.driverId=driverId;
	  this.driverName=driverName;
	  this.totalDistance=totalDistance;
	  
  }public String getCategory() {
	  return category;
  }
  public int getDriverId() {
	  return driverId;
  }
  public String getDriverName() {
	  return driverName;
  }
  public int getTotalDistance() {
	  return totalDistance;
  }
  
    public void setCategory(String category) {
	  this.category=category;
  }
    public void setDriverId(int driverId) {
    	this.driverId=driverId;
    	
    }public void setDriverName(String driverName) {
    	this.driverName=driverName;
    }
	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	public String toString() {
		return "ID: " + driverId + " | Name: " + driverName;
	}
}