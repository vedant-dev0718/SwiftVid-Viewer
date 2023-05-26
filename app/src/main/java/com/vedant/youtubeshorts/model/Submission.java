package com.vedant.youtubeshorts.model;

public class Submission{
	private String hyperlink;
	private String thumbnail;
	private String mediaUrl;
	private String description;
	private String title;
	private String placeholderUrl;

	public void setHyperlink(String hyperlink){
		this.hyperlink = hyperlink;
	}

	public String getHyperlink(){
		return hyperlink;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setMediaUrl(String mediaUrl){
		this.mediaUrl = mediaUrl;
	}

	public String getMediaUrl(){
		return mediaUrl;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setPlaceholderUrl(String placeholderUrl){
		this.placeholderUrl = placeholderUrl;
	}

	public String getPlaceholderUrl(){
		return placeholderUrl;
	}

	@Override
 	public String toString(){
		return 
			"Submission{" + 
			"hyperlink = '" + hyperlink + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",mediaUrl = '" + mediaUrl + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",placeholderUrl = '" + placeholderUrl + '\'' + 
			"}";
		}
}
