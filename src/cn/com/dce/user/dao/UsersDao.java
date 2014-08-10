package cn.com.dce.user.dao;

import cn.com.dce.mybatis.annotation.DaoMapper;
import cn.com.dce.user.model.Users;
import cn.com.dce.user.model.UsersBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@DaoMapper// 扫描被该注解标注的接口
public interface UsersDao {
    /**
     * 根据Criteria所携带条件进行count计数。
     * @param example 查询条件
     *
     * @date 2014-07-31 13:48:29
     */
    int countByExample(UsersBean example);

    /**
     * 根据Criteria所携带条件删除记录。
     * @param example 查询条件
     *
     * @date 2014-07-31 13:48:29
     */
    int deleteByExample(UsersBean example);

    /**
     * 根据主键删除记录。
     * @param id 主键id
     *
     * @date 2014-07-31 13:48:29
     */
    int deleteByPrimaryKey(Long userIds);

    /**
     * 插入记录，所有字段都不能为空。
     * @param record 要被保存的数据
     *
     * @date 2014-07-31 13:48:29
     */
    int insert(Users record);

    /**
     * 插入记录，只有非空字段才会插入到数据库。
     * @param record 要被保存的数据
     *
     * @date 2014-07-31 13:48:29
     */
    int insertSelective(Users record);

    /**
     * 根据Criteria所携带条件查询数据，不含BLOB字段。
     * @param example 查询条件
     *
     * @date 2014-07-31 13:48:29
     */
    List<Users> selectByExample(UsersBean example);

    /**
     * 根据主键查询数据。
     * @param id 主键
     *
     * @date 2014-07-31 13:48:29
     */
    Users selectByPrimaryKey(Long userIds);

    /**
     * 根据Criteria所携带条件更新指定字段。
     * @param record 要更新的数据
     * @param example update的where条件
     *
     * @date 2014-07-31 13:48:29
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersBean example);

    /**
     * 根据Criteria所携带条件更新所有字段，不含BLOB字段。
     * @param record 要更新的数据
     * @param example update的where条件
     *
     * @date 2014-07-31 13:48:29
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersBean example);

    /**
     * 根据主键更新指定字段的数据。
     * @param record 要更新的数据，含有Id
     *
     * @date 2014-07-31 13:48:29
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * 根据主键更新所有字段的数据，不含BLOB字段。
     * @param record 要更新的数据，含有Id
     *
     * @date 2014-07-31 13:48:29
     */
    int updateByPrimaryKey(Users record);
}