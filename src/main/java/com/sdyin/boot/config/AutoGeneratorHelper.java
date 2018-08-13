package com.sdyin.boot.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ResourceBundle;

/**
 * @author liuye
 */
public class AutoGeneratorHelper {

    /**
     * <p>
     * 测试 run 执行
     * </p>
     * <p>
     * 更多使用查看 http://mp.baomidou.com
     * </p>
     */
    public static void main(String[] args) {

//用来获取Mybatis-Plus.properties文件的配置信息
        ResourceBundle rb =  ResourceBundle.getBundle("Mybatis-Plus");
        AutoGenerator mpg = new AutoGenerator();


// 全局配置
        GlobalConfig gc = new GlobalConfig();


        gc.setOutputDir(rb.getString("OutputDir"));


        gc.setFileOverride(true);
        // 开启 activeRecord 模式
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(false);
        gc.setAuthor(rb.getString("author"));
        mpg.setGlobalConfig(gc);


// 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert());
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(rb.getString("userName"));
        dsc.setPassword(rb.getString("passWord"));
        dsc.setUrl(rb.getString("url"));
        mpg.setDataSource(dsc);


// 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
        strategy.setTablePrefix(new String[] { "tbl_", "" });
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
// 字段名生成策略

        mpg.setStrategy(strategy);


// 包配置
        PackageConfig pc = new PackageConfig();
        // 自定义包路径
        pc.setParent(rb.getString("parent"));
        // 这里是控制器包名，默认 web
        pc.setController("controller");
        pc.setEntity("model");
        pc.setMapper("dao");
        pc.setXml("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);
// 执行生成
        mpg.execute();
    }

}
