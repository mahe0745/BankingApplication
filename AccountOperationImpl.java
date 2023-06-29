import java.util.*;

public class AccountOperationImpl implements AccountOperation {
	static Integer Accountno = 234543;
	static List<AccountHolder> list = new ArrayList<AccountHolder>();

	public AccountOperationImpl() {
		super();
	}

	public int createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("Account Creation");
		System.out.println("--------------------");
		System.out.println();
		try {
			System.out.println("Enter your name ::");
			String name = sc.nextLine();
			System.out.println("Enter your MobileNo ::");
			String mobileNo = sc.nextLine();
			System.out.println("Enter your userName ::");
			String userID = sc.nextLine();
			System.out.println("Enter your password ::");
			String password = sc.nextLine();
			Integer balance = 0;
			Accountno++;
			Integer no = Accountno;
			String accNo = no.toString();
			String accBranch = "Aruppukottai";
			String accType = "savings";
			Account account = new Account(accNo, accBranch, accType);
			AccountHolder accountHolder = new AccountHolder(name, mobileNo, userID, password, balance, account);
			displayAccount(accountHolder);
			list.add(accountHolder);
		} catch (Exception e) {
			System.out.println("Enter correct input");
			return -1;
		}
		return 0;

	}

	public boolean login(String username) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter your password ::");
			String password = sc.nextLine();
			// System.out.println(list.size());
			for (AccountHolder a : list) {
				if ((a.getUserId().equals(username)) && (a.getPassword().equals(password))) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Input");
			return false;
		}
		return false;
	}

	public void displayAccount(AccountHolder acc) {

		System.out.println();
		System.out.println("------------------ ");
		System.out.println("Account Details");
		System.out.println("-------------------");
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s ", "Name", "MobileNumber", "Account Number",
				"Account Type", "Branch"));
		System.out.println();
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s ", acc.getName(), acc.getMobileNo(),
				acc.getAccount().getAccNo(), acc.getAccount().getAccType(), acc.getAccount().getAccBranch()));
		return;
	}
	
	public boolean accountCheck(String userName) {
		for(AccountHolder a:list) {
			if(a.getUserId().equals(userName))
				return true;
		}
		return false;
	}
}
