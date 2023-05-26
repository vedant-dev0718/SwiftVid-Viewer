package com.vedant.youtubeshorts.model;

import java.util.List;

public class Data{
	private int offset;
	private int page;
	private List<PostsItem> posts;

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setPosts(List<PostsItem> posts){
		this.posts = posts;
	}

	public List<PostsItem> getPosts(){
		return posts;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"offset = '" + offset + '\'' + 
			",page = '" + page + '\'' + 
			",posts = '" + posts + '\'' + 
			"}";
		}
}