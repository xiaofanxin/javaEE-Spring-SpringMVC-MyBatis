package chapter_05;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AccountDaoImpl implements AccountDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		String sql = "delete from account where id=  ?";
		int num = this.jdbcTemplate.update(sql, id);
		return num;
	}

	// 通过id查询账户数据信息
	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from account where id = ?";
		// 创建一个新的BeanPropertyRowMapper对象
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

	// 查询所有账户信息
	@Override
	public List<Account> findAllAccount() {
		// TODO Auto-generated method stub
		String sql = "select * from account";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}
