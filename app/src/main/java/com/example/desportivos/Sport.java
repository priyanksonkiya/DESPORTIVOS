package com.example.desportivos;

public class Sport {

    private static final int HAS_IMAGE_ID = -1 ;

    private int mSportNameId;
    private int mImageResourceId = HAS_IMAGE_ID;

    public Sport(int sportName, int ImageResourceId) {
        mSportNameId = sportName;
        mImageResourceId = ImageResourceId;
    }

    public int getSportName(){
        return mSportNameId;
    }
    public int getmImageResourceId(){
        return  mImageResourceId;
    }

    public boolean hasImage(){return mImageResourceId!=HAS_IMAGE_ID;}
}
