package com.example.gif;
/**
 * 
 * 逐帧动画
 * 
 * **/
import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private LinearLayout ll = null;
	private boolean flag = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ll = (LinearLayout)findViewById(R.id.ll);
		final AnimationDrawable anim = (AnimationDrawable)ll.getBackground();
		//为线性布局管理器添加单击事件监听器
		ll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (flag) {
					anim.start();
					flag = false;
				}else{
					anim.stop();
					flag = true;
				}
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
