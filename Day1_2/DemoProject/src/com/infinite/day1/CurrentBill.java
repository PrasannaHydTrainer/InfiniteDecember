package com.infinite.day1;

public class CurrentBill {

	public void calculate(int units) {
		double billAmount, rate;
		billAmount = 0;
		if (units <= 90) {
			rate=1;
			billAmount = units * rate;
		}
		if (units >= 90) {
			rate = 1;
			billAmount = (90*rate);
			rate = 1.5;
			if (units - 150 >= 0) {
				billAmount += (rate*60);
			} else {
				billAmount += (rate * (units-90));
			}
		}
		if (units > 150) {
			rate = 2;
			if (units-200 > 0) {
				billAmount +=(rate * 50);
			} else {
				billAmount +=(rate * (units-150));
			}
		}
		System.out.println("Bill Amount  " +billAmount);
	}
	public static void main(String[] args) {
		int units=151;
		new CurrentBill().calculate(units);
	}
}
