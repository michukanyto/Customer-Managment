///////////////////////
//MARLON ESCOBAR A////
/////////////////////
///////////////////////QUESTION 4//////////////////
//START
//	print "1. Adding Customer"
//	print "2. Search Customer"
//	print "2. Display Customer"
//	print "4. Adding Customer"
//	
//	Read user answer
//	Return user answer
//END


///////////////////////QUESTION 5//////////////////
//START
//	print "Type id"
//  Read id
//	print "Type First Name"
//  Read first name
//	print "Type Last Name"
//  Read last name
//	print "Type email"
//  Read email
//  print "Type Postal Address"
//  Read postal address
//  print "Type phone"
//  Read phone

//  CREATE OBJECT CUSTOMER with(id,first name,last name,email, postal address, phone)
//  Return OBJECT
//END

///////////////////////QUESTION 6//////////////////
//START
//  get array
//	print "Type id"
//  Read id
//	Loop (from i=0 to final index)
//		if(id == array[i].id number)
//			Print user data
//			break
//  end loop
//	
//END

///////////////////////QUESTION 7//////////////////
//START
//  get array
//	Loop (from i=0 to final index)
//
//			Print user data
//			increment i
//  end loop
//	
//END
///////////////////////QUESTION 8//////////////////
//START
//
//	print "Are sure that you want to exit?"
//  Read answer
//	
//	return answer
//END


package finalExam;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] array = {4,1,3,2,9,0,12};
		find_min_max(array);
		
		////////////////// SECTION II ///////////////////////////
		int userOption;
		boolean flag = true;
		boolean findIt = false;
		int index = 0;
		Customer arrayCustomer[] = new Customer[10];
//		Customer customer = new Customer();
		Menu menu = new Menu();
		
		while (flag) {
			userOption = menu.mainMenu();
			
			switch(userOption) {
			
			case 1:
				arrayCustomer[index] = menu.adding2();//question 5
				index++;
				break;
			case 2://question 6
				findIt = search(arrayCustomer,index,findIt);//question 6

				break;
			
			case 3://question 7
				display(arrayCustomer, index);

				break;
				
			case 4://question 8
				flag = exit(flag);

				
				break;
				
			default:
				System.out.println("\n\t WE SORRY, you typed a wrong option, please try again.");
			}
				
				
			}
		}
		
		
		public static boolean search(Customer arrayCustomer[],int index, boolean findIt) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter Customer ID that you want search : ");
			int number = input.nextInt();
			Found :
			for (int x = 0; x< index;x++) {
				if (number == arrayCustomer[x].getUserId()) {
					System.out.println("ID\t\tFNAME\t\tLNAME\t\tEMAIL\t\\ttZIPCOD\t\tPHONE");
					System.out.println("===========================================================================================================");
					System.out.println(arrayCustomer[x].getUserId() + "\t\t" + arrayCustomer[x].getFirstName()+ "\t\t" + arrayCustomer[x].getLastName()+ "\t\t" + arrayCustomer[x].getEmail()+ "\t\t" + arrayCustomer[x].getPostaAddress()+ "\t\t" + arrayCustomer[x].getPhoneNumber());
					findIt = true;
					break Found;
				}
			}
			if (!findIt) {
				System.out.println("We sorry but this user doesn't exist in this  data base");
			}
			return findIt;
		}

		
	public static void display(Customer arrayCustomer[],int index) {
		System.out.println("ID\t\tFNAME\t\tLNAME\t\tEMAIL\t\t\tZIPCOD\t\tPHONE");
		for (int x = 0; x< index;x++) {
			System.out.println("=======================================================================================================================");
			System.out.println(arrayCustomer[x].getUserId() + "\t\t" + arrayCustomer[x].getFirstName()+ "\t\t" + arrayCustomer[x].getLastName()+ "\t\t" + arrayCustomer[x].getEmail()+ "\t\t" + arrayCustomer[x].getPostaAddress()+ "\t\t" + arrayCustomer[x].getPhoneNumber());
		}
	}
	
	public static boolean exit(boolean flag) {
		Scanner input2 = new Scanner(System.in);
		System.out.print("Are you sure : ");
		String answer = input2.nextLine();
		
		if (answer.equals("y") || answer.equals("Y"))
			flag = false;
		
		return flag;
	}
	
	
	
//////////////////SECTION I ///////////////////////////
	public static void find_min_max(int x[]) {
		int max = x[0];
		int min = x[0];
		int pmax =0, pmin = 0;
		
		for(int i = 1; i < x.length;i++) {
			if(i > max) {
				max = x[i];
				pmax = i;
			}else if(i < min) {
				min = x[i];
				pmin = i;
			}
		}
		
		System.out.println("Maximum number is : " + max + " position : " + pmax);
		System.out.println("Miniimum number is : " + min + " position : " + pmin);
		System.out.println("==================================================================================\n\n");
	}

}
