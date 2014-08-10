package cn.com.dce.user.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.dce.user.model.Users;
import cn.com.dce.user.model.UsersBean;

/**
 * 用户相关的业务service接口。
 * @author yinlei
 * 2014-2-25 上午11:24:51
 */
public interface UsersService {

	/**
     * 根据Criteria所携带条件进行count计数。
     * @param example 查询条件
     * @date 2014-02-27 17:59:34
     */
    int countByExample(UsersBean example);

    /**
     * 根据Criteria所携带条件删除记录。
     * @param example 查询条件
     * @date 2014-02-27 17:59:34
     */
    int deleteByExample(UsersBean example);

    /**
	 * 根据主键删除记录。
	 * @param id 主键id
     * @date 2014-02-27 17:59:34
	 */
	public int deleteById(Long id);
    
    /**
     * 插入记录，所有字段都不能为空。
     * @param record 要被保存的数据
     * @date 2014-02-27 17:59:34
     */
    int saveAll(Users record);

    /**
     * 插入记录，只有非空字段才会插入到数据库。
     * @param record 要被保存的数据
     * @date 2014-02-27 17:59:34
     */
    int save(Users record);

    /**
     * 根据Criteria所携带条件查询数据，不含BLOB字段。
     * @param example 查询条件
     * @date 2014-02-27 17:59:34
     */
    List<Users> queryUsersList(UsersBean example);

    /**
     * 根据主键查询数据。
     * @param id 主键
     * @date 2014-02-27 17:59:34
     */
    Users queryById(Long id);

    /**
     * 根据Criteria所携带条件更新指定字段。
     * @param record 要更新的数据
     * @param example update的where条件
     * @date 2014-02-27 17:59:34
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersBean example);

    /**
     * 根据Criteria所携带条件更新所有字段，不含BLOB字段。
     * @param record 要更新的数据
     * @param example update的where条件
     * @date 2014-02-27 17:59:34
     */
    int updateAllByExample(@Param("record") Users record, @Param("example") UsersBean example);

    /**
     * 根据主键更新指定字段的数据。
     * @param record 要更新的数据，含有Id
     * @date 2014-02-27 17:59:34
     */
    int updateById(Users record);

    /**
     * 根据主键更新所有字段的数据，不含BLOB字段。
     * @param record 要更新的数据，含有Id
     * @date 2014-02-27 17:59:34
     */
    int updateAllById(Users record);
}
