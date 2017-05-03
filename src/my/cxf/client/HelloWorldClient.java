package my.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import my.cxf.itf.IHelloWorld;
import my.cxf.vo.User;

public class HelloWorldClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�����Ҽ�run as ����my.cxf.server.webServiceApp�࣬Ȼ����������οͻ��˴���
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(IHelloWorld.class);
		jwpfb.setAddress("http://localhost:8080/IhelloWorld");
		IHelloWorld hw = (IHelloWorld) jwpfb.create();
        User user = new User();
        user.setName("���˼");
        user.setDescription("�������˼");
        System.out.println(hw.sayHiToUser(user));
	}
    }
