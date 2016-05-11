package com.dubu.wordpress.domain;

import javax.persistence.*;

/**
 * User: kingkingdubu
 * Date: 2016-05-12
 * Time: 오전 2:58
 */
@Entity
@Table(name = "wp_term_taxonomy", schema = "wp", catalog = "")
public class WpTermTaxonomyEntity {
    private Long termTaxonomyId;
    private String taxonomy;
    private String description;
    private Long parent;
    private Long count;

    @Id
    @Column(name = "term_taxonomy_id")
    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    @Basic
    @Column(name = "taxonomy")
    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "parent")
    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Basic
    @Column(name = "count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpTermTaxonomyEntity that = (WpTermTaxonomyEntity) o;

        if (termTaxonomyId != null ? !termTaxonomyId.equals(that.termTaxonomyId) : that.termTaxonomyId != null)
            return false;
        if (taxonomy != null ? !taxonomy.equals(that.taxonomy) : that.taxonomy != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (parent != null ? !parent.equals(that.parent) : that.parent != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = termTaxonomyId != null ? termTaxonomyId.hashCode() : 0;
        result = 31 * result + (taxonomy != null ? taxonomy.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}
