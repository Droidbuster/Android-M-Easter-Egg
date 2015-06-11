package com.androstark.droidbuster.mplatelogo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
private ImageView mplatelogo;
private Animation manimation;
private Animation manimationholder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mplatelogo =(ImageView) findViewById(R.id.platlogo);
	manimation =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mplatelogoanimation);
	manimationholder =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.holderanimtionmanimtion);
	mplatelogo.startAnimation(manimation);
	mplatelogo.setOnLongClickListener(new OnLongClickListener() {
		
		@Override
		public boolean onLongClick(View l) {
			// TODO Auto-generated method stub
			mplatelogo.startAnimation(manimationholder);
			Toast.makeText(getApplicationContext(), (R.string.platext), 1000).show();
			return true;
		}
	});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
