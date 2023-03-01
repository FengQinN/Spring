package org.atguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration//配置类
@ComponentScan("org.atguigu")//开启组件扫描
@EnableTransactionManagement//开启事务
public class SpringConfig {
    @Bean(name = "dataSource")
    /*创建dataSource*/
    public DataSource getDataSource(){
        DruidDataSource druidDataSource = null;
        try {
            InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            druidDataSource = new DruidDataSource();
            druidDataSource.setUsername(properties.getProperty("jdbc.user"));
            druidDataSource.setPassword(properties.getProperty("jdbc.password"));
            druidDataSource.setUrl(properties.getProperty("jdbc.url"));
            druidDataSource.setDriverClassName(properties.getProperty("jdbc.driver"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            return druidDataSource;
        }
    }

    @Bean(name = "jdbcTemplate")
    /*创建jdbcTemplate数据源管理*/
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean(name = "dataSourceTransactionManager")
    /*创建事务管理*/
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}
