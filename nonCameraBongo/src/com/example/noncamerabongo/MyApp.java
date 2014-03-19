package com.example.noncamerabongo;

import java.util.List;

import android.app.Application;

public class MyApp extends Application {

	List<BingoPage> allPages;
	
	public List<BingoPage> getList()
	{
		return allPages;
	}
	
	public BingoPage getPage(int idx)
	{
		return allPages.get(idx);
	}
	
	public void setList(List<BingoPage> all)
	{
		allPages = all;
	}
	
	public void setPage(BingoPage page)
	{
		allPages.add(page);
	}
	
	
}
