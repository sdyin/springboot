package com.sdyin.boot.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

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

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:/order")
                .setAuthor("liuye")
                //是否打开输出目录
                .setOpen(false)
                //是否文件覆盖
                .setFileOverride(true)
                //开启AR
                .setActiveRecord(true);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/springboot?useUnicode=true&useSSL=false&characterEncoding=utf8")
                .setDriverName("com.mysql.jdbc.Driver")
                .setUsername("root")
                .setPassword("root");

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                //全局大写命名
                .setCapitalMode(true)
                //实体是否为lombok模型
                .setEntityLombokModel(true)
                // 此处可以修改为您的表前缀
                .setTablePrefix(new String[]{"tbl_", ""})
                //表名生成策略 下划线转驼峰
                .setNaming(NamingStrategy.underline_to_camel);
        //.setInclude()

        // 注入配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        //集成
        mpg.setGlobalConfig(gc)
                .setDataSource(dsc)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent("com.sdyin.boot")
                                .setEntity("model")
                                .setController("controller")
                                .setMapper("mapper")
                                .setXml("xml")
                                .setService("service")
                                .setServiceImpl("service.impl")
                )
                .setCfg(cfg)
                //设置自定义模板
                //开始执行代码
                .execute();





    }


}
