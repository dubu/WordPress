package com.dubu.wordpress.domain;

import javax.persistence.*;

/**
 * User: kingkingdubu
 * Date: 2016-05-12
 * Time: 오전 2:58
 */
@Entity
@Table(name = "wp_terms", schema = "wp", catalog = "")
public class WpTermsEntity {
    private Long termId;
    private String name;
    private String slug;
    private Long termGroup;

    @Id
    @Column(name = "term_id")
    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Basic
    @Column(name = "term_group")
    public Long getTermGroup() {
        return termGroup;
    }

    public void setTermGroup(Long termGroup) {
        this.termGroup = termGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpTermsEntity that = (WpTermsEntity) o;

        if (termId != null ? !termId.equals(that.termId) : that.termId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (slug != null ? !slug.equals(that.slug) : that.slug != null) return false;
        if (termGroup != null ? !termGroup.equals(that.termGroup) : that.termGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = termId != null ? termId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (termGroup != null ? termGroup.hashCode() : 0);
        return result;
    }
}
