package com.dubu.wordpress.domain;

import javax.persistence.*;

/**
 * User: kingkingdubu
 * Date: 2016-05-12
 * Time: 오전 2:58
 */
@Entity
@Table(name = "wp_termmeta", schema = "wp", catalog = "")
public class WpTermmetaEntity {
    private Long metaId;
    private String metaKey;
    private String metaValue;

    @Id
    @Column(name = "meta_id")
    public Long getMetaId() {
        return metaId;
    }

    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    @Basic
    @Column(name = "meta_key")
    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    @Basic
    @Column(name = "meta_value")
    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpTermmetaEntity that = (WpTermmetaEntity) o;

        if (metaId != null ? !metaId.equals(that.metaId) : that.metaId != null) return false;
        if (metaKey != null ? !metaKey.equals(that.metaKey) : that.metaKey != null) return false;
        if (metaValue != null ? !metaValue.equals(that.metaValue) : that.metaValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = metaId != null ? metaId.hashCode() : 0;
        result = 31 * result + (metaKey != null ? metaKey.hashCode() : 0);
        result = 31 * result + (metaValue != null ? metaValue.hashCode() : 0);
        return result;
    }
}
