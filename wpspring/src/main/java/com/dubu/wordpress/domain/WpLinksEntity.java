package com.dubu.wordpress.domain;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 11:27
 */
@Entity
@Table(name = "wp_links", schema = "wp", catalog = "")
public class WpLinksEntity implements Serializable {
    private Long linkId;
    private String linkUrl;
    private String linkName;
    private String linkImage;
    private String linkTarget;
    private String linkDescription;
    private String linkVisible;
    private Long linkOwner;
    private Integer linkRating;
    private DateTime linkUpdated;
    private String linkRel;
    private String linkNotes;
    private String linkRss;

    @Id
    @Column(name = "link_id", nullable = false)
    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "link_url", nullable = false, length = 255)
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Basic
    @Column(name = "link_name", nullable = false, length = 255)
    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    @Basic
    @Column(name = "link_image", nullable = false, length = 255)
    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    @Basic
    @Column(name = "link_target", nullable = false, length = 25)
    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

    @Basic
    @Column(name = "link_description", nullable = false, length = 255)
    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    @Basic
    @Column(name = "link_visible", nullable = false, length = 20)
    public String getLinkVisible() {
        return linkVisible;
    }

    public void setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible;
    }

    @Basic
    @Column(name = "link_owner", nullable = false)
    public Long getLinkOwner() {
        return linkOwner;
    }

    public void setLinkOwner(Long linkOwner) {
        this.linkOwner = linkOwner;
    }

    @Basic
    @Column(name = "link_rating", nullable = false)
    public Integer getLinkRating() {
        return linkRating;
    }

    public void setLinkRating(Integer linkRating) {
        this.linkRating = linkRating;
    }

    @Basic
    @Column(name = "link_updated", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getLinkUpdated() {
        return linkUpdated;
    }

    public void setLinkUpdated(DateTime linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    @Basic
    @Column(name = "link_rel", nullable = false, length = 255)
    public String getLinkRel() {
        return linkRel;
    }

    public void setLinkRel(String linkRel) {
        this.linkRel = linkRel;
    }

    @Basic
    @Column(name = "link_notes", nullable = false, length = -1)
    public String getLinkNotes() {
        return linkNotes;
    }

    public void setLinkNotes(String linkNotes) {
        this.linkNotes = linkNotes;
    }

    @Basic
    @Column(name = "link_rss", nullable = false, length = 255)
    public String getLinkRss() {
        return linkRss;
    }

    public void setLinkRss(String linkRss) {
        this.linkRss = linkRss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpLinksEntity that = (WpLinksEntity) o;

        if (linkId != null ? !linkId.equals(that.linkId) : that.linkId != null) return false;
        if (linkUrl != null ? !linkUrl.equals(that.linkUrl) : that.linkUrl != null) return false;
        if (linkName != null ? !linkName.equals(that.linkName) : that.linkName != null) return false;
        if (linkImage != null ? !linkImage.equals(that.linkImage) : that.linkImage != null) return false;
        if (linkTarget != null ? !linkTarget.equals(that.linkTarget) : that.linkTarget != null) return false;
        if (linkDescription != null ? !linkDescription.equals(that.linkDescription) : that.linkDescription != null)
            return false;
        if (linkVisible != null ? !linkVisible.equals(that.linkVisible) : that.linkVisible != null) return false;
        if (linkOwner != null ? !linkOwner.equals(that.linkOwner) : that.linkOwner != null) return false;
        if (linkRating != null ? !linkRating.equals(that.linkRating) : that.linkRating != null) return false;
        if (linkUpdated != null ? !linkUpdated.equals(that.linkUpdated) : that.linkUpdated != null) return false;
        if (linkRel != null ? !linkRel.equals(that.linkRel) : that.linkRel != null) return false;
        if (linkNotes != null ? !linkNotes.equals(that.linkNotes) : that.linkNotes != null) return false;
        if (linkRss != null ? !linkRss.equals(that.linkRss) : that.linkRss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = linkId != null ? linkId.hashCode() : 0;
        result = 31 * result + (linkUrl != null ? linkUrl.hashCode() : 0);
        result = 31 * result + (linkName != null ? linkName.hashCode() : 0);
        result = 31 * result + (linkImage != null ? linkImage.hashCode() : 0);
        result = 31 * result + (linkTarget != null ? linkTarget.hashCode() : 0);
        result = 31 * result + (linkDescription != null ? linkDescription.hashCode() : 0);
        result = 31 * result + (linkVisible != null ? linkVisible.hashCode() : 0);
        result = 31 * result + (linkOwner != null ? linkOwner.hashCode() : 0);
        result = 31 * result + (linkRating != null ? linkRating.hashCode() : 0);
        result = 31 * result + (linkUpdated != null ? linkUpdated.hashCode() : 0);
        result = 31 * result + (linkRel != null ? linkRel.hashCode() : 0);
        result = 31 * result + (linkNotes != null ? linkNotes.hashCode() : 0);
        result = 31 * result + (linkRss != null ? linkRss.hashCode() : 0);
        return result;
    }
}
