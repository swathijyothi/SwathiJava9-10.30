package com.firstProgram;


class L{
	int l=10,b=10;
}
class M extends L{
	int a=l*b;
	void display() {
		System.out.println("area="+a);
	}
	
}
class N extends M{
	void show() {
		System.out.println("l="+l+"  "+"b="+b+"  "+"a="+a);
	}
	
}

	


public class MultilevelInheritance {
	public static void main(String[] args) {
		N n=new N();
		n.display();
		n.show();
		System.out.println("l="+n.l);

		
	}

}
