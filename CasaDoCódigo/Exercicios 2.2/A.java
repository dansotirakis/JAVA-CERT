class B{
	int v = 15;
}
class A{
	public static void main(String[] args){
		B x = 15;
		B y = x;
		y.v++;
		x.v++;
		B z = y;
		z.v--;
		System.out.println(x.v+ y.v + z.v);
	}
}