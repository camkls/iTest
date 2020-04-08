package cn.ace.vo;

import java.io.Serializable;

/**
 * @author Askyi
 */
public class Student implements Serializable {

    private int stuId;
    private String stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private String stuEdu;
    private String stuClass;
    private int stuCredit;

    public Student() {
    }

    public Student(int stuId) {
        this.stuId = stuId;
    }

    public Student(int stuId, String stuNum, String stuName, String stuGender, int stuAge, String stuEdu, String stuClass, int stuCredit) {
        this.stuId = stuId;
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuAge = stuAge;
        this.stuEdu = stuEdu;
        this.stuClass = stuClass;
        this.stuCredit = stuCredit;
    }


    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuEdu() {
        return stuEdu;
    }

    public void setStuEdu(String stuEdu) {
        this.stuEdu = stuEdu;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public int getStuCredit() {
        return stuCredit;
    }

    public void setStuCredit(int stuCredit) {
        this.stuCredit = stuCredit;
    }


    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuAge=" + stuAge +
                ", stuEdu='" + stuEdu + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuCredit=" + stuCredit +
                '}';
    }
}