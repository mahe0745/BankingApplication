import java.util.*;

public class BankOperationsImpl implements BankOperations{

	public int checkBalance(String accNo) {
		AccountHolder acc = getAccount(accNo);
		if (acc != null) {
			return acc.getBalance();
		}
		return -1;
	}

	public int deposit(String accNo, Integer amount) {
		AccountHolder acc = getAccount(accNo);
		if (acc != null) {
			Integer balance = acc.getBalance();
			balance = balance + amount;
			acc.setBalance(balance);
			return acc.getBalance();
		}
		return -1;

	}

	public int withDraw(String accNo, Integer amount) {
		AccountHolder acc = getAccount(accNo);
		if (acc != null) {
			Integer balance = acc.getBalance();
			if (balance >= amount) {
				balance = balance - amount;
				acc.setBalance(balance);
				return acc.getBalance();
			} else {
				return -2;
			}
		}
		return -1;

	}

	public AccountHolder getAccount(String accNo) {
		List<AccountHolder> list = AccountOperationImpl.list;
		// System.out.println(list.size());
		for (AccountHolder acc : list) {
			// System.out.println(acc.getAccount().getAccNo());
			if (acc.getAccount().getAccNo().equals(accNo))
				return acc;
		}

		return null;
	}

}
