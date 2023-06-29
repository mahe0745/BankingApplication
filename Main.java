import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer option = 0;
		int invalid = 0;
		List<AccountHolder> list = new ArrayList<AccountHolder>();
		System.out.println("***************************");
		System.out.println("Welcome to Mahe bank ");
		System.out.println("***************************");
		AccountOperation accountOperation = new AccountOperationImpl();
		while (true) {
			if (invalid > 3) {
				System.out.println("You Reached your Maximum Limit!!...Try again after sometime..BYE!!");
				System.exit(0);
			}
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.print("1.Account Creation" + "  " + "2.Login" + "  " + "3.Exit");
			System.out.println();
			System.out.println("----------------------------------------------");
			try {
				System.out.println("Enter your choice ::");
				option = sc.nextInt();
				sc.nextLine();
				switch (option) {
				case 1: {

					int exception = accountOperation.createAccount();
					if (exception == 0) {
						System.out.println();
						invalid = 0;
						System.out.println("Account Created!...");

						System.out.println("Go to login page");
						break;

					}
				}
				case 2: {
					System.out.println();
					System.out.println("---------");
					System.out.println("Login");
					System.out.println("---------");
					System.out.println();
					System.out.println("Enter your username ::");
					String username = sc.nextLine();
					AccountOperation account = new AccountOperationImpl();
					boolean check = account.accountCheck(username);
					if (check == false) {
						System.out.println("Account not found");
						break;
					}

					Boolean res = accountOperation.login(username);

					if (res) {
						System.out.println();
						System.out.println("Login success!..");
						System.out.println();
						operations();
						continue;
					} else {
						invalid++;
						System.out.println();
						System.out.println("invalid credential ! Try again");
					}

					break;
				}
				case 3: {
					System.out.println("Thanks for using the Application");
					System.out.println("Have a nice day! Bye..");
					System.exit(0);

				}
				default: {
					System.out.println("Enter correct input");
					break;
				}
				}

			} catch (Exception e) {
				System.out.println("Entered Invalid Input !! Try again next time..Bye ");
				break;
			}

		}
	}

	private static void operations() {
		Scanner sc = new Scanner(System.in);
		BankOperations bankOperations = new BankOperationsImpl();
		int choice = 0;
		while (true) {
			System.out.println("Our Services");
			System.out.println("----------------------------------------------");
			System.out.print("1.checkBalance " + "\n" + "2.deposit" + "\n" + "3.WithDraw" + "\n" + "4. HomePage");
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println();
			try {
				System.out.println("Enter your Choice:");
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1: {
					System.out.println("Enter your Account number ::");
					String accNo = sc.nextLine();
					Integer balance = bankOperations.checkBalance(accNo);
					if (balance != -1) {
						System.out.println("Balance in your account ::" + balance);
						System.out.println();
					} else
						System.out.println("No account Found ! ");
					break;
				}
				case 2: {
					System.out.println("Enter your Account number ::");
					String accNo = sc.nextLine();
					System.out.println("Enter the amount ::");
					Integer amount = sc.nextInt();
					sc.nextLine();
					int deposit = bankOperations.deposit(accNo, amount);
					if (deposit != -1) {
						System.out.println("Amount Deposited Successfully...");
						System.out.println("Balance in your account is:" + deposit);
						System.out.println();

					} else {
						System.out.println("No account Found !.. ");
						System.out.println();

					}
					break;
				}
				case 3: {
					System.out.println("Enter your Account number ::");
					String accNo = sc.nextLine();
					System.out.println("Enter the amount ::");
					Integer amount = sc.nextInt();
					sc.nextLine();
					int withdraw = bankOperations.withDraw(accNo, amount);
					if (withdraw == -2) {
						System.out.println("Not Sufficient Balance!!...");

					} else if (withdraw != -1) {
						System.out.println("Amount Withdrawn Successfully..");
						System.out.println("Balance in your account is:" + withdraw);
						System.out.println();
					} else {
						System.out.println("No account Found !!! ");
						System.out.println();
					}
					break;
				}
				case 4: {
					System.out.println("Logged out Successfully!!..");
					return;

				}
				default: {
					System.out.println("Invalid input ! Please ENTER Correct choice");
					continue;
				}

				}
			} catch (Exception e) {
				System.out.println("Entered Invalid Input !! Try again next time..Bye ");
				break;
			}
		}
	}

}
