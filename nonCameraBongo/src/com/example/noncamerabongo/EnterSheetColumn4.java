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

public class EnterSheetColumn4 extends ActionBarActivity {

	private int fromTop;
	private BingoPage newPage;
	private int colNum;
	private int idx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_sheet_column4);
		
		fromTop = 0;
		colNum = 3;
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

	public void click46(View v)
	{
		newPage.insertNum(46, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click47(View v)
	{
		newPage.insertNum(47, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click48(View v)
	{
		newPage.insertNum(48, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click49(View v)
	{
		newPage.insertNum(49, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click50(View v)
	{
		newPage.insertNum(50, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click51(View v)
	{
		newPage.insertNum(51, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click52(View v)
	{
		newPage.insertNum(52, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click53(View v)
	{
		newPage.insertNum(53, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click54(View v)
	{
		newPage.insertNum(54, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click55(View v)
	{
		newPage.insertNum(55, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click56(View v)
	{
		newPage.insertNum(56, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click57(View v)
	{
		newPage.insertNum(57, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click58(View v)
	{
		newPage.insertNum(58, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click59(View v)
	{
		newPage.insertNum(59, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	public void click60(View v)
	{
		newPage.insertNum(60, colNum, fromTop);
		fromTop++;

		if(fromTop >= 5)
		{
			//Go to next intent
	    	Intent intent = new Intent(this, EnterSheetColumn5.class);
	    	intent.putExtra("newPageIdx", idx);
	    	startActivity(intent);
	    	finish();
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_sheet_column4, menu);
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
					R.layout.fragment_enter_sheet_column4, container, false);
			return rootView;
		}
	}

}
