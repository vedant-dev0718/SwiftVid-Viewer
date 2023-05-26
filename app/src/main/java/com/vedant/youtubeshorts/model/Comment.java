package com.vedant.youtubeshorts.model;

public class Comment{
	private int count;
	private boolean commentingAllowed;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setCommentingAllowed(boolean commentingAllowed){
		this.commentingAllowed = commentingAllowed;
	}

	public boolean isCommentingAllowed(){
		return commentingAllowed;
	}

	@Override
 	public String toString(){
		return 
			"Comment{" + 
			"count = '" + count + '\'' + 
			",commentingAllowed = '" + commentingAllowed + '\'' + 
			"}";
		}
}
