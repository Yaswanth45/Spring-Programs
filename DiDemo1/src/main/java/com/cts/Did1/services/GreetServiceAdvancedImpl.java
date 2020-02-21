package com.cts.Did1.services;

public class GreetServiceAdvancedImpl implements GreetService {
	
	private GreetNoteProvider gmp;
	
	public GreetServiceAdvancedImpl() {
		
	}

	public GreetServiceAdvancedImpl(GreetNoteProvider gmp) {
		super();
		this.gmp = gmp;
	}

	public GreetNoteProvider getGmp() {
		return gmp;
	}

	public void setGmp(GreetNoteProvider gmp) {
		this.gmp = gmp;
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gmp.getGreetNote()+" "+userName;
	}
	
}
