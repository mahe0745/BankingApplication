
public interface AccountOperation {
	public int createAccount();
	
	public boolean login(String username);
	
	public void displayAccount(AccountHolder acc);

	public boolean accountCheck(String username);
}
