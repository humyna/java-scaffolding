# Java-Scaffolding
Java's scaffolding capabilities let me bootstrap a new project in a fraction of the time it previously took.

## Mybatis Generator DEMO

```
1.bsed on Mybatis Generator plugin 
2.support Oracle and Mysql 
3.auto generate DAO configure and code just by one click
```

### mybatis-generator-mysql使用说明
1.替换generator.properties中的值，包括数据库配置、javamodel、mapper、xml生成路径
2.在generator-config.xml中添加你需要生成的表,参考<table>属性
> 示例为主键自增配置
3.执行
方法1：配置mybatis-generator-maven-plugin执行
方法2：IDE安装mybatis generator插件