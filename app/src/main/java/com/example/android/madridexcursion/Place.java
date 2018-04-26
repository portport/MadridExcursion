package com.example.android.madridexcursion;

public class Place {

    private int mPlaceName;
    private int mPlaceAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(int placeName, int placeAddress) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
    }

    public Place(int placeName, int placeAddress, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
    }

    public int getPlaceName() {
        return mPlaceName;
    }

    public int getPlaceAdress() {
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