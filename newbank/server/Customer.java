package newbank.server;

import java.util.ArrayList;

public class Customer {
	
	private ArrayList<Account> accounts;
	private String password;
	
	public Customer(String password) {
		accounts = new ArrayList<>();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	public String accountsToString() {
        StringBuilder s = new StringBuilder();
        for(Account a : accounts) {
            s.append(a.toString());
        }
        return s.toString();
    }

	public void addAccount(Account account) {
		accounts.add(account);		
	}
}
