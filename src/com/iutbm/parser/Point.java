package com.iutbm.parser;

public class Point {
	private double x, y, z;
	
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "\n\t\tPoint\n\t\t[\n\t\t\t" + x + ",\n\t\t\t" + y + ",\n\t\t\t" + z + "\n\t\t]";
	}
}
