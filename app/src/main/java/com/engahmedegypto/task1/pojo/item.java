package com.engahmedegypto.task1.pojo;

import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class item {

    private int stare;
    private int mainImage ;

    public item(int stare, int mainImage) {
        this.stare = stare;
        this.mainImage = mainImage;
    }

    public item() {
    }

    public int getStare() {
        return stare;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setStare(int stare) {
        this.stare = stare;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }
}
