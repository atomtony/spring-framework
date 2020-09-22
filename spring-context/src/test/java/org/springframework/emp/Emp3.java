package org.springframework.emp;



public class Emp3  implements People{

	private Department department;

	private String name;


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	public void test(String name){
		System.out.println("test");
	}

	@Override
	public void getName() {
		System.out.println("getName");
	}


}
