package link.gerry.common.user.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.gerry.common.framework.common.BaseUser;

@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseUser {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3342383581892963989L;

	private String phone;
	
	private String nickName;

	private Integer gender;

	private Integer status;

	private Long createTime;

	private Long updateTime;

}
