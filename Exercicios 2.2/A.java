class A{
	public static void main(String[] args){
		int x = 15;
		int y = x;
		y++;
		x++;
		int z = y;
		z--;
		System.out.println(x+ y + z);
	}
}