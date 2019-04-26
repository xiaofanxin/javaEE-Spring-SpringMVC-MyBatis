package chapter_02;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	
	public void save() {
		// TODO Auto-generated method stub
		this.userDao.save();
		System.out.println("userservice...save..");
		
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
