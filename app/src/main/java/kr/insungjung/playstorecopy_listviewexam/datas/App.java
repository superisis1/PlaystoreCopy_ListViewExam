package kr.insungjung.playstorecopy_listviewexam.datas;

import android.media.Image;

public class App {
//    Image appIconImg;
    public int appTitleNum;
    public String appTitle;
    public String appCompany;
//    Image starImg;
    public String appInstall;

    public App(int appTitleNum, String appTitle, String appCompany, String appInstall) {
        this.appTitleNum = appTitleNum;
        this.appTitle = appTitle;
        this.appCompany = appCompany;
        this.appInstall = appInstall;
    }
}
