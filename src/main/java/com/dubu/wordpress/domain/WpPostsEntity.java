package com.dubu.wordpress.domain;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:10
 */
@Entity
@Table(name = "wp_posts", schema = "wp", catalog = "")
public class WpPostsEntity implements Serializable {
    private Long id;
    private DateTime postDate;
    private DateTime postDateGmt;
    private String postContent;
    private String postTitle;
    private String postExcerpt;
    private String postStatus;
    private String commentStatus;
    private String pingStatus;
    private String postPassword;
    private String postName;
    private String toPing;
    private String pinged;
    private DateTime postModified;
    private DateTime postModifiedGmt;
    private String postContentFiltered;
    private Long postParent;
    private String guid;
    private Integer menuOrder;
    private String postType;
    private String postMimeType;
    private Long commentCount;
    private Long postAuthor;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "post_date", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(DateTime postDate) {
        this.postDate = postDate;
    }

    @Basic
    @Column(name = "post_date_gmt", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getPostDateGmt() {
        return postDateGmt;
    }

    public void setPostDateGmt(DateTime postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    @Basic
    @Column(name = "post_content", nullable = false, length = -1)
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Basic
    @Column(name = "post_title", nullable = false, length = -1)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Basic
    @Column(name = "post_excerpt", nullable = false, length = -1)
    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    @Basic
    @Column(name = "post_status", nullable = false, length = 20)
    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    @Basic
    @Column(name = "comment_status", nullable = false, length = 20)
    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    @Basic
    @Column(name = "ping_status", nullable = false, length = 20)
    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    @Basic
    @Column(name = "post_password", nullable = false, length = 20)
    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    @Basic
    @Column(name = "post_name", nullable = false, length = 200)
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Basic
    @Column(name = "to_ping", nullable = false, length = -1)
    public String getToPing() {
        return toPing;
    }

    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    @Basic
    @Column(name = "pinged", columnDefinition = "text", nullable = false, length = -1)
    public String getPinged() {
        return pinged;
    }

    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    @Basic
    @Column(name = "post_modified", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getPostModified() {
        return postModified;
    }

    public void setPostModified(DateTime postModified) {
        this.postModified = postModified;
    }

    @Basic
    @Column(name = "post_modified_gmt", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getPostModifiedGmt() {
        return postModifiedGmt;
    }

    public void setPostModifiedGmt(DateTime postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    @Basic
    @Column(name = "post_content_filtered", nullable = false, length = -1)
    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    @Basic
    @Column(name = "post_parent", nullable = false)
    public Long getPostParent() {
        return postParent;
    }

    public void setPostParent(Long postParent) {
        this.postParent = postParent;
    }

    @Basic
    @Column(name = "guid", nullable = false, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "menu_order", nullable = false)
    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    @Basic
    @Column(name = "post_type", nullable = false, length = 20)
    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    @Basic
    @Column(name = "post_mime_type", nullable = false, length = 100)
    public String getPostMimeType() {
        return postMimeType;
    }

    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    @Basic
    @Column(name = "comment_count", nullable = false)
    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpPostsEntity that = (WpPostsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (postDate != null ? !postDate.equals(that.postDate) : that.postDate != null) return false;
        if (postDateGmt != null ? !postDateGmt.equals(that.postDateGmt) : that.postDateGmt != null) return false;
        if (postContent != null ? !postContent.equals(that.postContent) : that.postContent != null) return false;
        if (postTitle != null ? !postTitle.equals(that.postTitle) : that.postTitle != null) return false;
        if (postExcerpt != null ? !postExcerpt.equals(that.postExcerpt) : that.postExcerpt != null) return false;
        if (postStatus != null ? !postStatus.equals(that.postStatus) : that.postStatus != null) return false;
        if (commentStatus != null ? !commentStatus.equals(that.commentStatus) : that.commentStatus != null)
            return false;
        if (pingStatus != null ? !pingStatus.equals(that.pingStatus) : that.pingStatus != null) return false;
        if (postPassword != null ? !postPassword.equals(that.postPassword) : that.postPassword != null) return false;
        if (postName != null ? !postName.equals(that.postName) : that.postName != null) return false;
        if (toPing != null ? !toPing.equals(that.toPing) : that.toPing != null) return false;
        if (pinged != null ? !pinged.equals(that.pinged) : that.pinged != null) return false;
        if (postModified != null ? !postModified.equals(that.postModified) : that.postModified != null) return false;
        if (postModifiedGmt != null ? !postModifiedGmt.equals(that.postModifiedGmt) : that.postModifiedGmt != null)
            return false;
        if (postContentFiltered != null ? !postContentFiltered.equals(that.postContentFiltered) : that.postContentFiltered != null)
            return false;
        if (postParent != null ? !postParent.equals(that.postParent) : that.postParent != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (menuOrder != null ? !menuOrder.equals(that.menuOrder) : that.menuOrder != null) return false;
        if (postType != null ? !postType.equals(that.postType) : that.postType != null) return false;
        if (postMimeType != null ? !postMimeType.equals(that.postMimeType) : that.postMimeType != null) return false;
        if (commentCount != null ? !commentCount.equals(that.commentCount) : that.commentCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (postDate != null ? postDate.hashCode() : 0);
        result = 31 * result + (postDateGmt != null ? postDateGmt.hashCode() : 0);
        result = 31 * result + (postContent != null ? postContent.hashCode() : 0);
        result = 31 * result + (postTitle != null ? postTitle.hashCode() : 0);
        result = 31 * result + (postExcerpt != null ? postExcerpt.hashCode() : 0);
        result = 31 * result + (postStatus != null ? postStatus.hashCode() : 0);
        result = 31 * result + (commentStatus != null ? commentStatus.hashCode() : 0);
        result = 31 * result + (pingStatus != null ? pingStatus.hashCode() : 0);
        result = 31 * result + (postPassword != null ? postPassword.hashCode() : 0);
        result = 31 * result + (postName != null ? postName.hashCode() : 0);
        result = 31 * result + (toPing != null ? toPing.hashCode() : 0);
        result = 31 * result + (pinged != null ? pinged.hashCode() : 0);
        result = 31 * result + (postModified != null ? postModified.hashCode() : 0);
        result = 31 * result + (postModifiedGmt != null ? postModifiedGmt.hashCode() : 0);
        result = 31 * result + (postContentFiltered != null ? postContentFiltered.hashCode() : 0);
        result = 31 * result + (postParent != null ? postParent.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (menuOrder != null ? menuOrder.hashCode() : 0);
        result = 31 * result + (postType != null ? postType.hashCode() : 0);
        result = 31 * result + (postMimeType != null ? postMimeType.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "post_author", nullable = false)
    public Long getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }
}
