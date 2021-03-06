package com.spawpaw.ssm.dao;

import com.spawpaw.ssm.entity.History;
import com.spawpaw.ssm.entity.HistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int countByExample(HistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int deleteByExample(HistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int insert(History record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int insertSelective(History record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    List<History> selectByExample(HistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    History selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") History record, @Param("example") HistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExample(@Param("record") History record, @Param("example") HistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKeySelective(History record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKey(History record);
}