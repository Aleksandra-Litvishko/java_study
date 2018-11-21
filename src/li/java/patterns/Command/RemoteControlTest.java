package li.java.patterns.Command;

public class RemoteControlTest {
	public static void main(String args[]) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		remote.setCommand(lightOnCommand);
		lightOnCommand.execute();
	}
}
