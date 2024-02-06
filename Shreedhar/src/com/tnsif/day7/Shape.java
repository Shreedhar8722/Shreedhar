package com.tnsif.day7;

public abstract class Shape {
	protected float area
	//abstract method
	abstract void calArea();
	
	//concrete method
	void show()
	{
		System.out.println("Area is :"+area);
	}

}
