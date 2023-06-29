 
public class Account {
	private String accNo;
	private String accBranch;
	private String accType;

	public String getAccNo() {
		return accNo;
	}

	public String getAccBranch() {
		return accBranch;
	}

	public String getAccType() {
		return accType;
	}

	public Account(String accNo, String accBranch, String accType) {
		super();
		this.accNo = accNo;
		this.accBranch = accBranch;
		this.accType = accType;
	}

}
