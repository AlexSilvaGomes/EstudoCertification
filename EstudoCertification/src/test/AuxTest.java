package test;


public  strictfp class AuxTest {

	
	public static void main(String[] args) {
        
		A[] ab = new A[5];
		ab[0]=new A();
        
		boolean b1=false;
		 boolean b2=true;
		 Object ob= (b2=false)?((b1=true)?"A":(b1=false)?"B":9800L):((b1=false)?"C":(b2==false)?"D":new java.util.Date());
		 System.out.print(ob);
		 
		 System.out.printf("%1$,+010d",7252);
		
		System.out.printf("\nCurrent value is %,+-50.1f",-12300.000);
		
	}
	
}


class A{}
class B extends A{}

