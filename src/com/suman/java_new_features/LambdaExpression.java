package com.suman.java_new_features;


interface Intref{// functional interface
	int x=5;
	public void m1();
}


public class LambdaExpression {
	int x = 10;
	public void m2() {
		int y = 20;
		//Lambda expression
		Intref i=()->{//() refers to m1()
			x+=5;
			System.out.println(x);//10 always class variable
//			y+=5; local var are freeze so final or effectively final only if I am using it
			
			System.out.println(y);// 20 local variable
		};//closure block ended
		
		i.m1();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExpression lb = new LambdaExpression();
		lb.m2();
	}

}
