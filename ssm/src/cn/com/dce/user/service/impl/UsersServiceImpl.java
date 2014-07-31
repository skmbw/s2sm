package cn.com.dce.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.dce.sequence.SequenceGenerator;
import cn.com.dce.user.dao.UsersDao;
import cn.com.dce.user.model.Users;
import cn.com.dce.user.model.UsersBean;
import cn.com.dce.user.service.UsersService;

/**
 * 用户service业务实现。
 * @author yinlei
 * 2014-2-25 上午11:26:29
 */
@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired//将UsersDao的实现注入进来，也可以使用setter方法注入
	private UsersDao usersDao;
	
	@Autowired
	private SequenceGenerator sequenceGenerator;

	@Override
	public int countByExample(UsersBean example) {
		return usersDao.countByExample(example);
	}

	@Override
	public int deleteByExample(UsersBean example) {
		return usersDao.deleteByExample(example);
	}

	@Override
	public int deleteById(Long id) {
		return usersDao.deleteByPrimaryKey(id);
	}

	@Override
	public int saveAll(Users record) {
	    record.setUserIds(sequenceGenerator.nextLong(SequenceGenerator.SEQ_JR197));
		return usersDao.insert(record);
	}

	@Override
	public int save(Users record) {
	    // 如果没有sequence，使用 sequenceGenerator.nextSeqLong();
	    // 这里要设置成 你自己的sequence名字
	    record.setUserIds(sequenceGenerator.nextLong(SequenceGenerator.SEQ_JR197));
		return usersDao.insertSelective(record);
	}

	@Override
	public List<Users> queryUsersList(UsersBean example) {
		return usersDao.selectByExample(example);
	}

	@Override
	public Users queryById(Long id) {
		return usersDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExample(Users record, UsersBean example) {
		return usersDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateAllByExample(Users record, UsersBean example) {
		return usersDao.updateByExample(record, example);
	}

	@Override
	public int updateById(Users record) {
		return usersDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateAllById(Users record) {
		return usersDao.updateByPrimaryKey(record);
	}

}
