package com.cts.model;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statistics")
public class Statistics {
	@Id
	@Column(name = "id")
	private int id;
    @Column(name = "amount", nullable = true)
    private double amount;
  
     public Statistics(int id,  double amount) {
		this.id = id;
		this.amount = amount;
		}
    public int getId() {
		return id;
	}
    public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    @Override
	public String toString() {
	return "Statistics [id=" + id + ", amount=" + amount + "]";
	}
}
