package com.iutbm.dgts;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class GLActivity extends Activity {

	private GLSurfaceView mGLView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		mGLView = new MySurfaceView(this);
		setContentView(mGLView);
	}
	
	@Override
    protected void onPause() {
        super.onPause();
        mGLView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGLView.onResume();
    }
}
