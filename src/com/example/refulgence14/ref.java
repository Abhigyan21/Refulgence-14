package com.example.refulgence14;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ref extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.ref);
			TextView display=(TextView)findViewById(R.id.display);
			display.setText(readText());
			}
	       

				private String readText(){
				InputStream is=getResources().openRawResource(R.raw.refulgence);
				ByteArrayOutputStream ba=new ByteArrayOutputStream();
				int i;
				try{
					i=is.read();
				while(i!=-1){
				ba.write(i);
				i=is.read();
				}is.close();
				}catch(IOException e){
					e.printStackTrace();
				}
				return ba.toString();
				}
		
				@Override
				public boolean onCreateOptionsMenu(Menu menu) {
					// Inflate the menu; this adds items to the action bar if it is present.
					getMenuInflater().inflate(R.menu.main, menu);
					return true;
				}
				@Override
				protected void onPause() {
					// TODO Auto-generated method stub
					super.onPause();
					finish();
				}
				
	}




