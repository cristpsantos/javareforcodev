package exerciciosstudent.entities;

public class Student {

	public double note1;
	public double note2;
	public double note3;
	
	public double sumNotes() {
		return note1 + note2 + note3;
	}
	
	public String toString() {
		if(sumNotes() < 60) {
			return "NOTA FINAL = " 
					+ String.format("%.2f%n", sumNotes())
					+ "FAILED" + String.format("%n")
					+ "FALTARAM " + String.format("%.2f%n", 60 - sumNotes())
					+ "PONTOS.";
		}
		return "NOTA FINAL = " 
		+ String.format("%.2f%n", sumNotes())
		+ "PASSED";
	}
}
