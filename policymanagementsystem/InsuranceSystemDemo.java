package org.collectionsusinginnbiltmethods.policymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class InsuranceSystemDemo {

	public static void main(String[] args) {
		// Using HashMap (fast retrieval)
		PolicyManagement hashMapStore = new PolicyManagement(new HashMap<>());

		// Using LinkedHashMap (insertion order)
		PolicyManagement linkedMapStore = new PolicyManagement(new LinkedHashMap<>());

		// Using TreeMap (sorted by policy number, but we could wrap for expiry date too)
		PolicyManagement treeMapStore = new PolicyManagement(new TreeMap<>());

		// Sample policies
		Policy p1 = new Policy("P101", "Ram", LocalDate.now().plusDays(10));
		Policy p2 = new Policy("P102", "Seetha", LocalDate.now().plusDays(40));
		Policy p3 = new Policy("P103", "Krishna", LocalDate.now().plusDays(5));
		Policy p4 = new Policy("P104", "Radha", LocalDate.now().minusDays(1)); // expired

		// Adding policies
		hashMapStore.addPolicy(p1);
		hashMapStore.addPolicy(p2);
		hashMapStore.addPolicy(p3);
		hashMapStore.addPolicy(p4);

		System.out.println("All Policies:");
		hashMapStore.getAllPolicies().forEach(System.out::println);

		System.out.println("\n Policy by Number (P102):");
		System.out.println(hashMapStore.getPolicy("P102"));

		System.out.println("\n Policies by Holder (Ram):");
		hashMapStore.getPoliciesByHolder("Ram").forEach(System.out::println);

		System.out.println("\n Policies expiring in next 30 days:");
		hashMapStore.getExpiringWithin(30).forEach(System.out::println);

		System.out.println("\n Removing expired policies...");
		hashMapStore.removeExpiredPolicies();
		hashMapStore.getAllPolicies().forEach(System.out::println);
	}
}
