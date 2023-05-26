package com.vedant.youtubeshorts.model;

public class Reaction{
	private int count;
	private boolean voted;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setVoted(boolean voted){
		this.voted = voted;
	}

	public boolean isVoted(){
		return voted;
	}

	@Override
 	public String toString(){
		return 
			"Reaction{" + 
			"count = '" + count + '\'' + 
			",voted = '" + voted + '\'' + 
			"}";
		}
}
