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

public class EnterSheetColumn1 extends ActionBarActivity {

	private int fromTop;
	private BingoPage newPage;
	private int colNum;
	private int idx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_sheet_column1);

		fromTop = 0;
		colNum = 0;
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

	
	
	public void click1(View v)
	{
		newPage.insertNum(1, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click2(View v)
	{
		newPage.insertNum(2, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click3(View v)
	{
		newPage.insertNum(3, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click4(View v)
	{
		newPage.insertNum(4, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click5(View v)
	{
		newPage.insertNum(5, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click6(View v)
	{
		newPage.insertNum(6, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click7(View v)
	{
		newPage.insertNum(7, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click8(View v)
	{
		newPage.insertNum(8, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click9(View v)
	{
		newPage.insertNum(9, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click10(View v)
	{
		newPage.insertNum(10, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click11(View v)
	{
		newPage.insertNum(11, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click12(View v)
	{
		newPage.insertNum(12, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click13(View v)
	{
		newPage.insertNum(13, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click14(View v)
	{
		newPage.insertNum(14, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click15(View v)
	{
		newPage.insertNum(15, colNum, fromTop);
		fromTop++;
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn2.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_sheet_column1, menu);
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
					R.layout.fragment_enter_sheet_column1, container, false);
			return rootView;
		}
	}

}
