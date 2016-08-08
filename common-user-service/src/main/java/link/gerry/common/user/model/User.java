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

	private Long id;

	private String name;
	
	private String phone;
	
	private String nickName;

	private String password;

	private Integer gender;

	private Integer status;

	private Long createTime;

	private Long updateTime;

}
