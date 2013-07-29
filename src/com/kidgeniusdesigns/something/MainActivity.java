package com.kidgeniusdesigns.something;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 
		Button captionChanger = (Button) findViewById(R.id.enterCaptionButton);
		captionChanger.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText userCaption = (EditText) findViewById(R.id.userCaptionText);
				TextView photoCaption = (TextView) findViewById(R.id.actualCaption);
				RelativeLayout background = (RelativeLayout) findViewById(R.id.mainLayout);
				changeLayoutColor(background);

				String caption = userCaption.getText().toString();
				photoCaption.setText(caption);
						
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void changeLayoutColor(RelativeLayout layout){
		Random generator = new Random();
		int getRandomColor = generator.nextInt(8);
		int colors[] ={
				Color.BLACK, 
				Color.BLUE, 
				Color.CYAN, 
				Color.GRAY, 
				Color.GREEN, 
				Color.MAGENTA, 
				Color.RED, 
				Color.YELLOW, 
				Color.WHITE
		};
		
		switch(getRandomColor){
		case 0: layout.setBackgroundColor(colors[0]);
			break;
		case 1: layout.setBackgroundColor(colors[1]);
			break; 
		case 2: layout.setBackgroundColor(colors[2]);
			break;
		case 3: layout.setBackgroundColor(colors[3]);
			break;
		case 4: layout.setBackgroundColor(colors[4]);
			break;
		case 5: layout.setBackgroundColor(colors[5]);
			break; 
		case 6: layout.setBackgroundColor(colors[6]);
			break;
		case 7: layout.setBackgroundColor(colors[7]);
			break;
		case 8: layout.setBackgroundColor(colors[8]);
			break;
		}
		
	}

}
