package wiser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.sunshine.wiser.model.User;
import com.sunshine.wiser.service.UserService;

import junit.framework.Assert;

public class UserServiceTest {

	private final UserService userService;

	public UserServiceTest() {
		this.userService = new UserService();
	}

	@Before
	public void init() {
		// 初始化数据库
	}

	@Test
	public void getUserListTest() {
	 List<User> userList = userService.getUserlist("");
	 Assert.assertEquals(2, userList.size());
    }
	
	@Test
	public void getUserTest(){
		int id = 1;
		User user = userService.getUser(id);
		Assert.assertNotNull(user);
	}
	
	@Test
	public void createUserTest(){
		Map<String,Object> field = new HashMap<String, Object>();
	    field.put("loginName", "pangqiao");
	    field.put("password", "123456");
	    field.put("no", "123456");
	    boolean result = userService.createUser(field);
	    Assert.assertTrue(result);
	}
	
	@Test
	public void updateUserTest(){
		int id = 1;
		Map<String,Object> field = new HashMap<String, Object>();
	    field.put("userName", "dty");
	    boolean result = userService.updateUser(id,field);
	    Assert.assertTrue(result);
	}
	
	@Test
	public void deleteUserTest(){
		int id = 1;
	    boolean result = userService.deleteUser(id);
	    Assert.assertTrue(result);
	}
		
	

}
