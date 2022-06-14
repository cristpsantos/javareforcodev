package entities;

public class DataPeople {

	private double height;
	private char genre;
	
	public DataPeople(double height, char genre) {
		this.height = height;
		this.genre = genre;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}
}
