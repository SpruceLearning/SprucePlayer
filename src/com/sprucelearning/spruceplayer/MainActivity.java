package com.sprucelearning.spruceplayer;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

 
public class MainActivity extends Activity {
	   private VideoView mVideoView;
	 
	   @Override
	   public void onCreate(Bundle icicle) {
	     super.onCreate(icicle);
	     setContentView(R.layout.activity_main);
	     mVideoView = (VideoView) findViewById(R.id.surface_view);
	     mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.example));
	     mVideoView.setMediaController(new MediaController(this));
	     mVideoView.requestFocus();
	   }
	}

//
//public class MainActivity extends Activity {
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}
//
//}
