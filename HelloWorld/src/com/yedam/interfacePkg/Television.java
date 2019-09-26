package com.yedam.interfacePkg;

public class Television implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("티비켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
