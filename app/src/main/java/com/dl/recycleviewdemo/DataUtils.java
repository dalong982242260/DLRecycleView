package com.dl.recycleviewdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dalong  on 2017/6/24.
 */

public class DataUtils {

    public static String[] YY = new String[]{
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1190959541,2711891552&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2329768082,547823924&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2352827802,2848834640&fm=26&gp=0.jpg",
            "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1547347540,2145495751&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=722471070,3333236926&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3106028148,2147340926&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1451651807,1476632165&fm=26&gp=0.jpg",
            "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3913176920,1016530871&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=203065701,4199835161&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3553597753,2410175129&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3280515897,202693379&fm=15&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=263864210,2092730158&fm=15&gp=0.jpg"
    };

    public static String[] ZLY = new String[]{
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3711567022,2938126513&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3910016704,1066920930&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1524660255,2967199347&fm=26&gp=0.jpg",
            "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2258750211,1838276354&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2922383168,1867465424&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1526726371,896833111&fm=26&gp=0.jpg",
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=193957112,2834449265&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1837800871,1380142483&fm=15&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2037189390,1578812258&fm=26&gp=0.jpg",
            "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1426324970,3683510789&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1280880984,2992713048&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3049491580,65737732&fm=15&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3493218948,1011701232&fm=26&gp=0.jpg",
    };


    public static List<People> getPeoples() {
        List<People> peopleList = new ArrayList<>();
        People people = new People();
        people.name = "杨洋";
        people.imgUrl = new ArrayList<>();
        for (int i = 0; i < YY.length; i++) {
            people.imgUrl.add(YY[i]);
        }

        People people1 = new People();
        people1.name = "杨洋";
        people1.imgUrl = new ArrayList<>();
        for (int i = 0; i < ZLY.length; i++) {
            people1.imgUrl.add(ZLY[i]);
        }

        peopleList.add(people);
        peopleList.add(people1);
        peopleList.add(people);
        peopleList.add(people1);
        peopleList.add(people);
        peopleList.add(people1);
        peopleList.add(people);
        peopleList.add(people1);
        peopleList.add(people);
        peopleList.add(people1);
        return peopleList;
    }
}
