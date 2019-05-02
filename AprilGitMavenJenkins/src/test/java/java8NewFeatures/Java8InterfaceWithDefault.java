package java8NewFeatures;

public interface Java8InterfaceWithDefault {
void add();

default void log()
{
	System.out.println("method body which is written in interface itself");
}
}
