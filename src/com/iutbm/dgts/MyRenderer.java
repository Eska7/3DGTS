package com.iutbm.dgts;

import java.net.MalformedURLException;
import java.net.URL;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import com.iutbm.dgts.exception.InvalidGTSFileException;
import com.iutbm.parser.GTSFile;
import com.iutbm.parser.Triangle;

public class MyRenderer implements GLSurfaceView.Renderer {

	private Triangle mTriangle;
	private float mAngle;
	
	@Override
	public void onDrawFrame(GL10 gl) {
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		
		gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();
        
        GLU.gluLookAt(gl, 0, 0, -3, 0f, 0f, 0f, 0f, 1.0f, 0.0f);
		
        mTriangle.draw(gl);
        gl.glRotatef(mAngle, 0.0f, 0.0f, 1.0f);
        
	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		gl.glViewport(0, 0, width, height);
		
		float ratio = (float) width / height;
        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glFrustumf(-ratio, ratio, -1, 1, 3, 7);
	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
		GTSFile gts;
		try {
			gts = new GTSFile(new URL("http://ns303921.ovh.net/gts/cube.gts"));
			for(Triangle t : gts.getTriangles())
				mTriangle = t;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InvalidGTSFileException e) {
			e.printStackTrace();
		}
	}
	
	public float getAngle(){
		return mAngle;
	}
	
	public void setAngle(float angle){
		mAngle = angle;
	}
	
}
