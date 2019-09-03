package project;

public class CTAStation {
	private String Name;
	private double Latitude;
	private double Longitude;
	private String Location;
	private boolean Wheelchair;
	private int Red;
	private int Green;
	private int Blue;
	private int Brown;
	private int Purple;
	private int Pink;
	private int Orange;
	private int Yellow;
	
	//the following declare each class type and data in CTA Stations, in UML format
	//some will declare the data type, and some will allow for modification of the data type
	public CTAStation() {
		Name = "station";
		Latitude = 1;
		Longitude = 1;
		Location = "location";
		Wheelchair = true;
		Red = -1;
		Green = -1;
		Blue = -1;
		Brown = -1;
		Purple = -1;
		Pink = -1;
		Orange = -1;
		Yellow = -1;
	}
	
	public CTAStation(String Name, double Latitude, double Longitude, String Location, boolean Wheelchair, int Red, int Green, int Blue, int Brown, int Purple, int Pink, int Orange, int Yellow) {
		this.Name = Name;
		this.Latitude = Latitude;
		this.Longitude = Longitude;
		this.Location = Location;
		this.Wheelchair = Wheelchair;
		this.Red = Red;
		this.Green = Green;
		this.Blue = Blue;
		this.Brown = Brown;
		this.Purple = Purple;
		this.Pink = Pink;
		this.Orange = Orange;
		this.Yellow = Yellow;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public double getLatitude() {
		return Latitude;
	}
	
	public void setLatitude(double Latitude) {
		this.Latitude = Latitude;
	}
	
	public double getLongitude() {
		return Longitude;
	}
	
	public void setLongitude(double Longitude) {
		this.Longitude = Longitude;
	}
	
	public String getLocation() {
		return Location;
	}
	
	public void setLocation(String Location) {
		this.Location = Location;
	}
	
	public boolean getWheelchair() {
		return Wheelchair;
	}
	
	public void setWheelchair(boolean Wheelchair) {
		this.Wheelchair = Wheelchair;
	}
	
	public int getRed() {
		return Red;
	}
	
	public void setRed(int Red) {
		this.Red = Red;
	}
	
	public int getGreen() {
		return Green;
	}
	
	public void setGreen(int Green) {
		this.Green = Green;
	}
	
	public int getBlue() {
		return Blue;
	}
	
	public void setBlue(int Blue) {
		this.Blue = Blue;
	}
	
	public int getBrown() {
		return Brown;
	}
	
	public void setBrown(int Brown) {
		this.Brown = Brown;
	}
	
	public int getPurple() {
		return Purple;
	}
	
	public void setPurple(int Purple) {
		this.Purple = Purple;
	}
	
	public int getPink() {
		return Pink;
	}
	
	public void setPink(int Pink) {
		this.Pink = Pink;
	}
	
	public int getOrange() {
		return Orange;
	}
	
	public void setOrange(int Orange) {
		this.Orange = Orange;
	}
	
	public int getYellow() {
		return Yellow;
	}
	
	public void setYellow(int Yellow) {
		this.Yellow = Yellow;
	}
	
	public String toString() {
		return "Name: " + this.Name + "; Latitude: " + this.Latitude + "; Longitude: " + this.Longitude + "; Location: " + this.Location + "; Wheelchair: " + this.Wheelchair + "; Red: " + this.Red + "; Green: " + this.Green + "; Blue: " + this.Blue + "; Brown: " + this.Brown + "; Purple: " + this.Purple + "; Pink: " + this.Pink + "; Orange: " + this.Orange + "; Yellow: " + this.Yellow;
	}
	
	//this method makes sure that the user can include another CTAStation and allow the program to work
	public boolean equals(CTAStation other) {
		if (Name.equals(other.getName()) && Latitude == other.getLatitude() && Longitude == other.getLongitude() && Location.equals(other.getLocation()) && Wheelchair == other.getWheelchair() && Red == other.getRed() && Green == other.getGreen() && Blue == other.getBlue() && Brown == other.getBrown() && Purple == other.getPurple() && Pink == other.getPink() && Orange == other.getOrange() && Yellow == other.getYellow()){
			return true;
		}
		return false;
	}
	
	//calculates the distance between two points (latitude and longitude), which can be input by the user
	public double calcDistance(CTAStation geo1, CTAStation geo2) {
		double lat1 = geo1.getLatitude();
		double lat2 = geo2.getLatitude();
		double lng1 = geo1.getLongitude();
		double lng2 = geo2.getLongitude();
		return Math.sqrt(Math.pow(lat1-lat2, 2)+Math.pow(lng1-lng2, 2));
	}

}