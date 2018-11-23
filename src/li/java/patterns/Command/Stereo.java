package li.java.patterns.Command;

public class Stereo {
	int volume;
	
	public void on() {
		System.out.println("Stereo is on");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setCD() {
		System.out.println("Stereo is set for CD input");
	}
	
	public void setVolume(int v) {
		volume = v;
		System.out.println("Stereo volume set to " + volume);
	}
}
