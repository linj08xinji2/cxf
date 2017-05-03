package my.cxf.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import my.cxf.itf.IHelloWorld;
import my.cxf.vo.User;

@WebService(endpointInterface = "my.cxf.itf.IHelloWorld", serviceName ="IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {
	Map<Integer, User> users = new LinkedHashMap<Integer, User>();

	public String sayHi(@WebParam(name = "text") String text) {
		return "Hello," + text;
	}

	public String sayHiToUser(User user) {
		users.put(users.size() + 1, user);
		return "Hello," + user.getName();
	}

	public String[] SayHiToUserList(List<User> userList) {
		String[] result = new String[userList.size()];
		int i = 0;
		for (User u : userList) {
			result[i] = "Hello " + u.getName();
			i++;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}