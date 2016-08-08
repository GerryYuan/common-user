package link.gerry.common.user.dao;

import link.gerry.common.user.model.User;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;

@DB(
        table = "common_user"
)
public interface UserDAO {
    String COLUMNS = "id, name, nick_name, password, gender, status, create_time, update_time, phone";

    @SQL("insert into #table(" + COLUMNS + ") values(:id, :name, :nickName, :password, :gender, :status, :createTime, :updateTime, :phone)")
    void addUser(User user);

    @SQL("select " + COLUMNS + " from #table where id = :1")
    User getUser(long id);

    @SQL("select " + COLUMNS + " from #table where phone = :1 and status = 0")
    User getUserByPhone(String phone);
    
    @SQL("update #table set name=:name, nick_name=:nickName, password=:password, gender=:gender, status=:status, create_time=:createTime, update_time=:updateTime, phone=:phone where id = :id")
    boolean updateUser(User user);

    @SQL("delete from #table where id = :1")
    boolean deleteUser(long id);
}


