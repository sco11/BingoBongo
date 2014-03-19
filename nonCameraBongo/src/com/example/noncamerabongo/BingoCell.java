package com.example.noncamerabongo;

import java.io.Serializable;

public class BingoCell implements Serializable{

	public int num;
	public int called;
	
	public BingoCell(int id)
	{
		num = id;
		called = 0;
	}
}
