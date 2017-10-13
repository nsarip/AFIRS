package com.entities;

public class FlightInfo {
int flightID;
String source;
String destination;
int totalSeats;
String planeType;
public int getFlightID() {
	return flightID;
}
public void setFlightID(int flightID) {
	this.flightID = flightID;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
public String getPlaneType() {
	return planeType;
}
public void setPlaneType(String planeType) {
	this.planeType = planeType;
}

}
