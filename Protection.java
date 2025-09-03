//Q-61		package p1
package p1;	
public class Protection {
	private int a = 1;
	int b = 2;
	protected int c = 3;
	public int d = 4;
	public Protection(){
		System.out.println("Base Constructor");
		System.out.println("private a = "+a);
		System.out.println("default b = "+b);
		System.out.println("protected c = "+c);
		System.out.println("public d = "+d);	
	}
}