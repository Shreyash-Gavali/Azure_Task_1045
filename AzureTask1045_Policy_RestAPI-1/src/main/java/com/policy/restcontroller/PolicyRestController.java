package com.policy.restcontroller;

import java.net.http.HttpClient;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.policy.entity.Policy;
import com.policy.service.PolicyService;
import com.policy.service.impl.PolicyServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class PolicyRestController {

	
	@Autowired
	private PolicyServiceImpl policyService;
	
	@GetMapping("/policies") // returns all policies 
	public List<Policy> getAllPolicies() {
		List<Policy> pol=policyService.getAllPolicies();
		return pol;
	}
	
	@GetMapping("/policies/{id}")
	public Policy getPolicyById(@PathVariable int id)
	{
		Policy p = policyService.getPolicyById(id);
		return p;
	}
	
	@PostMapping("/policies")
	public Policy savePolicy(@RequestBody Policy pol)
	{
		Policy pol2 = policyService.savePolicy(pol);
		return pol2;
	}
	
	@PutMapping("/policies/{id}")
	public Policy policies(@PathVariable int id,@RequestBody Policy pol) {
		Policy p = policyService.updatePolicy(pol, id);
		return p;
	}
	@DeleteMapping("/policies/{id}")
	public String policies(@PathVariable int id) {
		String msg =policyService.deletePolicy(id);
		return msg;
	}
}
