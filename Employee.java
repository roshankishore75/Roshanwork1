package classjava;

public class Employee {

	String eid="1112";
	String ename= "roshan";
	String gender="male";
	Float esal= 5000.0f;
	String eaddress="hyderbad";
	
	void display_Employee()
	{
		System.out.println("Employee details:");
		System.out.println("-----------------");
		System.out.println("Employee id:+eid");
		System.out.println("Employee name:"+ename);
		System.out.println("employee gender:"+gender);
		System.out.println("employee salary:"+esal);
		System.out.println("employee address:"+eaddress);
	}
}

