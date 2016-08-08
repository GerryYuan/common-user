package link.gerry.common.user.service.impl;

import java.util.Date;

import link.gerry.common.user.dao.UserDAO;
import link.gerry.common.user.model.User;
import link.gerry.common.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import com.gerry.common.framework.helper.ViewModelHelper;
import com.gerry.common.framework.result.Result;
import com.gerry.common.framework.utils.EmptyUtils;
import com.gerry.common.framework.utils.IdWorker;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public User getById(Integer id) {
		return userDAO.getUser(id);
	}

	@Override
	public int save(User t) {
		long time = new Date().getTime();
		t.setCreateTime(time);
		t.setUpdateTime(time);
		t.setId(IdWorker.getFlowIdWorkerInstance().nextId());
		userDAO.addUser(t);
		return (int) t.getId();
	}

	@Override
	public int delete(Integer id) {
		return userDAO.deleteUser(id) ? 1 : 0;
	}

	@Override
	public int update(User t) {
		return 0;
	}

	@Override
	public Result<?> register(User user) throws Exception {
		User _user = userDAO.getUserByPhone(user.getPhone());
		if (EmptyUtils.isNotEmpty(_user)) {
			return ViewModelHelper.NOViewModelResult("手机号已存在");
		}
		return save(user) > 0 ? ViewModelHelper.OKViewModelResult() : ViewModelHelper.NOViewModelResult("注册用户失败");
	}

}