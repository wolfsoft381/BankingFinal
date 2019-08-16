package com.ws.design.ModelClass;

public class LoanModelClass {

    Integer image;
    String title,sub_title;

    public LoanModelClass(Integer image, String title, String sub_title) {
        this.image = image;
        this.title = title;
        this.sub_title = sub_title;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }
}
