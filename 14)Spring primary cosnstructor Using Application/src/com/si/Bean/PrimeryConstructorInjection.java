package com.si.Bean;
//jaya time la refrence object varialble no dakhavto ty timela to String method ovverride kara
//prmiary Constructor sati bean madhe tag madhe fackt value ghave name gheua ne
// value=""je display karacha ahe te value madhe dyve

public class PrimeryConstructorInjection {
	private int empID;
	private String empName;
	private long MoNo;

	public PrimeryConstructorInjection(int empID, String empName, long moNo) {
		super();
		this.empID = empID;
		this.empName = empName;
		MoNo = moNo;
	}

	@Override
	public String toString() {
		return "PrimeryConstructorInjection [empID=" + empID + ", empName=" + empName + ", MoNo=" + MoNo + "]";
	}
	
	

}
