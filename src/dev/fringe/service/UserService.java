package dev.fringe.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;

import dev.fringe.domain.User;

@RemoteProxy(name = "UserService")
public class UserService {

	@RemoteMethod
	public String hello() {
		return "hello";
	}

	@RemoteMethod
	public User user() {
		User user = new User();
		user.setId(1);
		user.setName("aaa");
		user.setAge(11);
		user.setAddress("seoul");
		user.setCreateAt(new Date());
		return user;
	}

	@RemoteMethod
	public List<User> list() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("aaa");
		user.setAge(11);
		user.setAddress("shanghai");
		user.setCreateAt(new Date());
		list.add(user);

		user = new User();
		user.setId(2);
		user.setName("bbb");
		user.setAge(22);
		user.setAddress("tokyo");
		user.setCreateAt(new Date());
		list.add(user);
		return list;
	}
}
