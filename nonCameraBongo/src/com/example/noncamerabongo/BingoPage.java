package com.example.noncamerabongo;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.R.bool;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public class BingoPage implements Serializable{

	public int pageID;
	public BingoCell[][] table;
	public int index;
	public String winnerLocation;

	
	public BingoPage(int id)
	{
		table = new BingoCell[5][5];
		pageID = id;
		winnerLocation = null;

		//the free space
		table[2][2] = new BingoCell(999);
		table[2][2].called = 1;
	}
	
	public void insertNum(int num, int column, int row)
	{
		table[row][column] = new BingoCell(num);

	}
	public String stringMe()
	{
		StringBuilder test = new StringBuilder();
		
		
			for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < 5; j++)
				{
					test.append(table[i][j].num);
					test.append(" | ");
				}
				test.append("\n\r");
			}
		

		return test.toString();
	}
	public void markNum(int markNum, int idx)
	{
		index = idx;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(table[i][j].num == markNum)
				{
					table[i][j].called = 1;
					
					checkForBingo();
				}
			}
		}
	}
	
	
	private void checkForBingo()
	{
		testRows();
		testColumns();
		testDiagonals();

	}
	
	private void testRows()
	{
		int hasBingo = 1;
		for(int i = 0; i < 5; i++)
		{
			hasBingo = 1;
			
			for(int j = 0; j < 5; j++)
			{
				if(table[i][j].called == 0)
				{
					hasBingo = 0;
					break; //Skip to the next column
				}
			}
			if(hasBingo == 1)
			{
				//Alert that bingo on row i+1 if page pageID
				alertWinner("Row " + (i+1));
			}
		}
	}
	private void testColumns()
	{
		int hasBingo = 1;
		
		for(int i = 0; i < 5; i++)
		{
			hasBingo = 1;
			
			for(int j = 0; j < 5; j++)
			{
				if(table[j][i].called == 0)
				{
					hasBingo = 0;
					break; //row
				}
			}
			if(hasBingo == 1)
			{
				//Alert that bingo on row i+1 if page pageID
				alertWinner("Column " + (i+1));
			}
		}
	}
	
	private void testDiagonals()
	{
		if(table[0][0].called == 1 && table[1][1].called == 1 && table[2][2].called == 1
				&& table[3][3].called == 1 && table[4][4].called == 1)
		{
			//Top left->bottom right bingo!
			alertWinner("Top left->bottom right diagonal");
		}
		
		else if(table[0][4].called == 1 && table[1][3].called == 1 && table[2][2].called == 1
				&& table[3][1].called == 1 && table[4][0].called == 1)
		{
			//Top right->bottom left bingo!
			alertWinner("Top right->bottom left diagonal");
		}
	}
	
	private void alertWinner(String location)
	{
		winnerLocation = new String("ID: " + pageID + " at " + index/3 + " sheets from bottom\n\r" + location);
	}
	
 	public void clear()
	{
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				table[i][j].called = 0;
			}
		}
		winnerLocation = null;
	}
 		
	
}
