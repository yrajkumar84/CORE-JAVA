package com.nt;

 class GLoan  extends Loan{

	@Override
	public double getLoan() {
		// TODO Auto-generated method stub
		return 10.1;
	}
	public static void main(String[] args) {
		
		GLoan g=new GLoan();
		
		System.out.println(g.getLoan());
	}

	
	
}
