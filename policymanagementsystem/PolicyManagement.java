package org.collectionsusinginnbiltmethods.policymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagement implements PolicyRepository {
	private Map<String, Policy> policyMap; // Flexible (HashMap, LinkedHashMap, TreeMap)

	public PolicyManagement(Map<String, Policy> policyMap) {
		this.policyMap = policyMap;
	}

	@Override
	public void addPolicy(Policy policy) {
		policyMap.put(policy.getPolicyNumber(), policy);
	}

	@Override
	public Policy getPolicy(String policyNumber) {
		return policyMap.get(policyNumber);
	}

	@Override
	public List<Policy> getPoliciesByHolder(String holderName) {
		List<Policy> result = new ArrayList<>();
		for (Policy policy : policyMap.values()) {
			if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) {
				result.add(policy);
			}
		}
		return result;
	}

	@Override
	public List<Policy> getExpiringWithin(int days) {
		List<Policy> result = new ArrayList<>();
		LocalDate now = LocalDate.now();
		LocalDate threshold = now.plusDays(days);
		for (Policy policy : policyMap.values()) {
			if (!policy.getExpiryDate().isBefore(now) && !policy.getExpiryDate().isAfter(threshold)) {
				result.add(policy);
			}
		}
		return result;
	}

	@Override
	public void removeExpiredPolicies() {
		LocalDate now = LocalDate.now();
		policyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(now));
	}

	@Override
	public Collection<Policy> getAllPolicies() {
		return policyMap.values();
	}
}