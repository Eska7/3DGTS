package com.iutbm.parser;

public class Triangle {
	private Edge a, b, c;

	public Triangle(Edge a, Edge b, Edge c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Edge getA() {
		return a;
	}

	public void setA(Edge a) {
		this.a = a;
	}

	public Edge getB() {
		return b;
	}

	public void setB(Edge b) {
		this.b = b;
	}

	public Edge getC() {
		return c;
	}

	public void setC(Edge c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "Triangle\n[" + a + ", " + b + ", " + c + "\n]";
	}
}
