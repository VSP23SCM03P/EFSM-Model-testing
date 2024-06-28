import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GasPump {
	private float Rprice;
	private float Sprice;
	private float Dprice;
	private int w;
	private float price;
	private int L;
	private float total;
	private float cash;
	private int k;
	
	public static void main(String args[]) throws Exception {
		// Creating an object for the GasPump class
		GasPump g = new GasPump(); 
		System.out.println("SOFTWARE TESTING & ANALYSIS PROJECT - GASPUMP CLASS");
		System.out.println("\nCS 589 : FALL 2022");
		System.out.println("Devansh Goel - A20490554");
		@SuppressWarnings("resource")
		Scanner keyIn = new Scanner(System.in);
		System.out.print("Press The ENTER KEY To Continue");
		keyIn.nextLine();
		// To execute program if user gives different type of input
		while (true) 
		{
			System.out.print("Test Driver for the GASPUMP Class\n");
			try {
	          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int choice;
				String s;
				float x, y, z, d;
				//GasPump Menu
				while (true) { 
					System.out.println("\n*########  GASPUMP MENU  ##########*");
					System.out.println("\t   0.Activate");
					System.out.println("\t   1.PayCredit");
					System.out.println("\t   2.Reject");
					System.out.println("\t   3.Cancel");
					System.out.println("\t   4.Approved");
					System.out.println("\t   5.PayCash");
					System.out.println("\t   6.Regular");
					System.out.println("\t   7.Super");
					System.out.println("\t   8.Midgrade");
					System.out.println("\t   9.StartPump");
					System.out.println("\t  10.Pump");
					System.out.println("\t  11.StopPump");
					System.out.println("\t  12.NoReceipt");
					System.out.println("\t  13.Receipt");
					System.out.println("\t  14.TurnOff");
					System.out.println("\n *#### TESTING ORIENTED METHOD #####*");
					System.out.println("\n\t  15.SHOW PRICE");
					System.out.println("\t  16.TOTAL");
					System.out.println("\t  17.CASH PAID");
					System.out.println("\t  18.NUMBER OF GALLONS PUMPED");
					System.out.println("\t  19.SHOW STATE");
					System.out.println("\t  20.QUIT GASPUMP DRIVER");
					System.out.println("\n Enter your Choice:");
					s = br.readLine();
				
					choice = Integer.parseInt(s);
					switch (choice) { //To execute the user entered choice
					case 0:
						System.out.print("\nEnter value of Regular Price: ");
						x = Float.parseFloat(br.readLine());
						System.out.print("\nEnter value of Super Price: ");
						y = Float.parseFloat(br.readLine());
						System.out.print("\nEnter value of Midgrade Price: ");
						d = Float.parseFloat(br.readLine());
						//calling the Activate function by using the class object
						System.out.println("Value returned by method is: " + g.Activate(x, y, d)); 
						break;
					case 1:
						//calling the PayCredit function by using the class object
						System.out.println("Value returned by method is: " + g.PayCredit()); 
						break;
					case 2:
						//calling the Reject function by using the class object
						System.out.println("Value returned by method is: " + g.Reject()); 
						break;
					case 3:
						 //calling the Cancel function by using the class object
						System.out.print("\nValue returned by method is: " + g.Cancel());
						break;
					case 4:
						//calling the Approved function by using the class object
						System.out.println("Value returned by method is: " + g.Approved()); 
						break;
					case 5:
						System.out.print("\nEnter Amount you want to pay: ");
						z = Float.parseFloat(br.readLine());
						//calling the PayCash function by using the class object
						System.out.println("Value returned by method is: " + g.PayCash(z)); 
						break;
					case 6:
						//calling the Regular function by using the class object
						System.out.println("Value returned by method is: "+ g.Regular()); 
						break;
					case 7:
						 //calling the Super function by using the class object
						System.out.println("Value returned by method is: "+ g.Super());
						break;
					case 8:
						//calling the Midgrade function by using the class object
						System.out.println("Value returned by method is: " + g.Midgrade()); 
						break;
					case 9:
						//calling the StartPump function by using the class object
						System.out.println("Value returned by method is: " + g.StartPump()); 
						break;
					case 10:
						//calling the Pump function by using the class object
						System.out.println("Value returned by method is: " + g.Pump()); 
						break;
					case 11:
						//calling the StopPump function by using the class object
						System.out.println("Value returned by method is: "+ g.StopPump());
						break;
					case 12:
						//calling the NoReceipt function by using the class object
						System.out.println("Value returned by method is: "+ g.NoReceipt());
						break;
					case 13:
						//calling the Receipt function by using the class object
						System.out.println("Value returned by method is: " + g.Receipt());
						break;
					case 14:
						//calling the TurnOff function by using the class object
						int value =g.TurnOff(); 
						System.out.println("Value returned by method is: "+ value);
						// We check the return value of the class 
						if(value == 1) 
						{	
						//and if it is 1 we refresh all the variables in the class. 
						//This is done by creating a new object for the class
						GasPump a1 = new GasPump(); 
						g = a1;
						}
						break;
					case 15:
						//Testing Oriented Method to show value of price
						System.out.println("The Price is: " + g.show_price()); 
						break;
					case 16:
						//Testing Oriented Method to show value of total
						System.out.print("\nThe Total is: " + g.show_total()); 
						break;
					case 17:
						//Testing Oriented Method to show value of cash
						System.out.print("\nThe Cash Paid is: "+ g.show_cash());
						break;
					case 18:
						//Testing Oriented Method to show value of Gallons
						System.out.print("\nNumber of Gallons: " + g.show_Gallons());
						break;
					case 19:
						//Testing Oriented Method to show Current State
						System.out.print("\nCurrent State: "+ g.show_state());
						break;
					case 20:
						//Exit method
						System.exit(0);
					default:
						//Default Case
						System.out.println("Please Enter a Valid Input");
						break;
					}
					System.out.println("\nPress Enter to continue");
					keyIn.nextLine();
				}
				
			} catch (Exception e) 
			{
				System.out.println("Invalid Type:" + e);
			}
		}
	}
	// testing oriented method
	public float show_price() 
	{
		return price;
	}
	// testing oriented method
	public float show_total() 
	{
		return total;
	}
	// testing oriented method
	public float show_cash() 
	{
		return cash;
	}
	// testing oriented method
	public int show_Gallons() 
	{
		return L;
	}
	// testing oriented method
	public int show_state()
	{
		int s=k;
		if(k==5 && w==1)
		{s=1;} 
		return s;
	}
	
	public GasPump() {
		Rprice = 0;
		Sprice = 0;
		Dprice = 0;
		w = 0;
		price = 0;
		L = 0;
		total = 0;
		cash = 0;
		k = -1;
	}

	public final int Activate(float a, float b, float d) {
		if ((k == -1) && (a > 0) && (b > 0) && (d > 0)) {
			k = 0;
			Rprice = a;
			Sprice = b;
			Dprice = d;
			System.out.print("GAS PUMP IS ON");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}

	}

	public final int PayCredit() {
		if (k == 0) {
			k = 2;
			System.out.print("CHECKING CREDIT CARD.");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Reject() {
		if (k == 2) {
			k = 0;
			System.out.print("CREDIT CARD IS REJECTED.");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Cancel() {
		if ((k == 3) || (k == 4)) {
			k = 0;
			System.out.print("TRANSACTION IS CANCELLED.");
			System.out.print("\n");
			if (w == 0) {
				System.out.print("$");
				System.out.print(cash);
				System.out.print(" OF CASH IS RETURNED");
				System.out.print("\n");
			}
			return 1;
		} else {
			return 0;
		}
	}

	public final int Approved() {
		if (k == 2) {
			k = 3;
			w = 1;
			System.out.print("CREDIT CARD APPROVED.");
			System.out.print("\n");
			System.out.print("SELECT TYPE OF GASOLINE:");
			System.out.print("\n");
			System.out.print("a. REGULAR");
			System.out.print("\n");
			System.out.print("b. SUPER");
			System.out.print("\n");
			System.out.print("c. MIDGRADE");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int PayCash(float c) {
		if (k == 0) {
			k = 3;
			w = 0;
			cash = c;
			System.out.print("SELECT TYPE OF GASOLINE:");
			System.out.print("\n");
			System.out.print("a. REGULAR");
			System.out.print("\n");
			System.out.print("b. SUPER");
			System.out.print("\n");
			System.out.print("c. MIDGRADE");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Regular() {
		if (k == 3) {
			k = 4;
			System.out.print("REGULAR IS SELECTED.");
			System.out.print("\n");
			price = Rprice;
			return 1;
		} else {
			return 0;
		}
	}

	public final int Super() {
		if (k == 3) {
			k = 4;
			System.out.print("SUPER IS SELECTED.");
			System.out.print("\n");
			price = Sprice;
			return 1;
		} else {
			return 0;
		}
	}

	public final int Midgrade() {
		if (k == 3) {
			k = 4;
			System.out.print("MIDGRADE IS SELECTED.");
			System.out.print("\n");
			price = Dprice;
			return 1;
		} else {
			return 0;
		}
	}

	public final int StartPump() {
		if (k == 4) {
			k = 5;
			L = 0;
			total = 0;
			System.out.print("PUMP IS READY TO DISPOSE ");
			System.out.print("\n");
			System.out.print("# OF GALLONS PUMPED: ");
			System.out.print(L);
			System.out.print("\n");
			System.out.print("TOTAL CHARGE: $");
			System.out.print(total);
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Pump() {
		if (k == 5) {
			if ((w == 1) || ((cash > price * (L + 1)) && (w == 0))) {
				L = L + 1;
				total = L * price;
				System.out.print("# OF GALLONS PUMPED: ");
				System.out.print(L);
				System.out.print("\n");
				System.out.print("TOTAL CHARGE: $");
				System.out.print(total);
				System.out.print("\n");
				System.out.print("CONTINUE PUMPING");
				System.out.print("\n");
				return 1;
			} else if ((w == 0) && (cash < price * (L + 1))) {
				k = 6;
				System.out.print("PUMP STOPPED. NOT SUFFICIENT FUNDS. ");
				System.out.print("\n");
				System.out.print("# OF GALLONS PUMPED: ");
				System.out.print(L);
				System.out.print("\n");
				System.out.print("TOTAL CHARGE: $");
				System.out.print(total);
				System.out.print("\n");
				if ((w == 0) && (total < cash)) {
					System.out.print("$");
					System.out.print(cash - total);
					System.out.print(" OF CASH IS RETURNED");
					System.out.print("\n");
				}
				System.out.print("DO YOU WANT A RECEIPT?");
				System.out.print("\n");
				return 1;
			}
			;
		}
		;
		return 0;
	}

	public final int StopPump() {
		if (k == 5) {
			k = 6;
			System.out.print("PUMP STOPPED. ");
			System.out.print("\n");
			System.out.print("# OF GALLONS PUMPED: ");
			System.out.print(L);
			System.out.print("\n");
			System.out.print("TOTAL CHARGE: $");
			System.out.print(total);
			System.out.print("\n");
			if ((w == 0) && (total < cash)) {
				System.out.print("$");
				System.out.print(cash - total);
				System.out.print(" OF CASH IS RETURNED");
				System.out.print("\n");
			}
			System.out.print("DO YOU WANT A RECEIPT?");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int NoReceipt() {
		if (k == 6) {
			k = 0;
			System.out.print("NO RECEIPT IS PRINTED ");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Receipt() {
		if (k == 6) {
			k = 0;
			System.out.print("RECEIPT IS PRINTED: ");
			System.out.print("\n");
			System.out.print("# OF GALLONS PUMPED: ");
			System.out.print(L);
			System.out.print("\n");
			System.out.print("TOTAL CHARGE: $");
			System.out.print(total);
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int TurnOff() {
		if (k == 0) {
			k = -2;
			System.out.print("GAS PUMP IS TURNED OFF ");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}
}