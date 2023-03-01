package org.atguigu.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*数据库的增删改操作*/
    @Test
    public void testUpdate(){
        /*1.添加操作*/
        /*第一步编写sql语句*/
        /*第二步调用jdbcTemplate的方法，传入相关参数*/
        /*添加功能*/
        /*String sql = "insert into user(name,password,address,phone) values(?,?,?,?)";
        int rows = jdbcTemplate.update(sql, "蔡徐坤", "123456987", "jiangsu", "17870075610");//返回值表示影响的行数，即表示添加了几条记录
        System.out.println(rows);*/

        /*修改功能*/
        /*String sql = "update user set name = ? where id = ?";
        int rows = jdbcTemplate.update(sql, "小鸡巴", 6);
        System.out.println(rows);*/

        /*删除功能*/
        /*String sql = "delete from user where id = ?";
        int delete = jdbcTemplate.update(sql, 6);
        System.out.println(delete);*/
    }


    /*对数据库的查询操作
     * 1.返回对象
     * 2.返回list集合
     * 3.返回单个值
     * */

    @Test
    public void testQuery(){
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }
}
