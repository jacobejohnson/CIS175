//Jacob Johnson
//jejohnson8@dmacc.edu
//3/21/18
package Whiskey;

import java.util.Scanner;

//class declaration
public class Whiskies {
	
	Scanner in = new Scanner(System.in);
	//instance variables
	private int flavor1;
	private int flavor2;
	
		
	//default constructor
	public Whiskies() {
		
	}
	//constructor declaration of class
	public Whiskies(int flavor1, int flavor2) {
		this.flavor1 = flavor1;
		this.flavor2 = flavor2;
	}


	public int getFlavor1() {
		return flavor1;
	}


	public void setFlavor1(int flavor1) {
		this.flavor1 = flavor1;
	}


	public int getFlavor2() {
		return flavor2;
	}

	public void setFlavor2(int flavor2) {
		this.flavor2 = flavor2;
	}
	//get results for first taste preference question (light/rich)
	public void answer1() {
		System.out.print("Please enter a number 0-3: ");
		this.flavor1 = in.nextInt();
	}
	//get results of second taste preference question (delicate/smoky)
	public void answer2() {
		System.out.print("Please enter a number 0-3: ");
		this.flavor2 = in.nextInt();
	}
	
	@Override
	public String toString() {
		//initialize array of array (aka 2D array)
		String whiskeyArray[][] = {{"Knockando 12 Yr Old", "Royal Lochnagar 12 Yr Old", "Laphroaig 10 Yr Old", "Ardbeg 10 Yr Old"},
								   {"Glenfiddich 12 Yr Old", "Glen Elgin 12 Yr Old", "Oban 14 Yr Old", "Caol Ila 12 Yr Old"},
								   {"Bunnahabhain 12 Yr Old", "GlenMorangie Original 10 Yr Old", "Cragganmore 12 Yr Old", "Lagavulin 16 Yr Old"},
								   {"Glenlivet 18 Yr Old", "Balvenie Double Wood 12 Yr Old0", "Cragganmore Distillers Edition", "Lagavulin Distillers Edition"}};
		/*return results of flavor mapping process (flavor1 acts as row location and flavor2 acts as column location if comparing to
		traditional 2D array in other languages such as C++*/
		return "Based on your taste preferences " + whiskeyArray[flavor1][flavor2] + " would be the ideal single malt for you!"
				+ " Pick up a bottle and enjoy!";
	}
	

	
}
