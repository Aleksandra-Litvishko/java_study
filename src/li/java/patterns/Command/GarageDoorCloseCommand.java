package li.java.patterns.Command;

public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;
	
	GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.down();
	}
	
	public void undo() {
		garageDoor.up();
	}
}
