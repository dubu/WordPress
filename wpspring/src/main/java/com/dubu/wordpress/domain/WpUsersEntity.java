package com.dubu.wordpress.domain;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 11:27
 */
@Entity
@Table(name = "wp_users", schema = "wp", catalog = "")
public class WpUsersEntity {
    private Long id;
    private String userLogin;
    private String userPass;
    private String userNicename;
    private String userEmail;
    private String userUrl;
    private DateTime userRegistered;
    private String userActivationKey;
    private Integer userStatus;
    private String displayName;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_login", nullable = false, length = 60)
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @Basic
    @Column(name = "user_pass", nullable = false, length = 255)
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "user_nicename", nullable = false, length = 50)
    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    @Basic
    @Column(name = "user_email", nullable = false, length = 100)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_url", nullable = false, length = 100)
    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    @Basic
    @Column(name = "user_registered", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(DateTime userRegistered) {
        this.userRegistered = userRegistered;
    }

    @Basic
    @Column(name = "user_activation_key", nullable = false, length = 255)
    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    @Basic
    @Column(name = "user_status", nullable = false)
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "display_name", nullable = false, length = 250)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpUsersEntity that = (WpUsersEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;
        if (userPass != null ? !userPass.equals(that.userPass) : that.userPass != null) return false;
        if (userNicename != null ? !userNicename.equals(that.userNicename) : that.userNicename != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userUrl != null ? !userUrl.equals(that.userUrl) : that.userUrl != null) return false;
        if (userRegistered != null ? !userRegistered.equals(that.userRegistered) : that.userRegistered != null)
            return false;
        if (userActivationKey != null ? !userActivationKey.equals(that.userActivationKey) : that.userActivationKey != null)
            return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (userNicename != null ? userNicename.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userUrl != null ? userUrl.hashCode() : 0);
        result = 31 * result + (userRegistered != null ? userRegistered.hashCode() : 0);
        result = 31 * result + (userActivationKey != null ? userActivationKey.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
