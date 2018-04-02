package com.hexa.service;

import java.util.Iterator;
import java.util.List;

public class OperationsImplementation implements Operations {
	List<Integer> num;
	int sum = 0;
	int no = 0;

	public void setNum(List<Integer> num) {
		this.num = num;
	}

	public int sumOfIntegers() {
		Iterator<Integer> iter1 =num.iterator();
		while (iter1.hasNext()) {
		    sum += iter1.next();
		}
		System.out.println("sum inside is"+sum);

		return sum;
	}

	@Override
	public int avgOfIntegers() {

		return sumOfIntegers() / num.size();
	}
}
