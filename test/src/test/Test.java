package test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		double[] a={2.5,3.9,4.3,1.1};
		double max=Arrays.stream(a).max().getAsDouble();
		System.out.println(max);
		System.out.println("更改1");
		System.out.println("更改2");
		System.out.println("更改3");
	}
}
