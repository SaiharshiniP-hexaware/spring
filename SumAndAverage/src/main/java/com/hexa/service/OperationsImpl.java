package com.hexa.service;

import java.util.List;
import java.util.stream.Collectors;

public class OperationsImpl implements Operations {
private List<Integer> num;
int sum=0;

public void setNum(List<Integer> num) {
	this.num = num;
}

@Override
public int getSum() {
	int sum = num.stream().collect(Collectors.summingInt(Integer::intValue));


	
	
	
	return sum;
}



	
	

}
