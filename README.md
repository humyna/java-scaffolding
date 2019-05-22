# Java-Scaffolding
Java's scaffolding capabilities let me bootstrap a new project in a fraction of the time it previously took.

##  Mybatis Generator DEMO

```
1.bsed on Mybatis Generator plugin 
2.support Oracle and Mysql 
3.auto generate DAO configure and code just by one click
```

#### mybatis-generator-mysql使用说明
1. 替换generator.properties中的值，包括数据库配置、javamodel、mapper、xml生成路径
2. 在generator-config.xml中添加你需要生成的表,参考table标签
> 示例为主键自增配置
3. 执行
    * 方法1：配置mybatis-generator-maven-plugin执行
    * 方法2：IDE安装mybatis generator插件

#### mybatis-generator-oracle使用说明
1. 替换generator.properties中的值，包括数据库配置、javamodel、mapper、xml生成路径
2. 在generator-config.xml中添加你需要生成的表,参考table标签
> 示例主键为基于序列自增
3. 执行
    * 方法1：配置mybatis-generator-maven-plugin执行
    * 方法2：IDE安装mybatis generator插件

4. 关于主键序列自增的配置说明
    增加：对于主键对应序列的配置修改：@KeySql(sql = "select seq_user_info_demo.nextval from dual", order = ORDER.BEFORE)
    
    @Id
	@Column(name = "ID")
    @KeySql(sql = "select seq_user_info_demo.nextval from dual", order = ORDER.BEFORE)
    private Long id;
    
5. 对于number类型的建议
    * 表设计时number建议不要设置长度
    * 修改生成java model
        number(精度大于18的)会映射成bigdecimal，需要手动修改一下java中改成Long
    * 修改xml
        配置xml中类型改成BIGINT