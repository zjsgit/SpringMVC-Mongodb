package cn.csu.disnet.service;

import cn.csu.disnet.dao.UserDao;
import cn.csu.disnet.entity.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.MongoTemplate;

@Repository
public class UserServide implements UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	@SuppressWarnings("unchecked")
	public String findAllUsers() {
		// TODO Auto-generated method stub
		
		System.out.println("查找所有的用户——UserService");
		List<User> users = mongoTemplate.findAll(User.class);
		for(int i=0;i<users.size();i++) {
			User user = users.get(i);
			System.out.println(user.toString());
		}
		
		return null;
	}

}
