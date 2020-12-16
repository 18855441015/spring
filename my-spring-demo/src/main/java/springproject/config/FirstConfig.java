package springproject.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springproject.compoent.DemoComponent;

/**
 * @Description:测试配置类
 * @Author: 刘爽
 * @Date: 2020/10/30 14:29
 **/
@ComponentScan("springproject.compoent")
public class FirstConfig {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FirstConfig.class);
		DemoComponent demoComponent = applicationContext.getBean(DemoComponent.class);
		System.out.println(demoComponent.testBeanFunc());
	}
}
