package com.policy.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;

import com.policy.entity.Policy;
import com.policy.repository.PolicyRepository;
import com.policy.service.PolicyService;
@Service
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	private PolicyRepository policyRepository;
	@Override
	public List<Policy> getAllPolicies() {
		List<Policy> pol =policyRepository.findAll();
		return pol;
	}

	@Override
	public Policy getPolicyById(int id) {
		Optional<Policy> p = policyRepository.findById(id);
		Policy pol = null;
		if(p.isPresent())
		{
			pol=p.get();
		}
		return pol;
	}

	@Override
	public Policy savePolicy(Policy p) {
		Policy pol = policyRepository.save(p);
		return pol;
	}

	@Override
	public Policy updatePolicy(Policy p,int id) {
		
		Policy pol= getPolicyById(id);
		if(pol.getId()==id)
		{
			p.setId(id);
			pol = policyRepository.save(p);			
		}
		return pol;
	}

	
	@Override
	public String deletePolicy(int id) {
		String msg = "";
		boolean policyExist=policyRepository.existsById(id);
		if(policyExist)
		{
			policyRepository.deleteById(id);
			msg="Policy Succesfully Deleted";
		}
		else
		{			
			msg = "Cannot Delete Policy";
		}
				
	return msg;	
	}

}
