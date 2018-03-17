package com.spawpaw.ssm.dao;

import com.spawpaw.ssm.entity.SubscriptionDtl;
import com.spawpaw.ssm.entity.SubscriptionDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscriptionDtlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int countByExample(SubscriptionDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int deleteByExample(SubscriptionDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int insert(SubscriptionDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int insertSelective(SubscriptionDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    List<SubscriptionDtl> selectByExample(SubscriptionDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    SubscriptionDtl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") SubscriptionDtl record, @Param("example") SubscriptionDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int updateByExample(@Param("record") SubscriptionDtl record, @Param("example") SubscriptionDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int updateByPrimaryKeySelective(SubscriptionDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscription_dtl
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    int updateByPrimaryKey(SubscriptionDtl record);
}