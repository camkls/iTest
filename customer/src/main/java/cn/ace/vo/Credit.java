package cn.ace.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Askyi
 */
public class Credit implements Serializable {

    private int creId;
    private int creScore;
    private String creReason;
    private Date creDate;
    private int stuId;

    public Credit() {
    }

    public Credit(int stuId) {
        this.stuId = stuId;
    }

    public Credit(int creId, int creScore, String creReason, Date creDate, int stuId) {
        this.creId = creId;
        this.creScore = creScore;
        this.creReason = creReason;
        this.creDate = creDate;
        this.stuId = stuId;
    }

    public int getCreId() {
        return creId;
    }

    public void setCreId(int creId) {
        this.creId = creId;
    }

    public int getCreScore() {
        return creScore;
    }

    public void setCreScore(int creScore) {
        this.creScore = creScore;
    }

    public String getCreReason() {
        return creReason;
    }

    public void setCreReason(String creReason) {
        this.creReason = creReason;
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creId=" + creId +
                ", creScore=" + creScore +
                ", creReason='" + creReason + '\'' +
                ", creDate=" + creDate +
                ", stuId=" + stuId +
                '}';
    }
}
