package com.vedant.youtubeshorts.model;

public class PostsItem{
	private Creator creator;
	private Reaction reaction;
	private Comment comment;
	private Submission submission;
	private String postId;

	public void setCreator(Creator creator){
		this.creator = creator;
	}

	public Creator getCreator(){
		return creator;
	}

	public void setReaction(Reaction reaction){
		this.reaction = reaction;
	}

	public Reaction getReaction(){
		return reaction;
	}

	public void setComment(Comment comment){
		this.comment = comment;
	}

	public Comment getComment(){
		return comment;
	}

	public void setSubmission(Submission submission){
		this.submission = submission;
	}

	public Submission getSubmission(){
		return submission;
	}

	public void setPostId(String postId){
		this.postId = postId;
	}

	public String getPostId(){
		return postId;
	}

	@Override
 	public String toString(){
		return 
			"PostsItem{" + 
			"creator = '" + creator + '\'' + 
			",reaction = '" + reaction + '\'' + 
			",comment = '" + comment + '\'' + 
			",submission = '" + submission + '\'' + 
			",postId = '" + postId + '\'' + 
			"}";
		}
}
