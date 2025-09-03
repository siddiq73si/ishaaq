//Q-62		Same package p1
package p1;	
class Derived extends Protection {
		Derived(){
		System.out.println("class Derived Constructor");
		//System.out.println("private a = "+a);
		System.out.println("default b = "+b);
		System.out.println("protected c = "+c);
		System.out.println("public d = "+d);
		}
}
