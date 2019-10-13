package com.yedam;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCell = new DmbCellphone("S10", "white", 10);
		System.out.println("model:" + dmbCell.model);//부모필드
		System.out.println("color:" + dmbCell.color);// "
		System.out.println("channel" + dmbCell.channel);//자기자신
		dmbCell.powerOn();
		dmbCell.turnOnDmb();
		dmbCell.turnOffDmb();
		dmbCell.powerOff();
	}

}
