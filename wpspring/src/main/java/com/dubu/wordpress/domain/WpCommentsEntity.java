package com.dubu.wordpress.domain;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 11:27
 */
@Entity
@javax.persistence.Table(name = "wp_comments", schema = "wp", catalog = "")
public class WpCommentsEntity implements Serializable {
    private Long commentId;

    @Id
    @javax.persistence.Column(name = "comment_ID", nullable = false)
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    private Long commentPostId;

    @Basic
    @javax.persistence.Column(name = "comment_post_ID", nullable = false)
    public Long getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(Long commentPostId) {
        this.commentPostId = commentPostId;
    }

    private String commentAuthor;

    @Basic
    @javax.persistence.Column(name = "comment_author", nullable = false, length = -1)
    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    private String commentAuthorEmail;

    @Basic
    @javax.persistence.Column(name = "comment_author_email", nullable = false, length = 100)
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    private String commentAuthorUrl;

    @Basic
    @javax.persistence.Column(name = "comment_author_url", nullable = false, length = 200)
    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    private String commentAuthorIp;

    @Basic
    @javax.persistence.Column(name = "comment_author_IP", nullable = false, length = 100)
    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp;
    }

    private DateTime commentDate;

    @Basic
    @javax.persistence.Column(name = "comment_date", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(DateTime commentDate) {
        this.commentDate = commentDate;
    }

    private DateTime commentDateGmt;

    @Basic
    @javax.persistence.Column(name = "comment_date_gmt", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getCommentDateGmt() {
        return commentDateGmt;
    }

    public void setCommentDateGmt(DateTime commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    private String commentContent;

    @Basic
    @javax.persistence.Column(name = "comment_content", nullable = false, length = -1)
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    private Integer commentKarma;

    @Basic
    @javax.persistence.Column(name = "comment_karma", nullable = false)
    public Integer getCommentKarma() {
        return commentKarma;
    }

    public void setCommentKarma(Integer commentKarma) {
        this.commentKarma = commentKarma;
    }

    private String commentApproved;

    @Basic
    @javax.persistence.Column(name = "comment_approved", nullable = false, length = 20)
    public String getCommentApproved() {
        return commentApproved;
    }

    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved;
    }

    private String commentAgent;

    @Basic
    @javax.persistence.Column(name = "comment_agent", nullable = false, length = 255)
    public String getCommentAgent() {
        return commentAgent;
    }

    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent;
    }

    private String commentType;

    @Basic
    @javax.persistence.Column(name = "comment_type", nullable = false, length = 20)
    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    private Long commentParent;

    @Basic
    @javax.persistence.Column(name = "comment_parent", nullable = false)
    public Long getCommentParent() {
        return commentParent;
    }

    public void setCommentParent(Long commentParent) {
        this.commentParent = commentParent;
    }

    private Long userId;

    @Basic
    @javax.persistence.Column(name = "user_id", nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WpCommentsEntity that = (WpCommentsEntity) o;

        if (commentId != null ? !commentId.equals(that.commentId) : that.commentId != null) return false;
        if (commentPostId != null ? !commentPostId.equals(that.commentPostId) : that.commentPostId != null)
            return false;
        if (commentAuthor != null ? !commentAuthor.equals(that.commentAuthor) : that.commentAuthor != null)
            return false;
        if (commentAuthorEmail != null ? !commentAuthorEmail.equals(that.commentAuthorEmail) : that.commentAuthorEmail != null)
            return false;
        if (commentAuthorUrl != null ? !commentAuthorUrl.equals(that.commentAuthorUrl) : that.commentAuthorUrl != null)
            return false;
        if (commentAuthorIp != null ? !commentAuthorIp.equals(that.commentAuthorIp) : that.commentAuthorIp != null)
            return false;
        if (commentDate != null ? !commentDate.equals(that.commentDate) : that.commentDate != null) return false;
        if (commentDateGmt != null ? !commentDateGmt.equals(that.commentDateGmt) : that.commentDateGmt != null)
            return false;
        if (commentContent != null ? !commentContent.equals(that.commentContent) : that.commentContent != null)
            return false;
        if (commentKarma != null ? !commentKarma.equals(that.commentKarma) : that.commentKarma != null) return false;
        if (commentApproved != null ? !commentApproved.equals(that.commentApproved) : that.commentApproved != null)
            return false;
        if (commentAgent != null ? !commentAgent.equals(that.commentAgent) : that.commentAgent != null) return false;
        if (commentType != null ? !commentType.equals(that.commentType) : that.commentType != null) return false;
        if (commentParent != null ? !commentParent.equals(that.commentParent) : that.commentParent != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId != null ? commentId.hashCode() : 0;
        result = 31 * result + (commentPostId != null ? commentPostId.hashCode() : 0);
        result = 31 * result + (commentAuthor != null ? commentAuthor.hashCode() : 0);
        result = 31 * result + (commentAuthorEmail != null ? commentAuthorEmail.hashCode() : 0);
        result = 31 * result + (commentAuthorUrl != null ? commentAuthorUrl.hashCode() : 0);
        result = 31 * result + (commentAuthorIp != null ? commentAuthorIp.hashCode() : 0);
        result = 31 * result + (commentDate != null ? commentDate.hashCode() : 0);
        result = 31 * result + (commentDateGmt != null ? commentDateGmt.hashCode() : 0);
        result = 31 * result + (commentContent != null ? commentContent.hashCode() : 0);
        result = 31 * result + (commentKarma != null ? commentKarma.hashCode() : 0);
        result = 31 * result + (commentApproved != null ? commentApproved.hashCode() : 0);
        result = 31 * result + (commentAgent != null ? commentAgent.hashCode() : 0);
        result = 31 * result + (commentType != null ? commentType.hashCode() : 0);
        result = 31 * result + (commentParent != null ? commentParent.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
