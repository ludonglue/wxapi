package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = "com.example.demo.api.**.dao", sqlSessionTemplateRef  = "mybatisSqlSessionTemplate")
public class MybatisConf {

    @Bean(name = "mybatisDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource mybatisSlaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mybatisSqlSessionFactory")
    @Primary
    public SqlSessionFactory mybatisSlaveSqlSessionFactory(@Qualifier("mybatisDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mybatis/mapper/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "mybatisTransactionManager")
    @Primary
    public DataSourceTransactionManager mybatisSlaveTransactionManager(@Qualifier("mybatisDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "mybatisSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate mybatisSlaveSqlSessionTemplate(@Qualifier("mybatisSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
