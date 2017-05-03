package my.cxf.itf;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import my.cxf.vo.User;
@WebService
public interface IHelloWorld {
	String sayHi(@WebParam(name="text")String text);
    String sayHiToUser(User user);
    String[] SayHiToUserList(List<User> userList);
}
