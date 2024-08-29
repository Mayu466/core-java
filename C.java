package com.c;
import com.a.*;
import com.b.*;
public class C{

public static void main (String [] args)
{
System.out.println("....Main Method....");
A a = new A();
System.out.println(a.p);
a.m1();

B b = new B();
System.out.println(b.q);
b.m2();
}
}