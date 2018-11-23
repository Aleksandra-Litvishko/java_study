package li.java.patterns.Command;

public class RemoteControlTest {
	public static void main(String args[]) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();
		CeilingFan ceilingFan = new CeilingFan("Living room");
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		GarageDoorOpenCommand garageOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageCloseCommand = new GarageDoorCloseCommand(garageDoor);
		StereoOnWithCDCommand stereoCDOnCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		
		remote.setCommand(0,lightOnCommand,lightOffCommand);
		remote.setCommand(1,garageOpenCommand,garageCloseCommand);
		remote.setCommand(2,stereoCDOnCommand,stereoOffCommand);
		remote.setCommand(3,ceilingFanMediumCommand,ceilingFanOffCommand);
		remote.setCommand(4,ceilingFanHighCommand,ceilingFanOffCommand);
		
		System.out.println(remote.toString());
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed(); //отмена
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.undoButtonWasPushed(); //отмена
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
		remote.undoButtonWasPushed(); //отмена
		
		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);
		System.out.println(remote);
		remote.undoButtonWasPushed(); //отмена
		
		remote.onButtonWasPushed(4);
		System.out.println(remote);
		remote.undoButtonWasPushed(); //отмена
	}
}