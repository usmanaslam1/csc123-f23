
public class TestClass123 {
	
	public static void main(String[] args) {
		
		Animal a=new Animal2(null,null,null);
		Animal2 a2=new Animal2(null,null,null);
		
		Object o=(Object)new Animal2(null,null,null);
		Object o2=(Object)new Animal(null,null,null);
		Object o3=(Object)"Hello world";
		
		doSomething(a);
		doSomething(a2);
		doSomething("Hello World!!");
		
		
	}
	
	public static void doSomething(Object o) {
		System.out.println(o);
		
		if(o instanceof Animal) {
			System.out.println("This is animal");
		}
		
	}

	
	
	
	
}
