package chapter_04;

import java.util.List;

public interface AccountDao {
	// 添加帐户
	public int addAccount(Account account);
	// 更新账户
	public int updateAccount(Account account);
	// 删除账户
	public int deleteAccount(int id);
	// 通过账户id查询账户信息
	public Account findAccountById(int id);
	// 查询所有的账户信息
	public List<Account> findAllAccount();


}

