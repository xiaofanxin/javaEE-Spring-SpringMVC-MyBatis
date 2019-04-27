package chapter_05;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImpl implements AccountDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addAccount(Account account) {
		String sql = "insert into account(username, balance) value(?, ?)";
		Object[] obj = new Object[] {
				account.getUsername(),
				account.getBalance()
		};
		int num = this.jdbcTemplate.update(sql, obj);
		return num;
	}

	@Override
	public int updateAccount(Account account) {
		String sql = "update account set username=?,balance=? where id=?";
		Object[] obj = new Object[] {
				account.getUsername(),
				account.getBalance(),
				account.getId()
		};
		int num = this.jdbcTemplate.update(sql, obj);
		return num;
	}

	@Override
	public int deleteAccount(int id) {
		String sql = "delete from account where id=  ?";
		int num = this.jdbcTemplate.update(sql, id);
		return num;
	}

	// 通过id查询账户数据信息
	@Override
	public Account findAccountById(int id) {
		String sql = "select * from account where id = ?";
		// 创建一个新的BeanPropertyRowMapper对象
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

	// 查询所有账户信息
	@Override
	public List<Account> findAllAccount() {
		String sql = "select * from account";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	/**
	 * 转账操作
	 * outUser:汇款人
	 * inUser:收款人
	 * money:收款金额
	 * */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
	public void transfer(String outUser, String inUser, Double money) {
		this.jdbcTemplate.update("update account set balance = balance + ?" + "where username = ?", money, inUser);
		// 用于模拟系统运行时的突发性问题
		int i=1/0;
		this.jdbcTemplate.update("update account set balance = balance - ?" + "where username = ?", money, outUser);
	}
	
	/**
	 * 转账操作
	 * outUser:汇款人
	 * inUser:收款人
	 * money:收款金额
	 * */
//	@Override
//	public void transfer(String outUser, String inUser, Double money) {
//		this.jdbcTemplate.update("update account set balance = balance + ?" + "where username = ?", money, inUser);
//		// 用于模拟系统运行时的突发性问题
//		int i=1/0;
//		this.jdbcTemplate.update("update account set balance = balance - ?" + "where username = ?", money, outUser);
//	}


}
