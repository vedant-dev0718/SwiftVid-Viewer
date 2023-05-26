package com.vedant.youtubeshorts.model;

public class Creator{
	private String name;
	private String handle;
	private String id;
	private String pic;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHandle(String handle){
		this.handle = handle;
	}

	public String getHandle(){
		return handle;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPic(String pic){
		this.pic = pic;
	}

	public String getPic(){
		return pic;
	}

	@Override
 	public String toString(){
		return 
			"Creator{" + 
			"name = '" + name + '\'' + 
			",handle = '" + handle + '\'' + 
			",id = '" + id + '\'' + 
			",pic = '" + pic + '\'' + 
			"}";
		}
}
