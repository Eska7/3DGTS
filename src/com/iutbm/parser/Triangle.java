package com.iutbm.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Triangle {
	private FloatBuffer vertexBuffer;
	static final int COORDS_PER_VERTEX = 3;

	float color[] = { 0.63671875f, 0.76953125f, 0.22265625f, 1.0f };

	private float triangleCoords[];
	// private static float triangleCoords[] = {
	// 0.0f, 0.622008459f, 0.0f, // top
	// -0.5f, -0.311004243f, 0.0f, // bottom left
	// 0.5f, -0.311004243f, 0.0f // bottom right
	// };

	private Edge a, b, c;

	public Triangle(Edge a, Edge b, Edge c) {
		this.a = a;
		this.b = b;
		this.c = c;

		triangleCoords = new float[9];

		triangleCoords[0] = (float) a.getA().getX();
		triangleCoords[1] = (float) a.getA().getY();
		triangleCoords[2] = (float) a.getA().getZ();
		
		triangleCoords[3] = (float) a.getB().getX();
		triangleCoords[4] = (float) a.getB().getY();
		triangleCoords[5] = (float) a.getB().getZ();
		
		triangleCoords[6] = (float) b.getB().getX();
		triangleCoords[7] = (float) b.getB().getY();
		triangleCoords[8] = (float) b.getB().getZ();

		for (int i = 0; i < 9; i += 1) {
			System.out.print(triangleCoords[i] + " ");
			if (i % 3 == 0)
				System.out.println();
		}

		ByteBuffer bb = ByteBuffer.allocateDirect(triangleCoords.length * 4);
		bb.order(ByteOrder.nativeOrder());

		vertexBuffer = bb.asFloatBuffer();
		vertexBuffer.put(triangleCoords);
		vertexBuffer.position(0);
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
