package cn.itheima.c_param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import cn.itheima.domain.User;

//struts2如何获得参数-方式2
public class Demo10Action extends ActionSupport implements ModelDriven<User> {

	//准备user成员变量
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
    public String execute() throws Exception{
    	System.out.println(user);
    	return SUCCESS;
    }
	


	
}
