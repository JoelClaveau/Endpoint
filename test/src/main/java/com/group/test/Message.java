/**
 * 
 */
package com.group.test;


public class Message {
	
	public static int x;
	public String message1 = "400 Bad Request";
	public String message2 = "Le nombre est impair";
	public String message3 = "La somme factorielle de"+ x +" est :";
	public String message4 = "Le nombre est:" + x;
	
	
	public Message(int x, String message1, String message2, String message3, String message4) {
		super();
		this.x = x;
		this.message1 = message1;
		this.message2 = message2;
		this.message3 = message3;
		this.message4 = message4;
	}
		
	public Message(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}

	public String Message1(String m) {
		 if (x < 0) {
	            m = message1 ;
	        }
		return m;		
	}

	public int getMessage2(int f) {
			int n = 0;
			int a = 0;
			int b = 1;
		if(x %2 == 1){
			
			while(n < x){
			
			f = Fibonacci(n,a,b);
			}
		}
		System.out.println(message2);
		return f;
	}


	public int getMessage3(int f) {
		if(x %2 == 0 ) {
            if(x < 51) {
            	f = Fact(x);
            }
		}
		System.out.println(message3) ;
		return f;
	}
	
	public int getMessage4(int n) {

		 if(x %2 == 0 ) {
           if(x > 50) {
            n = x;
           }
       }
		 System.out.println(message4);
		 return n;
	}

	
	public int Fact(int n){
		
	      int f = 1;
	        for (int i=1; i<=n; i++){
	        f=f*i; 
			}
			return f;   
		}
			
		public int Fibonacci(int n,int a, int b){
			int a1 = 0 ;
			int b1 = 1;
	    		if(n==0) {
	    			return a1;
	    		}
	    		else if(n==1) {
	    			return b1;
	    		}
	    		else {
	    			return Fibonacci(n -1,b1,a1+b1);
	    		}
	    		
			
		}	
	
	
	

}
