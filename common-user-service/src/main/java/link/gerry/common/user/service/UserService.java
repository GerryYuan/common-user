package link.gerry.common.user.service;

import link.gerry.common.user.model.User;

import com.gerry.common.framework.result.Result;
import com.gerry.common.framework.service.interfaces.IBaseService;

public interface UserService extends IBaseService<User> {

	
	Result<?> register(User user) throws Exception;
	
}
