package cs421project1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberMapping {

	public static void main(String args[]) {
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
		
		WordsTrie vocab = new WordsTrie();

		vocab.addWord("whizzbangs");
		vocab.addWord("zzbangs");
		vocab.addWord("angs");

		ArrayList< ArrayList<String> > words = vocab.getWords(area + exchange + number);
		System.out.println(words.get(0).get(0));
	}
}