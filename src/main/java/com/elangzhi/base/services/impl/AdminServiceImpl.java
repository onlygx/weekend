package com.elangzhi.base.services.impl;

import com.elangzhi.base.dao.AdminMapper;
import com.elangzhi.base.model.Admin;
import com.elangzhi.base.services.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminMapper adminMapper;


	@Override
	public Integer save(Admin admin) {
		return adminMapper.insertSelective(admin);
	}

	@Override
	public Integer deleteById(Long id) {
		return adminMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Admin findById(Long id) {
		return adminMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateById(Admin admin) {
		return adminMapper.updateByPrimaryKeySelective(admin);
	}
}
