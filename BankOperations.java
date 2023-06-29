
public interface BankOperations {
	public int checkBalance(String accNo);
	public int deposit(String accNo, Integer amount);
	public int withDraw(String accNo, Integer amount);
	public AccountHolder getAccount(String accNo) ;
	
}
