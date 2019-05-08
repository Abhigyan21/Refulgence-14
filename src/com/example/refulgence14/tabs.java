package com.example.refulgence14;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class tabs extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs);
		TabHost th=(TabHost) findViewById(R.id.tabhost);
		th.setup();
		TabSpec specs=th.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("ATHELETICS");
		th.addTab(specs);
		specs=th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("COMPUTER GAMES");
		th.addTab(specs);
		specs=th.newTabSpec("tag3");
		specs.setContent(R.id.tab3);
		specs.setIndicator("INDOOR GAMES");
		th.addTab(specs);
		specs=th.newTabSpec("tag4");
		specs.setContent(R.id.tab4);
		specs.setIndicator("CULTURAL");
		th.addTab(specs);
		specs=th.newTabSpec("tag5");
		specs.setContent(R.id.tab5);
		specs.setIndicator("MR.CRANK");
		th.addTab(specs);
		specs=th.newTabSpec("tag6");
		specs.setContent(R.id.tab6);
		specs.setIndicator("SPORTS");
		th.addTab(specs);
		specs=th.newTabSpec("tag7");
		specs.setContent(R.id.tab7);
		specs.setIndicator("PAINTING");
		th.addTab(specs);
		specs=th.newTabSpec("tag8");
		specs.setContent(R.id.tab8);
		specs.setIndicator("PHOTOGRAPHY");
		th.addTab(specs);
		specs=th.newTabSpec("tag9");
		specs.setContent(R.id.tab9);
		specs.setIndicator("QUIZ");
		th.addTab(specs);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.exit:
           finish();
		break;
		}return false;
	}
}
