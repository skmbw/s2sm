package cn.com.dce.user.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.dce.user.model.Users;
import cn.com.dce.user.service.UsersService;
import cn.com.dce.web.action.BaseAction;

/**
 * 用户Action.
 * @author yinlei
 * 2014-7-31 10:28:25
 */
public class UserAction extends BaseAction<Users> {

	private static final long serialVersionUID = -711566328469110412L;
	private Users model = new Users();

	@Autowired
	private UsersService usersServiceImpl;
	
	@Override
	public Users getModel() {
		return model;
	}

    public void setModel(Users model) {
        this.model = model;
    }

    /**
	 * 初始化页面
	 */
	@Override
	public String initial() throws Exception {
		listResult = usersServiceImpl.queryUsersList(null);// 传null，查询所有
		return SUCCESS;
	}
	
	/**
	 * 跳转到新增页面
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		
		return SUCCESS;
	}
	
	/**
	 * 执行新增操作
	 * @return
	 * @throws Exception
	 */
	public String doAdd() throws Exception {
		model.setCreateTimes(new Date());
		usersServiceImpl.save(model);
		return SUCCESS;
	}
	
	/**
	 * 查看明细
	 * @return
	 * @throws Exception
	 */
	public String detail() throws Exception {
		model = usersServiceImpl.queryById(model.getUserIds());
		return SUCCESS;
	}
	
	/**
	 * 跳到编辑页面
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		model = usersServiceImpl.queryById(model.getUserIds());
		return SUCCESS;
	}
	
	/**
	 * 更新用户
	 * @return
	 * @throws Exception
	 */
	public String update() throws Exception {
		usersServiceImpl.updateById(model);
		return SUCCESS;
	}
	
	/**
	 * 删除用户
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception {
		usersServiceImpl.deleteById(model.getUserIds());
		return SUCCESS;
	}
}
