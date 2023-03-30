package main.java;

import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		optionMenu.getAllAccounts();
		optionMenu.getTransactionHistory();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("Welcome to the main.java.ATM Project!");
	}
}
