package com.iutbm.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Triangle {
	private FloatBuffer vertexBuffer;
	static final int COORDS_PER_VERTEX = 3;

	float color[] = { 0.63671875f, 0.76953125f, 0.22265625f, 1.0f };

	private float triangleCoords[];

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

		triangleCoords[0] = (float) (a.getA().getX() / 2);
		triangleCoords[1] = (float) (a.getA().getY() / 2);
		triangleCoords[2] = (float) (a.getA().getZ() / 2);

		triangleCoords[3] = (float) (a.getB().getX() / 2);
		triangleCoords[4] = (float) (a.getB().getY() / 2);
		triangleCoords[5] = (float) (a.getB().getZ() / 2);

		triangleCoords[6] = (float) (b.getB().getX() / 2);
		triangleCoords[7] = (float) (b.getB().getY() / 2);
		triangleCoords[8] = (float) (b.getB().getZ() / 2);

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

	public void draw(GL10 gl) {
		gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

		gl.glColor4f(color[0], color[1], color[2], color[3]);
		gl.glVertexPointer(COORDS_PER_VERTEX, GL10.GL_FLOAT, 0, vertexBuffer);
		gl.glDrawArrays(GL10.GL_TRIANGLES, 0, triangleCoords.length
				/ COORDS_PER_VERTEX);

		gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
	}

	@Override
	public String toString() {
		// return "Triangle\n[" + a + ", " + b + ", " + c + "\n]";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i += 1) {
			if (i % 3 == 0)
				sb.append("\n");
			sb.append(triangleCoords[i] + "   ");
		}
		return sb.toString() + "\n";
	}
}
