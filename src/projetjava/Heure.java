package projetjava;

public class Heure {
	private int heure;
	private int minute;
	
	
	public Heure(int heure, int minute) {
		super();
		this.heure = heure;
		this.minute = minute;
	}
	
	
	public boolean EstSup (Heure heure2) {
		if (this.heure > heure2.heure) {
			return true;
		}
		else if ((this.heure == heure2.heure) & (this.minute>heure2.minute)) {
			return true;
		}
		else return false;
	}
	
	public boolean equals (Heure heure2) {
		if ((this.heure==heure2.heure)&&(this.minute==heure2.minute)) return true;
		else return false;
	}


	public int getHeure() {
		return heure;
	}


	public int getMinute() {
		return minute;
	}
	
	

}
