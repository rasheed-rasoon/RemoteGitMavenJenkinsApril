package java8NewFeatures;

public class java8ClassWithDefault implements Java8InterfaceWithDefault  {

	public void add() {
		// TODO Auto-generated method stub
System.out.println("method body implemented  in child class");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java8ClassWithDefault obj=new java8ClassWithDefault();
		obj.add();
		obj.log();
	}

	
}
