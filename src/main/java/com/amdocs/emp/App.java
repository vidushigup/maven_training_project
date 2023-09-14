package com.amdocs.emp;

/**
 * Hello world!
 *
 */

public class App 
{
	int emp_id, emp_salary;
	String emp_name;
	int getid() {
		return emp_id;
	}
	int getsalary() {
		return emp_salary;
	}
	String getname() {
		return emp_name;
	}
	void setid(int id) {
		emp_id=id;
	}
	void setsalary(int s) {
		emp_salary=s;
	}
	void setname(String name) {
		emp_name=name;
	}
	App(int id, int salary, String name){
		emp_id=id;
		emp_name=name;
		emp_salary=salary;
	}
	@Override
    public String toString() {
        return this.emp_id + " " + this.emp_name + " "+this.emp_salary;
    }
    public static void main( String[] args )
    {
        App e1=new App(101,45000,"nidhi");
        App e2=new App(102,85000,"shreya");
        App e3=new App(103,77000,"anusha");
    	System.out.println( "Employee Details" );
    	
    	System.out.println(e1);
    	System.out.println(e2);
    	System.out.println(e3);
    }
}
