package com.policy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String policyName;
	private String policyType;
	private int policyDuration;
	private Double policyCost;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPolicyName() {
		return policyName;
	}


	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}


	public String getPolicyType() {
		return policyType;
	}


	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}


	public int getPolicyDuration() {
		return policyDuration;
	}


	public void setPolicyDuration(int policyDuration) {
		this.policyDuration = policyDuration;
	}


	public Double getPolicyCost() {
		return policyCost;
	}


	public void setPolicyCost(Double policyCost) {
		this.policyCost = policyCost;
	}


	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyName=" + policyName + ", policyType=" + policyType + ", policyDuration="
				+ policyDuration + ", policyCost=" + policyCost + "]";
	}
	
	

}
