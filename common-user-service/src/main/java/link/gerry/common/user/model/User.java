package link.gerry.common.user.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.gerry.common.framework.model.BaseModel;

@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseModel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3342383581892963989L;

	private long id;

	private String name;
	
	private String phone;
	
	private String nickName;

	private String password;

	private int gender;

	private int status;

	private long createTime;

	private long updateTime;

}
