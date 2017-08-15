package org.lc.corejava.annotation;


public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		Class<UserService> userClass = UserService.class;
		Permission annotation = userClass.getAnnotation(Permission.class);
		System.out.println(annotation.value());
	}
	
	public static void test2(){
		Class<Permission> permissionClass = Permission.class;
	}
}
