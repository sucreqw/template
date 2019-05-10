package com.easymiracle.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

public class MybatisPlusGenerator {

    private final static String outputDir = "/home/scala/code/template";
    private final static String entityName = "%sDO";

    private final static String dbDriverName = "com.mysql.jdbc.Driver";
    private final static String dbUserName = "root";
    private final static String dbPassword = "root";
    private final static String dbUrl = "jdbc:mysql://localhost:3310/template";

    private final static String parentPackage = "com.easymiracle";
    private final static String entityPackage = "repository.entity";
    private final static String mapperPackage = "repository.dao";
    private final static String xmlPackage = "repository.mappers";
    private final static String servicePackage = "service";
    private final static String serviceImplPackage = "service.impl";
    private final static String controllerPackage = "controller";

    public static void main(final String[] args) {

        // generator global config
        final GlobalConfig config = new GlobalConfig();
        config.setOutputDir(outputDir);
        config.setFileOverride(true);
        config.setBaseResultMap(true); // XML resultMap
        config.setBaseColumnList(false); // XML
        config.setEntityName(entityName);

        // database config
        final DataSourceConfig dataConfig = new DataSourceConfig();
        dataConfig.setDriverName(dbDriverName);
        dataConfig.setUsername(dbUserName);
        dataConfig.setPassword(dbPassword);
        dataConfig.setUrl(dbUrl);

        // strategy config
        final StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude(

                "sys_advert" ,
                "sys_setting" ,
                "sys_dict_item" ,
                "sys_user",
                "experience_hall",
                "areas",
                "cities",
                "provinces"
        );
        //strategy.setExclude("alembic_version");
        strategy.setRestControllerStyle(true);
        strategy.entityTableFieldAnnotationEnable(true);
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        // auto fill
        final List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("update_date", FieldFill.INSERT_UPDATE));
        tableFillList.add(new TableFill("update_user", FieldFill.INSERT_UPDATE));
        tableFillList.add(new TableFill("create_date", FieldFill.INSERT));
        tableFillList.add(new TableFill("create_user", FieldFill.INSERT));
        strategy.setTableFillList(tableFillList);

        // package config
        final PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(parentPackage);
        packageConfig.setEntity(entityPackage);
        packageConfig.setMapper(mapperPackage);
        packageConfig.setXml(xmlPackage);
        packageConfig.setService(servicePackage);
        packageConfig.setServiceImpl(serviceImplPackage);
        packageConfig.setController(controllerPackage);

        final AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config);
        autoGenerator.setDataSource(dataConfig);
        autoGenerator.setStrategy(strategy);
        autoGenerator.setPackageInfo(packageConfig);

        autoGenerator.execute();
    }
}
