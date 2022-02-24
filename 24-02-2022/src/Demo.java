
public class Demo {

	// class defination -  collection simillar and dissimilar attributes and method(logical, virtual)
	
	
	//variable (attributes) - it is empty pot, it is property of class
	int a,x,y,z; //symillar
	float b;
	String c;
	
	
	//method - to fullfill some functionality we use method;
	//syntax ---> 1>access_modifier 2>return_type 3>method_name 4>variable/ATTRIBUTE/parameter
	//non paramitarised method/ simple method
	public void printName()
	{
		System.out.println("My name is pratik");
	}
	
	// parameterised methos
	public void printName(String name)
	{
		System.out.println("my name is "+name);
	}
	
	
	public static void main(String[] args)
	{
		//cntr+space
		//shortcut -> syso + ctrl + space
		System.out.println("Hello world");
		
		//Object- basic runtime entity(phisically exist)
		//reprsentative of class
		Demo prafulla = new Demo();
		prafulla.printName();
		prafulla.printName("Shankar");
	}
}
