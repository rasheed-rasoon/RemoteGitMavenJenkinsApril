package java8NewFeatures;



	class BaseClass implements Normalinterface,NormalInterface2
	 {

		public void display() {
			System.out.println("implemented the method body of display ");
			
		}
		 
		public static void main(String args[])
		{
			Normalinterface b=new BaseClass();
			b.display();
		}
	 }


