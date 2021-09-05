package gitJuly21;

public class Calci {
	
	int n1 = 20;
	int n2 = 10;
	
	void sub(){
		int sub = n1-n2;
		System.out.println("Subtraction of Two Numbers is "+sub);
		
	}
	
	void mul(){
		int mul = n1*n2;
		System.out.println("Multiplication of Two Numbers is "+mul);
	}
	
	void div(){
		int div = n1/n2;
		System.out.println("Division of Two Numbers is "+div);
	}
	
	void add(){
		int sum = n1+n2;
		System.out.println("Addition of Two Numbers is "+sum);
	}
	
	public static void main(String[] args){
		Calci calculator = new Calci();
		calculator.div();
		calculator.mul();
		calculator.add();
		calculator.sub();
	}


}
