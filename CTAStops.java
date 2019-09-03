package project;

import java.util.ArrayList;
import java.util.Scanner;

public class CTAStops extends CTAStation{
	protected ArrayList<CTAStation> stops = new ArrayList<>();
	Scanner ctastop = new Scanner(System.in);
	
	//creates an array list of stops with the CTAStation UML format
	public CTAStops() {
		stops = new ArrayList<>();
	}
	
	//adds stops to an array list
	public CTAStops(ArrayList<CTAStation> list) {
		for (int i = 0; i < list.size(); i++) {
			stops.add(i, list.get(i));
		}
	}
	
	public ArrayList<CTAStation> getStops(){
		return stops;
	}
	
	//adds stops one by one to an array list
	public void setStops(ArrayList<CTAStation> stop){
		for (int i = 0; i < stop.size(); i++) {
			stop.set(i, stop.get(i));
		}
	}
	
	//allows the user to add a station to the list of CTA stations
	public void addStation(CTAStation stat) {
		stops.add(stat);
	}
	
	//replaces a chosen station with a modified version of it
	public void modifyStation(CTAStation change) {
		int temp = 0;
		String na = change.getName();
		
		for (int i = 0; i < stops.size(); i++) {
			if (na.equalsIgnoreCase((stops.get(i).getName()))){
				CTAStation changed = new CTAStation();
				stops.remove(changed);
				stops.add(change);
			}else {
				System.out.println("This station does not exist.");
			}
		}
	}
	
	//removes a station from the array list
	public void removeStation(String rem) {
		for (int i = 0; i < stops.size(); i++) {
			if (rem.equalsIgnoreCase((stops.get(i).getName()))) {
				int number = stops.indexOf(rem);
				stops.remove(number);
			}else {
				System.out.println("This station does not exist.");
			}
		}
	}
	
	//takes the input name by a user and finds it in the array list
	public void searchName(String Name) {
		int temp = 0;
		for (int i = 0; i < stops.size(); i++) {
			if (Name.equalsIgnoreCase((stops.get(i).getName()))){
				Main namesearch = new Main();
				System.out.println(namesearch.toString());
				temp = i;
			}
		}
	}
	
	//uses the input latitude and longitude, and it returns the closest CTA station to it
	public void findNearest(CTAStation coordinate) {
		double min;
		double min2;
		for (int i = 0; i < stops.size(); i++) {
			CTAStation first = new CTAStation();
			first.equals(stops.get(i));
			min = stops.get(0).calcDistance(coordinate, first);
			for (int j = i + 1; j < stops.size(); j++) {
				CTAStation second = new CTAStation();
				second.equals(stops.get(j));
				min2 = stops.get(0).calcDistance(coordinate, second);
				if (min < min2) {
					System.out.println("The nearest station is " + first);
				}else if (min2 < min) {
					System.out.println("The nearest station is " + second);
				}
			}
		}
	}

}