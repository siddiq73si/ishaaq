//Q-63		Same package p1
package p1;	
class SamePackage{
	SamePackage(){
		Protection p = new Protection();
		System.out.println("class SamePackage Constructor");
		//System.out.println("private a = "+a);
		System.out.println("default b = "+p.b);
		System.out.println("protected c = "+p.c);
		System.out.println("public d = "+p.d);
		}
}
