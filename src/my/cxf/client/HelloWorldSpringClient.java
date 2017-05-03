package my.cxf.client;

import java.util.ArrayList;
import java.util.List;

import my.cxf.itf.IHelloWorld;
import my.cxf.vo.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Resource resource= new FileSystemResource("F:/workspaces4me2013/.metadata/.me_tcat/WEB-INF/classes/applicationContext.xml");   
		//BeanFactory factory= new XmlBeanFactory(resource ); 
		ApplicationContext factory = new ClassPathXmlApplicationContext("/applicationContext.xml");
		IHelloWorld client = (IHelloWorld)factory.getBean("client");
        User user1 = new User();
        user1.setName("马克思");
        user1.setDescription("怀念马克思");
        User user2 = new User();
        user2.setName("恩格斯");
        user2.setDescription("怀念恩格斯");
        List<User> userList= new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        String[] res = client.SayHiToUserList(userList);
        System.out.println(res[0]);
        System.out.println(res[1]);  
        
    }

}
