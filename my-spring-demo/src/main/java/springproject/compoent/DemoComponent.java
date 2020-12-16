package springproject.compoent;

import org.springframework.stereotype.Component;

/**
 * @Description:bean
 * @Author: 刘爽
 * @Date: 2020/10/30 14:29
 **/
@Component
public class DemoComponent {
	public DemoComponent(){
		System.out.println("this is a bean!");
	}

	public String testBeanFunc(){
		return "this is a DemoComponent Bean's func";
	}
}
