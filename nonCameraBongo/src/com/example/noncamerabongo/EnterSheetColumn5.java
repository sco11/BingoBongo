package com.example.noncamerabongo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class EnterSheetColumn5 extends ActionBarActivity {

	private int fromTop;
	private BingoPage newPage;
	private int colNum;
	private int idx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_sheet_column5);

		fromTop = 0;
		colNum = 4;
		//newPage = (BingoPage)getIntent().getSerializableExtra("newPage");
		MyApp app = (MyApp)getApplication();
		idx = 0;
		idx = getIntent().getIntExtra("newPageIdx", idx);
		newPage = app.getPage(idx);
		
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	
	public void click61(View v)
	{
		newPage.insertNum(61, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click62(View v)
	{
		newPage.insertNum(62, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click63(View v)
	{
		newPage.insertNum(63, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click64(View v)
	{
		newPage.insertNum(64, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click65(View v)
	{
		newPage.insertNum(65, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click66(View v)
	{
		newPage.insertNum(66, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click67(View v)
	{
		newPage.insertNum(67, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click68(View v)
	{
		newPage.insertNum(68, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click69(View v)
	{
		newPage.insertNum(69, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click70(View v)
	{
		newPage.insertNum(70, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click71(View v)
	{
		newPage.insertNum(71, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click72(View v)
	{
		newPage.insertNum(72, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click73(View v)
	{
		newPage.insertNum(73, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click74(View v)
	{
		newPage.insertNum(74, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	public void click75(View v)
	{
		newPage.insertNum(75, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Return up the stack of activities			
	    	finish();
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_sheet_column5, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_enter_sheet_column5, container, false);
			return rootView;
		}
	}

}
