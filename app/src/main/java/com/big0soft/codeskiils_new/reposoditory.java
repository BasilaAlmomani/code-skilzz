package com.big0soft.codeskiils_new;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;

public class reposoditory {
    private ApiInterface apiInterface;

    public reposoditory() {
        this.apiInterface = retrofit.getInstance().service();
    }

    public static ArrayList<Course> getTest() {
        ArrayList<Course> courseArrayList = new ArrayList<>();

        courseArrayList.add(new Course("https://logos-world.net/wp-content/uploads/2022/07/Java-Logo.jpg", "JAVA", 3));
        courseArrayList.add(new Course("https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230703144619/CPP-Language.png", "C++", 2));
        courseArrayList.add(new Course("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Python-logo-notext.svg/1869px-Python-logo-notext.svg.png", "Python", 10));
        return courseArrayList;
    }


    public Single<List<Course>> getCourses(){
        return apiInterface.getAllCourse();
    }
}

