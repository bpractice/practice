package org.initialb.java.tutorial;

import java.lang.Math;

public class StarCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long radius = 10;
		long position;
		for (int n=0; n<2*radius+1; n++){
			position = Math.round(radius-Math.sqrt(Math.pow(radius,2)-Math.pow(radius-n, 2)));
			//System.out.println("n="+n+" position="+position);			
			for (int m=0; m<position; m++){
				System.out.print("  ");
			}
			System.out.print("**");
			for (int m=0; m<radius-position; m++){
				System.out.print("  ");
			}
			for (int m=0; m<radius-position; m++){
				System.out.print("  ");
			}
			System.out.println("**");

		}
	}

}
