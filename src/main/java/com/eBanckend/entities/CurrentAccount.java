package com.eBanckend.entities;

import java.util.Date;

import com.eBanckend.enums.AccountStatus;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount {
	private double decouvert; //overdrift

	
	public void setDecouvert(double decouvert) {
		this.decouvert=decouvert;

	}

	public void setId(String id) {
		this.id=id;

	}

	


}
