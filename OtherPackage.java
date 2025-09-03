//Q-66  Other Package with NonSubclass
package com.p1;	
//import p1.*;
class OtherPackage{
		OtherPackage(){
		p1.Protection p = new p1.Protection();
		System.out.println("Other Package and Nonsubclass : class OtherPackage Constructor");
		//System.out.println("protected c = "+c);
		System.out.println("public d = "+p.d);
		
		}
}
