/*
Jacob Johnson
jacob.johnson365@gmail.com
3/21/18
CIS175 - Java II
This program provides a user with a background in single malt whiskey flavors, then 
prompts the user to specify which flavors sound more appealing.  The program takes those
answers into account in the form of integers 0-3, then passes those to the Whiskies class
where they are inserted into an array of an array as what are essentially the row and 
column locations of a two dimensional array.  Strings of whiskeys that match the location 
of user input (flavor1 and flavor2) are stored in the arrays and then output to the user
as a suggestion for purchase.  The whiskey flavor information list of whiskeys were borrowed 
from http://drinkwire.liquor.com/post/single-malt-whisky-guide-infographic#gs.84arC7k. All 
credit goes to the original author Alexander A. Woldehanna (aka Intoxicology). I learned a lot
from this information and hope the user will also.  
*/
package Whiskey;

//class declaration
public class UserInterface {
	
	public static void main(String[] args) {
		
		//introduction
		System.out.println("Hello, welcome to the Single Malt Whiskey Flavor Map!");
		System.out.println("Let's start by getting some of your taste preferences, ");
		System.out.println("which will help us better determine the ideal whiskey for your palet.");
		
		System.out.println(" ");
		//define light and rich flavors
		System.out.println("The flavor scale of whiskey slides from side to side ");
		System.out.println("between light and rich, and up and down between delicate and smokey.");
		System.out.println("Light refers to fresh flavors such as fruits, grass,");
		System.out.println("and cereals, while rich refers to vanilla, dried fruit, and chocolate ");
		System.out.println("used during the aging process.");
		
		System.out.println(" ");
		//prompt user for information
		System.out.println("On a scale of 0-3, with 0 being exceptionally light, 1 being");
		System.out.println("more light than rich, 2 being more rich than light, and 3 being exceptionally");
		System.out.println("rich, which flavor do you think you would enjoy most?");
		
		//create object of Whiskies class in order to pass answer onto answer1 method in Whiskey class
		Whiskies answer = new Whiskies();
		answer.answer1();
		
		//define delicate and smoky flavors
		System.out.println(" ");
		System.out.println("Delicate whiskies refrain from using peat during the malting process.");
		System.out.println("As you stay delicate but move towards the light end of the spectrum you");
		System.out.println("notice more floral and grassy freshness. Then moving towards the rich end,");
		System.out.println("you get nutty and barley flavors.");
		System.out.println("Smoky single malts all contain peatiness, which gets burned in the malting");
		System.out.println("process. You’ll notice smoke and wood-fire like scents in these whiskies.");
		
		System.out.println(" ");
		//prompt user for information
		System.out.println("On a scale of 0-3, with 0 being exceptionally delicate, 1 being");
		System.out.println("more delicate than smoky, 2 being more smoky than delicate, and 3 being");
		System.out.println("exceptionally smoky, which flavor do you think you would enjoy most?");
		
		//pass answer onto answer2 method in Whiskey class
		answer.answer2();
		
		
		
		System.out.println(" ");
		//output of final results of single malt taste mapping process
		System.out.println(answer.toString());
		
	}
	
	
}
