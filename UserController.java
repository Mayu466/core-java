package com.controller;
import com.service.*;
public class UserController
{
public static void main(String[]args)
{
System.out.println("user controller");
UserService u = new UserService();
System.out.println(u.userId);
u.m1();
}
}