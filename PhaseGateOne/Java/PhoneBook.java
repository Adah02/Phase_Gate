import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook {

	public static ArrayList<String> nameStore(String name){
		ArrayList<String> names = new ArrayList<>();
		names.add(name);

		return names;
	}

	public static ArrayList<String> addressStore(String address){
		ArrayList<String> addresses = new ArrayList<>();
		addresses.add(address);

		return addresses;
	}

	public static ArrayList<String> phoneNoStore(String telephone){
		ArrayList<String> telephoneNumbers = new ArrayList<>();
		telephoneNumbers.add(telephone);

		return telephoneNumbers;
	}

	public static ArrayList<String> emailStore(String email){
		ArrayList<String> emails = new ArrayList<>();
		emails.add(email);

		return emails;
	}


	public static void main(String[] main){

	Scanner input = new Scanner(System.in);

	System.out.print("Welcome to Ultimate Phonebook... \n A place for ");

	String activities = """
			Press ;-
			1 > Add contact
			2 > Remove contact
			3 > Find contact
			4 > Edit contact
			0 > Exit
			""";

		boolean activity = true;
		while (activity == true){

		System.out.print(activities);
		System.out.print("Kindly enter your choice: ");
		String usersChoice = input.next();

		switch(usersChoice){
			case "1":{
					System.out.println("Enter name: ");
					String name = input.next();
					nameStore(name);
					
					System.out.println("Enter address: ");
					String address  = input.next();
					addressStore(address);

					System.out.println("Enter telephone No: ");
					String telephone  = input.next();
					phoneNoStore(telephone);

					System.out.println("Enter email: ");
					String email  = input.next();
					emailStore(email);
					} break;

			case "2": {
					System.out.println("Enter name or phone number of the contact to remove: "); 
					String remove  = input.nextLine();
					
					ArrayList<String> contactNames = nameStore(name);
					ArrayList<String> phoneNumbers = phoneNoStore(telephone);

					} break;
			case "3": {

					}
			}

		}


	}
}