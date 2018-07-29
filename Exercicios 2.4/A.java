class B{
		
}
class A{
	public static void main (String[] args) {
		B b = new B();
		for (int i = 0; i < 10; i++)
			b = new B();
		System.out.println("end!");
	}
}