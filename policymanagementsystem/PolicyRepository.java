package org.collectionsusinginnbiltmethods.policymanagementsystem;

import java.util.*;

public interface PolicyRepository {

	//OCP & DIP
	void addPolicy(Policy policy);
	Policy getPolicy(String policyNumber);
	List<Policy> getPoliciesByHolder(String holderName);
	List<Policy> getExpiringWithin(int days);
	void removeExpiredPolicies();
	Collection<Policy> getAllPolicies();
}
