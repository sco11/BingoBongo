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

public class EnterSheetColumn3 extends ActionBarActivity {

	private int fromTop;
	private BingoPage newPage;
	private int colNum;
	private int idx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_sheet_column3);

		fromTop = 0;
		colNum = 2;
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
	
	
	public void click31(View v)
	{
		newPage.insertNum(31, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click32(View v)
	{
		newPage.insertNum(32, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click33(View v)
	{
		newPage.insertNum(33, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click34(View v)
	{
		newPage.insertNum(34, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click35(View v)
	{
		newPage.insertNum(35, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click36(View v)
	{
		newPage.insertNum(36, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click37(View v)
	{
		newPage.insertNum(37, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click38(View v)
	{
		newPage.insertNum(38, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click39(View v)
	{
		newPage.insertNum(39, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click40(View v)
	{
		newPage.insertNum(40, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click41(View v)
	{
		newPage.insertNum(41, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click42(View v)
	{
		newPage.insertNum(42, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click43(View v)
	{
		newPage.insertNum(43, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click44(View v)
	{
		newPage.insertNum(44, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	public void click45(View v)
	{
		newPage.insertNum(45, colNum, fromTop);
		fromTop++;
		if(fromTop == 2)
		{
			//Have to skip the free space
			fromTop = 3;
		}
		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn4.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_sheet_column3, menu);
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
					R.layout.fragment_enter_sheet_column3, container, false);
			return rootView;
		}
	}

}
