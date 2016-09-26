/*package Project1;*/

import java.util.Scanner;

public class NumberMapping {
	static char[][] digits = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		String phone = "";
		String area = "";
		String exchange = "";
		String number = "";
		
		while (!valid) {
			System.out.print("Enter a phone number (ex. 123-456-7890): ");
			
			phone = in.next();
			phone = phone.trim();
			
			if(!phone.contains("-")){
				System.out.println("The number must have dashes(-).\n");
				continue;
			}
			
			else if(phone.length() < 12){
				System.out.println("There are not enough digits in this number.\n");
				continue;
			}
			
			else if(phone.length() > 12){
				System.out.println("There are too many digits in this number.\n");
				continue;
			}
			
			area = phone.substring(0, phone.indexOf("-"));
			phone = phone.substring(phone.indexOf("-") + 1);
			exchange = phone.substring(0, phone.indexOf("-"));
			phone = phone.substring(phone.indexOf("-") + 1);
			number = phone;
			
			if(area.length() != 3 || exchange.length() != 3 || number.length() != 4){
				System.out.println("This number is not formatted correctly.");
				continue;
			}			
			
			try{
				Integer.parseInt(area);
				Integer.parseInt(exchange);
				Integer.parseInt(number);
			} catch(NumberFormatException e){
				System.out.println("This is not a number.");
				continue;
			}
			
			valid = true;
		}
		
		boolean foundWord = false;
		boolean allPerms = false;
		String w = null;
		String[] words = null;
		
		do{
			if((area + number + exchange).contains("0") || (area + number + exchange).contains("1")){
				break;
			}
			
		} while(words != null);

		if (words == null){
			
		}
	}
}
