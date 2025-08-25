package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class PhoneBook {
	private TreeMap<String, String> contacts;

	public PhoneBook() {
		contacts = new TreeMap<>();
	}

	// Add a contact
	public void addContact(String name, String phone) {
		contacts.put(name, phone);
		System.out.println("Contact added: " + name + " -> " + phone);
	}

	// Remove a contact
	public void removeContact(String name) {
		if (contacts.remove(name) != null) {
			System.out.println("Contact removed: " + name);
		} else {
			System.out.println("Contact not found: " + name);
		}
	}

	// Search for a contact by name
	public void searchContact(String name) {
		String phone = contacts.get(name);
		if (phone != null) {
			System.out.println("Found: " + name + " -> " + phone);
		} else {
			System.out.println("Contact not found: " + name);
		}
	}

	// Display all contacts
	public void displayContacts() {
		System.out.println("Phone Book:");
		for (Map.Entry<String, String> entry : contacts.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}