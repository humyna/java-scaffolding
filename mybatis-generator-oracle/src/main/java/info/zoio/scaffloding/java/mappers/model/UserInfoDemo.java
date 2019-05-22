package info.zoio.scaffloding.java.mappers.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

@Table(name = "USER_INFO_DEMO")
public class UserInfoDemo {

    @Id
	@Column(name = "ID")
    @KeySql(sql = "select seq_USER_INFO_DEMO.nextval from dual", order = ORDER.BEFORE)
    private Long id;
    
    
    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "AGE")
    private Long age;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "BIRTH_DAY")
    private Date birthDay;

    @Column(name = "COMMENTS")
    private String comments;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return AGE
     */
    public Long getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Long age) {
        this.age = age;
    }

    /**
     * @return GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return BIRTH_DAY
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return COMMENTS
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}