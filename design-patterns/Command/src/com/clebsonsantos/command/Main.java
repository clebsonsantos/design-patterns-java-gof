package com.clebsonsantos.command;

import com.clebsonsantos.command.devices.Light;
import com.clebsonsantos.command.devices.LightOffCommand;
import com.clebsonsantos.command.devices.LightOnCommand;

public class Main {
  public static void main(String[] args) {
    // Crie dispositivos eletrônicos
    Light light = new Light();

    // Crie comandos para ligar e desligar a lâmpada
    Command lightOn = new LightOnCommand(light);
    Command lightOff = new LightOffCommand(light);

    // Crie um controle remoto
    RemoteControl remoteControl = new RemoteControl();

    // Configure o controle remoto com comandos
    remoteControl.setCommand(lightOn);

    // Pressione o botão para ligar a luz
    remoteControl.pressButton();

    // Configure o controle remoto com o comando para desligar a luz
    remoteControl.setCommand(lightOff);

    // Pressione o botão para desligar a luz
    remoteControl.pressButton();
  }
}
