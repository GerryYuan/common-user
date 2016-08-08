package link.gerry.common.user.service;

import link.gerry.common.user.model.User;

import com.gerry.common.framework.result.Result;
import com.gerry.common.framework.service.interfaces.IBaseService;

public interface UserService extends IBaseService<User> {

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 * @see
	 */
	Result<?> register(User user) throws Exception;

	/**
	 * 用户登陆
	 * 
	 * @param phone
	 * @param password
	 * @return
	 * @throws Exception
	 * @see
	 */
	Result<User> login(String phone, String password) throws Exception;

	/**
	 * 修改昵称
	 *  
	 * @param id
	 * @param nickName
	 * @return
	 * @throws Exception
	 * @see
	 */
	boolean modifyNickName(long id, String nickName) throws Exception;
}
