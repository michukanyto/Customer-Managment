package finalExam;
import java.util.Scanner;

public class Menu {
	String line = "\n\t\t*************************************************************************************************";
	
	
	public int mainMenu() {
		int option;
		Scanner input = new Scanner(System.in);
		System.out.println(line);
		System.out.println("\t\t\t\t\t######### WELCOME TO CUSTOMER MANAGEMENT  #########");
		System.out.println("\n\n\t\t\t\t\t\t\t1. Adding Customer.");
		System.out.println("\n\t\t\t\t\t\t\t2. Search Customer.");
		System.out.println("\n\t\t\t\t\t\t\t3. Display Customer.");
		System.out.println("\n\t\t\t\t\t\t\t4. Exit.");
		System.out.print("\n\t\t\tPlease Enter your Option here => ");
		
		
		while(!(input.hasNextInt())) {
			 System.out.println("\n\t\t\tYOU TYPED A WRONG OPTION, TRY (1,2,3,4) ");
			 System.out.print("\n\t\t\tPlease Enter your Option here => ");
			 input.next();
		 }
		
		option = input.nextInt();
		System.out.println(line);
		
		return option;
	}
	
	
	
	
	public Customer adding2() {
		String fname;
		String lname;
		String address;
		String email;
		String phone;
		int id;
		
		Scanner input5 = new Scanner(System.in);
		System.out.println(line);
		System.out.println("\n\t\t\t\t\t\t\t    CUSTOMER CREATION PROCESS");
		System.out.print("\n\t\t\t\tCUSTOMER ID =>   ");
		id = Integer.parseInt(input5.nextLine());
		System.out.print("\n\t\t\t\tCUSTOMER FIRST NAME =>   ");
		fname = input5.nextLine();
		System.out.print("\n\t\t\t\tCUSTOMER LAST NAME =>   ");
		lname = input5.nextLine();
		System.out.print("\n\t\t\t\tCUSTOMER POSTAL ADDRESS =>   ");
		address = input5.nextLine();
		System.out.print("\n\t\t\t\tCUSTOMER phone =>   ");
		phone = input5.nextLine();
		System.out.print("\n\t\t\t\tCUSTOMER email =>   ");
		email = input5.nextLine();
		
		System.out.println(line);
		Customer customerMenu = new Customer(id,fname,lname,email,address,phone);
		
		return customerMenu;
		
	}

	
	
	
	
	
	
	
	
	
	
	
//	
//	public Customer adding() {
//		System.out.println(line);
//		System.out.println("\n\t\t\t\t\t\t\t    CUSTOMER CREATION PROCESS");
//		
//		int id = getCustomerID();
//		String fName = getCustomerFirstName();
//		String lName = getCustomerLaststName();
//		String email = getCustomerEmail();
//		String postal = getCustomerPostaAddress();
//		String phone = getCustomerPhone();
//		
//		System.out.println(line);
//		Customer customerMenu = new Customer(id,fName,lName,email,postal,phone);
//		return customerMenu;
//	
//	}
//	
//	public int getCustomerID() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("\n\t\t\t\tCustomer ID =>   ");
//		int id = input.nextInt();
////		input.close();
//		return id;
//	}
//	
//	public String getCustomerFirstName() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("\n\t\t\t\tCustomer First Name =>   ");
//		String fname = input.nextLine();
////		input.close();
//		return fname;
//	}
//	
//	public String getCustomerLaststName() {
//		System.out.print("\n\t\t\t\tCustomer First Name =>   ");
//		Scanner input = new Scanner(System.in);
//		String lname = input.nextLine();
////		input.close();
//		return lname;
//	}
//	
//	public String getCustomerEmail() {
//		System.out.print("\n\t\t\t\tCustomer First Name =>   ");
//		Scanner input = new Scanner(System.in);
//		String email = input.nextLine();
////		input.close();
//		return email;
//	}
//	
//	public String getCustomerPostaAddress() {
//		System.out.print("\n\t\t\t\tCustomer First Name =>   ");
//		Scanner input = new Scanner(System.in);
//		String postal = input.nextLine();
////		input.close();
//		return postal;
//	}
//	
//	public String getCustomerPhone() {
//		System.out.print("\n\t\t\t\tCustomer First Name =>   ");
//		Scanner input = new Scanner(System.in);
//		String phone = input.nextLine();
//		input.close();
//		return phone;
//	}

}
