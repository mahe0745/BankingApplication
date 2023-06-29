
public class AccountHolder {
	private String name;
	private String mobileNo;
	private String userId;
	private String password;
	private Account account;
	private Integer balance;

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public AccountHolder(String name, String mobileNo, String userId, String password, Integer balance,
			Account account) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.userId = userId;
		this.password = password;
		this.account = account;
		this.balance = balance;
	}

	public String getUserId() {
		return userId;
	}

	public Integer getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getAccNO() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public Account getAccount() {
		return account;
	}

}
