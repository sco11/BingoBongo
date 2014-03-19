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

public class EnterSheetColumn2 extends ActionBarActivity {

	private int fromTop;
	private BingoPage newPage;
	private int colNum;
	private int idx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_sheet_column2);

		fromTop = 0;
		colNum = 1;
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

	
	public void click16(View v)
	{
		newPage.insertNum(16, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click17(View v)
	{
		newPage.insertNum(17, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click18(View v)
	{
		newPage.insertNum(18, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click19(View v)
	{
		newPage.insertNum(19, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click20(View v)
	{
		newPage.insertNum(20, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click21(View v)
	{
		newPage.insertNum(21, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click22(View v)
	{
		newPage.insertNum(22, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click23(View v)
	{
		newPage.insertNum(23, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click24(View v)
	{
		newPage.insertNum(24, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click25(View v)
	{
		newPage.insertNum(25, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click26(View v)
	{
		newPage.insertNum(26, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click27(View v)
	{
		newPage.insertNum(27, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click28(View v)
	{
		newPage.insertNum(28, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click29(View v)
	{
		newPage.insertNum(29, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click30(View v)
	{
		newPage.insertNum(30, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn3.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_sheet_column2, menu);
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
					R.layout.fragment_enter_sheet_column2, container, false);
			return rootView;
		}
	}

}
