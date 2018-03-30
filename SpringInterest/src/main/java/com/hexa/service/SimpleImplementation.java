package com.hexa.service;

public class SimpleImplementation implements CalculateInterest {

	private double rate;

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double calculateSimple(int sum, int years) {

		return sum * years * rate / 100;
	}

	@Override
	public double calculateCompound(int sum, int years) {
			return sum * Math.pow((1+ rate/100),years)-sum;
	}

}
