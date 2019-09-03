package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//this class will be the main class from which all methods will be executed
	//it allows the user to input and receive information on CTA stops
	protected static ArrayList<CTAStation> array;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		array = new ArrayList<CTAStation>();
		Main cta = new CSVReader();
		CTAStation station = new CTAStops();
		CTAStops train = new CTAStops(array);
		
		Scanner menu = new Scanner(System.in);
		System.out.print("Choose a letter a through f (a - add station, b - modify station, c - remove station, d - name search, e - lat/long search, f - exit): ");
		String input = menu.nextLine();
		
		Scanner pick = new Scanner(System.in);
		
		boolean done = true;
		int c = 0;
		do {
			if (input.equalsIgnoreCase("a")) {
				c = 1;
			}else if(input.equalsIgnoreCase("b")) {
				c = 2;
			}else if(input.equalsIgnoreCase("c")) {
				c = 3;
			}else if(input.equalsIgnoreCase("d")) {
				c = 4;
			}else if(input.equalsIgnoreCase("e")) {
				c = 5;
			}else if (input.equalsIgnoreCase("f")) {
				c = 6;
			}
		}while(done);
		
		switch(c) {
		case 1:
			System.out.println("Enter a station, including the name, latitude, longitude, location, wheelchair accissibility, and color (red, green, blue, brown, purple, pink, orange, and yellow: enter -1 if it doesn't exist in a color): ");
			CTAStation addi = new CTAStation(pick.nextLine(), Double.parseDouble(pick.nextLine()), Double.parseDouble(pick.nextLine()), pick.nextLine(), pick.nextBoolean(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt());
			train.addStation(addi);
			break;
		case 2:
			System.out.println("Enter the name of the station you want to modify: ");
			CTAStation mod = new CTAStation(pick.nextLine(), Double.parseDouble(pick.nextLine()), Double.parseDouble(pick.nextLine()), pick.nextLine(), pick.nextBoolean(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt(), pick.nextInt());
			train.modifyStation(mod);
			break;
		case 3:
			System.out.println("Enter the name of the station you want to remove: ");
			String fnr = pick.nextLine();
			train.removeStation(fnr);
			break;
		case 4:
			System.out.print("Enter a station name: ");
			String n = pick.nextLine();
			train.searchName(n);
			break;
		case 5:
			String lat;
			String lng;
			System.out.println("Enter a latitude: ");
			lat = pick.nextLine();
			System.out.println("Enter a longitude: ");
			lng = pick.nextLine();
			CTAStation coord = new CTAStation(null, Double.parseDouble(lat), Double.parseDouble(lng), null, false, -1, -1, -1, -1, -1, -1, -1, -1);
			train.findNearest(coord);
			break;
		case 6:
			System.out.println("Goodbye.");
			break;
		default:
			System.out.println("Try again.");
		}
		
		menu.close();
		pick.close();


	}

}

