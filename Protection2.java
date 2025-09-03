//Q-65		Difffrent package com.p1 with inheritance.(class q_65 is the sub class of q_61)
package com.p1;	
class Protection2 extends p1.Protection{
		Protection2(){
		System.out.println("differnt Package and subclass : class Protection2 Constructor");
		//System.out.println("private a = "+a);
		//System.out.println("default b = "+b);
		System.out.println("protected c = "+c);
		System.out.println("public d = "+d);
		
		}
}
