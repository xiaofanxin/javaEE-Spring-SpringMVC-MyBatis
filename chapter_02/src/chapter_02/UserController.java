package chapter_02;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	@Resource(name="userService")
	private UserService userService;

	public void save() {
		this.userService.save();
		System.out.println("userController...save...");
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
