package ch.heigvd.ptl.sc.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Issue {
	@Id
	private String id;
                  
        @DBRef
        private User author;
        @DBRef
        private IssueType issueType;
        @DBRef
        private GeoData geoData;
        @DBRef
        private Comment comment;
	
	private String desc;
        private String tag;
	private Date   date;
        private String status;

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setIssueType(IssueType issueType) {
        this.issueType = issueType;
    }

    public void setGeoData(GeoData geoData) {
        this.geoData = geoData;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getAuthor() {
        return author;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public GeoData getGeoData() {
        return geoData;
    }

    public Comment getComment() {
        return comment;
    }

    public String getDesc() {
        return desc;
    }

    public String getTag() {
        return tag;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
	
}

