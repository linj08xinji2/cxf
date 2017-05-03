package my.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import my.cxf.itf.IHelloWorld;
import my.cxf.vo.User;

public class HelloWorldClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//首先右键run as 运行my.cxf.server.webServiceApp类，然后再运行这段客户端代码
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(IHelloWorld.class);
		jwpfb.setAddress("http://localhost:8080/IhelloWorld");
		IHelloWorld hw = (IHelloWorld) jwpfb.create();
        User user = new User();
        user.setName("马克思");
        user.setDescription("怀念马克思");
        System.out.println(hw.sayHiToUser(user));
	}
    }
