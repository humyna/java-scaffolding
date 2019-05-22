package info.zoio.scaffloding.java.mappers.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info_demo")
public class UserInfoDemo {
    @Id
    @Column(name = "demo_id")
    @GeneratedValue(generator = "JDBC")
    private Integer demoId;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别 0 女 1 男 2 保密 
     */
    private String gender;

    /**
     * 出生日期
     */
    @Column(name = "birth_day")
    private Date birthDay;

    /**
     * 备注
     */
    private String commets;

    /**
     * @return demo_id
     */
    public Integer getDemoId() {
        return demoId;
    }

    /**
     * @param demoId
     */
    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别 0 女 1 男 2 保密 
     *
     * @return gender - 性别 0 女 1 男 2 保密 
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别 0 女 1 男 2 保密 
     *
     * @param gender 性别 0 女 1 男 2 保密 
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取出生日期
     *
     * @return birth_day - 出生日期
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * 设置出生日期
     *
     * @param birthDay 出生日期
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 获取备注
     *
     * @return commets - 备注
     */
    public String getCommets() {
        return commets;
    }

    /**
     * 设置备注
     *
     * @param commets 备注
     */
    public void setCommets(String commets) {
        this.commets = commets == null ? null : commets.trim();
    }
}