
package com.itistech;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trade {

	private int id;
	private int noOfSetAttribte;
	private String attribute1;
	private String attribute2;
	private String attribute3;
	private String attribute4;
	private String attribute5;
	private String attribute6;
	private String attribute7;
	private String attribute8;
	private String attribute9;
	private int amount;

	public Trade(int id, int noOfSetAttribte, String attribute1, String attribute2, String attribute3,
			String attribute4, String attribute5, String attribute6, String attribute7, String attribute8,
			String attribute9, int amount) {
		super();
		this.id = id;
		this.noOfSetAttribte = noOfSetAttribte;
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.attribute3 = attribute3;
		this.attribute4 = attribute4;
		this.attribute5 = attribute5;
		this.attribute6 = attribute6;
		this.attribute7 = attribute7;
		this.attribute8 = attribute8;
		this.attribute9 = attribute9;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfSetAttribte() {
		return noOfSetAttribte;
	}

	public void setNoOfSetAttribte(int noOfSetAttribte) {
		this.noOfSetAttribte = noOfSetAttribte;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getAttribute7() {
		return attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", noOfSetAttribte=" + noOfSetAttribte + ", attribute1=" + attribute1
				+ ", attribute2=" + attribute2 + ", attribute3=" + attribute3 + ", attribute4=" + attribute4
				+ ", attribute5=" + attribute5 + ", attribute6=" + attribute6 + ", attribute7=" + attribute7
				+ ", attribute8=" + attribute8 + ", attribute9=" + attribute9 + ", amount=" + amount + "]";
	}

	
}
