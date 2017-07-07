package com.giit.www.mapper;

import com.giit.www.entity.Dealinfo;
import com.giit.www.entity.DealinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int countByExample(DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int deleteByExample(DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int deleteByPrimaryKey(String handleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int insert(Dealinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int insertSelective(Dealinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    List<Dealinfo> selectByExample(DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    Dealinfo selectByPrimaryKey(String handleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByExampleSelective(@Param("record") Dealinfo record, @Param("example") DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByExample(@Param("record") Dealinfo record, @Param("example") DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByPrimaryKeySelective(Dealinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    int updateByPrimaryKey(Dealinfo record);
}