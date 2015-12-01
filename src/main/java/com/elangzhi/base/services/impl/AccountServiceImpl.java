package com.elangzhi.base.services.impl;

import com.elangzhi.base.dao.AccountMapper;
import com.elangzhi.base.model.Account;
import com.elangzhi.base.services.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountMapper accountMapper;


	@Override
	public Integer save(Account account) {
		return accountMapper.insertSelective(account);
	}

	@Override
	public Integer deleteById(Long id) {
		return accountMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Account findById(Long id) {
		return accountMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateById(Account account) {
		return accountMapper.updateByPrimaryKeySelective(account);
	}
}
