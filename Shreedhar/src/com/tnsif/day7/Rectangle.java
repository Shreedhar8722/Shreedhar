package com.tnsif.day7;

public class Rectangle {
	private float width,height;
	
	public Rectangle() {
		width=2.8f;
		height=4.5f;
	}
	
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@override
	void calArea()
	{
		area = width*height;
	}
}
