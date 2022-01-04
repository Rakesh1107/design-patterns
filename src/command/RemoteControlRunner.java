package command;

import javax.crypto.Mac;

public class RemoteControlRunner { // this is the client
    public static void main(String[] args) {
//        SimpleRemoteControl remoteControl = new SimpleRemoteControl(); // Invoker
//        Light light = new Light("Living room"); // The receiver knows how to perform the work
//        LightOnCommand lightOnCommand = new LightOnCommand(light); // Creating a command and setting its receiver
//        remoteControl.setCommand(lightOnCommand); // the Invoker holds a command and at some point asks
//        remoteControl.buttonPressed();
//
//        GarageDoor garageDoor = new GarageDoor(); // receiver
//        GarageDoorUpCommand garageDoorOpenCommand = new GarageDoorUpCommand(garageDoor); // command
//        remoteControl.setCommand(garageDoorOpenCommand);
//        remoteControl.buttonPressed();

        RemoteControl remoteControl = new RemoteControl(); // invoker

        // Receivers
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor2 = new GarageDoor();
//        Stereo stereo = new Stereo("Living Room");
//
//        // Commands
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor2);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor2);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//        // Invoker - Slots
//        remoteControl1.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl1.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl1.setCommand(2, ceilingFanOn, ceilingFanOff);
//        remoteControl1.setCommand(3, garageDoorUp, garageDoorDown);
//        remoteControl1.setCommand(4, stereoOnWithCD, stereoOff);
//
//        System.out.println(remoteControl1);
//
//        remoteControl1.onButtonWasPushed(0);
//        remoteControl1.onButtonWasPushed(1);
//        remoteControl1.onButtonWasPushed(2);
//        remoteControl1.onButtonWasPushed(3);
//        remoteControl1.onButtonWasPushed(4);
//
//        remoteControl1.offButtonWasPushed(0);
//        remoteControl1.offButtonWasPushed(1);
//        remoteControl1.offButtonWasPushed(2);
//        remoteControl1.offButtonWasPushed(3);
//        remoteControl1.offButtonWasPushed(4);
//
//        remoteControl1.onButtonWasPushed(0);
//        remoteControl1.offButtonWasPushed(0);
//        System.out.println(remoteControl1);
//        remoteControl1.undoButtonPressed();
//
//        remoteControl1.offButtonWasPushed(0);
//        remoteControl1.onButtonWasPushed(0);
//        System.out.println(remoteControl1);
//        remoteControl1.undoButtonPressed();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonPressed();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] onCommands = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] offCommands = {lightOff, stereoOff, tvOff, hottubOff};
        MacroCommand partyOn = new MacroCommand(onCommands);
        MacroCommand partyOff = new MacroCommand(offCommands);

        remoteControl.setCommand(0, partyOn, partyOff);
        System.out.println(remoteControl);
        System.out.println("<--Party mode on-->");
        remoteControl.onButtonWasPushed(0);
        System.out.println("<--Party mode off-->");
        remoteControl.offButtonWasPushed(0);

    }
}
