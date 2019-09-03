package project;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader extends Main{

	//file reader that will take the given .csv file and turn it into an array
	@SuppressWarnings("resource")
	public static String[] csv(String[] stationStops) {
		String file = "CTAStops.csv";
		BufferedReader r = null;
		String line = "";
		String splt = " , ";
		
		try {
			r = new BufferedReader(new FileReader(file));
			while ((line = r.readLine()) != null) {
				stationStops = line.split(splt);
				System.out.println(stationStops);
				return stationStops;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stationStops;
		
	}

}
