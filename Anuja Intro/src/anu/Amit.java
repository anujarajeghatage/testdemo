package anu;

public class Amit {
	void print()
	{
		System.out.println("Amit Ghatage");
	}
	void fibonnaci()
	{
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amit obj = new Amit();
		//obj.print();
		obj.fibonnaci();
	}

}
