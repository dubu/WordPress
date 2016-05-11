package com.dubu.wordpress.domain;

import javax.persistence.*;

/**
 * User: kingkingdubu
 * Date: 2016-05-12
 * Time: 오전 2:58
 */
@Entity
@Table(name = "wp_options", schema = "wp", catalog = "")
public class WpOptionsEntity {
    private Long optionId;
    private String optionName;
    private String optionValue;
    private String autoload;

    @Id
    @Column(name = "option_id")
    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    @Basic
    @Column(name = "option_name")
    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    @Basic
    @Column(name = "option_value")
    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    @Basic
    @Column(name = "autoload")
    public String getAutoload() {
        return autoload;
    }

    public void setAutoload(String autoload) {
        this.autoload = autoload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpOptionsEntity that = (WpOptionsEntity) o;

        if (optionId != null ? !optionId.equals(that.optionId) : that.optionId != null) return false;
        if (optionName != null ? !optionName.equals(that.optionName) : that.optionName != null) return false;
        if (optionValue != null ? !optionValue.equals(that.optionValue) : that.optionValue != null) return false;
        if (autoload != null ? !autoload.equals(that.autoload) : that.autoload != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = optionId != null ? optionId.hashCode() : 0;
        result = 31 * result + (optionName != null ? optionName.hashCode() : 0);
        result = 31 * result + (optionValue != null ? optionValue.hashCode() : 0);
        result = 31 * result + (autoload != null ? autoload.hashCode() : 0);
        return result;
    }
}
