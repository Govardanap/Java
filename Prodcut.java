package com.example.demo;

import java.util.Date;

public class Prodcut {
	int pid;
	String Pname;
	String pdesc;
	Date domf;
	Date doexp;
	String supplier;
	int qty;
	
	public Prodcut() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Prodcut(int pid, String pname, String pdesc, Date domf, Date doexp, String supplier, int qty) {
		super();
		this.pid = pid;
		Pname = pname;
		this.pdesc = pdesc;
		this.domf = domf;
		this.doexp = doexp;
		this.supplier = supplier;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public Date getDom() {
		return domf;
	}
	public void setDom(Date dom) {
		this.domf = dom;
	}
	public Date getDoeep() {
		return doexp;
	}
	public void setDoeep(Date doeep) {
		this.doexp = doeep;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Prodcut [pid=" + pid + ", Pname=" + Pname + ", pdesc=" + pdesc + ", domf=" + domf + ", doexp=" + doexp
				+ ", supplier=" + supplier + ", qty=" + qty + "]";
	}
	
	

}
