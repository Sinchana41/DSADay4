package org.collectionsusinginnbiltmethods.map;

public class MainPhoneBook {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();

		phoneBook.addContact("Sinchana", "9876543210");
		phoneBook.addContact("Shyam", "9123456780");
		phoneBook.addContact("Ajay", "9988776655");

		System.out.println();
		phoneBook.displayContacts();

		System.out.println();
		phoneBook.searchContact("Sinchana");

		System.out.println();
		phoneBook.removeContact("Ajay");

		System.out.println();
		phoneBook.displayContacts();
	}
}
