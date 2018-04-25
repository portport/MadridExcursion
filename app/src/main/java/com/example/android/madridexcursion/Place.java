package com.example.android.madridexcursion;

public class Place {

    private String mPlaceName;
    private String mPlaceAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String placeName, String placeAddress) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
    }

    public Place(String placeName, String placeAddress, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceAdress() {
        return mPlaceAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Place{" +
                "mPlaceName='" + mPlaceName + '\'' +
                ", mPlaceAddress='" + mPlaceAddress + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}