package com.yedam.interfacePkg;

public interface RemoteControl {
	//상수필드
	public static final int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}
