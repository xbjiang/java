package interfaces.music5;
import polymorphism.music.Note;

interface Instrument {
	int Value = 5; // static & final
	void play(Note n); //Automatically public 
	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {return "Wind";}
	public void adjust() {System.out.println(this + ".adjust()");}
}

class Percussion implements Instrument {
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	public String toString() {return "Percussion";}
	public void adjust() {System.out.println(this + ".adjust()");}
}

public class Music5 {

}
