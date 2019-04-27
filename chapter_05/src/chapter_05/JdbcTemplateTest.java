package chapter_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import org.junit.Test;


public class JdbcTemplateTest {

//	public static void main(String[] args) {
//		// 加载配置文件
//		ApplicationContext applicationContext = 
//		   new ClassPathXmlApplicationContext("applicationContext.xml");
//		// 获取JdbcTemplate实例
//		JdbcTemplate jdTemplate = 
//			   (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
//		// 使用execute()方法执行SQL语句，创建用户账户管理表account
//		jdTemplate.execute("create table account(" + 
//					         "id int primary key auto_increment," +
//					         "username varchar(50)," + 
//					         "balance double)");
//		System.out.println("账户表account创建成功！");
//	}
	
	// 测试添加用户信息
//	@Test
//	public void addAccountTest() {
//		// 加载配置文件
//		ApplicationContext applicationContext = 
//		   new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
//		Account account = new Account();
//		account.setUsername("tom");
//		account.setBalance(5000.00);
//		
//		int num = accountDao.addAccount(account);
//		if(num > 0) {
//			System.out.println("成功插入了"+ num +"条数据！");
//		}else {
//			System.out.println("插入操作执行失败！");
//		}
//	}
	
	// 更新用户信息
//	@Test
//	public void updateAccountTest() {
//		// 加载配置文件
//		ApplicationContext applicationContext = 
//		   new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
//		Account account = new Account();
//		account.setId(3);
//		account.setUsername("tom");
//		account.setBalance(2500.00);
//		
//		int num = accountDao.updateAccount(account);
//		if(num > 0) {
//			System.out.println("成功修改了"+ num +"条数据！");
//		}else {
//			System.out.println("修改操作执行失败！");
//		}
//	}
	
//	// 删除用户
//	@Test
//	public void deleteAccountTest() {
//		ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
//		int num = accountDao.deleteAccount(5);
//		if(num > 0) {
//			System.out.println("成功删除了"+ num +"条数据！");
//		}else {
//			System.out.println("删除操作执行失败！");
//		}
//	}
	
	// 函数功能测试
//	@Test
//	public void findAccountByIdTest() {
//		ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
//		Account account = accountDao.findAccountById(6);
//		System.out.println(account);		
//	}
//	
	@Test
	public void findAllAccountTest() {
		ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		List<Account> accounts = accountDao.findAllAccount();
		for (Account account : accounts) {
			System.out.println(account);
		}
	}
	
	
}
