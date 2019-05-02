package java8NewFeatures;

public interface Java8InterfaceWithStatic {
	
	void display();
	
	static void methodWithStatic()
	{
		System.out.println("Implementation has been provided for methodWithStatic in interface itself");
	}

}
