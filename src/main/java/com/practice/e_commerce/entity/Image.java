package com.practice.e_commerce.entity;

import java.io.Serializable;

public class Image implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3354466655112310837L;
	
	private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Image [image=" + image + "]";
	}

}
