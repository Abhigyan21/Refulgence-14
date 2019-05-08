package com.example.refulgence14;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
Button b1,b2,b3,b4,b5,b6,b7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		b5=(Button) findViewById(R.id.button5);
		b6=(Button) findViewById(R.id.button6);
		b7=(Button) findViewById(R.id.button7);
		
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Thread time=new Thread(){
					public void run(){
						try{
						Class cla= Class.forName("com.example.refulgence14.medusa");
						Intent in=new Intent(MainActivity.this,cla);
						startActivity(in);
						}catch(ClassNotFoundException e){
						e.printStackTrace();
					}
				}
				};
				time.start();
				}	
			}
		);
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Thread timer=new Thread(){
					public void run(){
						try{
						Class clas= Class.forName("com.example.refulgence14.ref");
						Intent it=new Intent(MainActivity.this,clas);
						startActivity(it);
						}catch(ClassNotFoundException e){
						e.printStackTrace();
					}
				}
				};
				timer.start();
			}
		});
b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Thread timeer=new Thread(){
					public void run(){
						try{
						Class cslas= Class.forName("com.example.refulgence14.show");
						Intent inqi=new Intent(MainActivity.this,cslas);
						startActivity(inqi);
						}catch(ClassNotFoundException e){
						e.printStackTrace();
					}
				}
				};
				timeer.start();
				}	
			}
		);
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Thread timer=new Thread(){
		public void run(){
			try{
			Class cl= Class.forName("com.example.refulgence14.tabs");
			Intent i=new Intent(MainActivity.this,cl);
			startActivity(i);
			}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	};
	timer.start();
	}});
b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Thread tim=new Thread(){
			public void run(){
				try{
				Class cal= Class.forName("com.example.refulgence14.me");
				Intent ni=new Intent(MainActivity.this,cal);
				startActivity(ni);
				}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		};
		tim.start();
		}
	}
);
b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Thread timee=new Thread(){
			public void run(){
				try{
				Class csla= Class.forName("com.example.refulgence14.location");
				Intent inq=new Intent(MainActivity.this,csla);
				startActivity(inq);
				}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		};
		timee.start();
		}	
	}
);
b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Thread tieme=new Thread(){
			public void run(){
				try{
				Class cala= Class.forName("com.example.refulgence14.credits");
				Intent itn=new Intent(MainActivity.this,cala);
				startActivity(itn);
				}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		};
		tieme.start();
		}	
});
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
