package com.policy.service;

import java.util.List;

import com.policy.entity.Policy;

public interface PolicyService {

	public List<Policy> getAllPolicies();
	public Policy getPolicyById(int id);
	public Policy savePolicy(Policy p);
	public Policy updatePolicy(Policy p,int id);
	public String deletePolicy(int id);
}
