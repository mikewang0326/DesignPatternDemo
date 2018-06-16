package com.mike.designpattern.example.headfirst.decorator1;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		mDescription = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
	
}
