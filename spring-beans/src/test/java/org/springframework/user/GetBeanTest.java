package org.springframework.user;

public abstract class GetBeanTest {



	public void showMe(){
		getBean().showMe();
	}

	public abstract User getBean();
}
