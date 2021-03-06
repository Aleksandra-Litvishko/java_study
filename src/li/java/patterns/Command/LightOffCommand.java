package li.java.patterns.Command;

public class LightOffCommand implements Command {
	Light light;
	
	LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
	
	public void undo() {
		light.on();
	}
}
