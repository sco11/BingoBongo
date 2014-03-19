package com.example.noncamerabongo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class MainActivity extends ActionBarActivity {

	private List<BingoPage> allSheets;
	private List<Integer> calledNums;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //allSheets = new ArrayList<BingoPage>();
        calledNums = new ArrayList<Integer>();
        
        MyApp app = (MyApp)getApplication();
        //allSheets = app.getList();
        readAll();
        
        app.setList(allSheets);
        
        EditText editText = (EditText)findViewById(R.id.editText2);
  
        

        editText.setOnKeyListener(new EditText.OnKeyListener()
        {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    switch (keyCode)
                    {
                        case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            addCalledNumberClick(null);
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }

		

        });
        
               
        
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    //Gotta use Iterator.remove() to get rid of pages while iterating
    public void testSheet(View v)
    {
    	
    	
    	
    	for(final BingoPage page: allSheets)
    	{
			if(page == null)
			{
				Log.d("zz","null page in loop");
				continue;
			}
			else
			{
				Log.d("zz", page.pageID + " " + page.index);
				Log.d("zp", page.stringMe());
			}
    		
    		
    		
    		
			new AlertDialog.Builder(this)
			.setTitle(page.pageID + " at " + allSheets.indexOf(page))
			.setMessage(page.stringMe())
			.setPositiveButton("Next", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		               // User clicked OK button
		           }
		       })
			.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		               // User cancelled the dialog
		        	   //EditText editText = (EditText)findViewById(R.id.editText1);
		        	   //editText.setText(page.pageID);
		        	   //removePageClick(null);
		        	   //deletePg(page.pageID);
		        	   //toDelete.add(page.pageID);
		        	   
		           }
		       })
			.show();
			

    	}
  
    	
    }
    
 
    
    public void saveAllButton(View v)
    {
    	String fileName = "bingoPages";
    	FileOutputStream outputStream;
    	Log.d("Saval", "Save button CAlled!");
		for(BingoPage pg : allSheets)
		{
			Log.d("saveAll", pg.stringMe());
		}
		
    	try
    	{
    		outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
    		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
    		oos.writeObject(allSheets);
    		Log.d("oos", oos.toString());
    		oos.flush();
    		oos.close();
    		
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    public void saveAll()
    {
    	String fileName = "bingoPages";
    	FileOutputStream outputStream;
    	Log.d("Saval", "SAVING!");
		for(BingoPage pg : allSheets)
		{
			Log.d("saveAll", pg.stringMe());
		}
		
    	try
    	{
    		outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
    		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
    		oos.writeObject(allSheets);
    		Log.d("oos", oos.toString());
    		oos.flush();
    		oos.close();
    		
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    
    public void readAll()
    {
    	try
    	{
   		
    		FileInputStream in = openFileInput("bingoPages");
    		ObjectInputStream ois = new ObjectInputStream(in);
    		allSheets = (ArrayList<BingoPage>)ois.readObject();
    		ois.close();
    	}
    	catch(FileNotFoundException e)
    	{
    		allSheets = new ArrayList<BingoPage>();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    
    
    public void newPageClick(View v)
    {
    	try
    	{
	    	EditText editText = (EditText)findViewById(R.id.editText1);
	    	int pageID = Integer.parseInt(editText.getText().toString());
	    	
	    	BingoPage newSheet = new BingoPage(pageID);
	    	allSheets.add(newSheet);
	    	
	    	//Create new activity of enterSheetcolumn1 (pass newSheet)
	    	Intent intent = new Intent(this, EnterSheetColumn1.class);
	    	intent.putExtra("newPageIdx", allSheets.indexOf(newSheet));
	    	startActivity(intent);
//	    	
	    	saveAll();
    	}
    	catch(Exception e)
    	{
    	
    	}
    }
    
    //Update to take out all 3 instead of 1
    public void removePageClick(View v)
    {
    	try
    	{
	    	EditText editText = (EditText)findViewById(R.id.editText1);
	    	int pageID = Integer.parseInt(editText.getText().toString());
	    	
	    	BingoPage toDelete = null;
	    	for(BingoPage page : allSheets)
	    	{
	    		if(page.pageID == pageID)
	    		{
	    			toDelete = page;
	    		}
	    	}
	    	try
	    	{
	    		allSheets.remove(toDelete);
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	saveAll();
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    

    public void addCalledNumberClick(View v)
    {
    	EditText editText = (EditText)findViewById(R.id.editText2);
    	int calledNum = Integer.parseInt(editText.getText().toString());
    	calledNums.add(calledNum);
    	
    	TextView called = (TextView)findViewById(R.id.textView1);
    	called.setText(called.getText() + " " + calledNum + "|");
    	
    	try
    	{
	    	for(BingoPage page : allSheets)
	    	{
	    		page.markNum(calledNum, allSheets.indexOf(page));
	    		if(page.winnerLocation != null)
	    		{
	    			new AlertDialog.Builder(this)
	    			.setTitle("BINGO BONGO!")
	    			.setMessage(allSheets.indexOf(page)%3+1 + " 1=top/2=mid/3=bot\n\r" + (allSheets.size() - allSheets.indexOf(page))/3 + " pages from top\n\r" + page.winnerLocation)
	    			
	    			.show();
	    		}
	    	}
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    
    public void clearCalledNumbersClick(View v)
    {
    	calledNums.clear();
    	for(BingoPage page : allSheets)
    	{
    		page.clear();
    	}
    	TextView called = (TextView)findViewById(R.id.textView1);
    	called.setText("Called:");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    
    /*
    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first

        saveAll();
        
    }
    
    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first

       
        readAll();
    }
    */
    

}
