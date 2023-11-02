package com.big0soft.codeskiils_new;

public class Course  {


    private String imageUrl;

    private String courseName;
    private int chapterCount;


    public Course(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Course() {


    }

    public Course(String imageUrl, String courseName, int chapterCount) {
        this.imageUrl = imageUrl;
        this.courseName = courseName;
        this.chapterCount = chapterCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "code_model{" +
                "test='" + imageUrl + '\'' +
                '}';
    }




}
