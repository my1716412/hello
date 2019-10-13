package com.mycompany.ymy;

public class Circle {
	private double radius;
	public void setRadius(double radius) {
		if(radius <0 )
			this.radius = 0;
		else
        	this.radius = radius;
		
	}
	public double getRadius() {
		return this.radius;
	}
	
	double getArea() {
		return Math.PI * radius  * radius;
	}

}
