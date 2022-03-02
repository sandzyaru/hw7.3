package com.example.hw7;

public class YourPostsLiked {
    private int woman;
    private int likedPhoto;
    private int rectangleHeart;
public YourPostsLiked(int woman, int likedPhoto, int rectangleHeart){
    this.woman=woman;
    this.likedPhoto=likedPhoto;
    this.rectangleHeart=rectangleHeart;
}
    public int getWoman() {
        return woman;
    }

    public void setWoman(int woman) {
        this.woman = woman;
    }

    public int getLikedPhoto() {
        return likedPhoto;
    }

    public void setLikedPhoto(int likedPhoto) {
        this.likedPhoto = likedPhoto;
    }

    public int getRectangleHeart() {
        return rectangleHeart;
    }

    public void setRectangleHeart(int rectangleHeart) {
        this.rectangleHeart = rectangleHeart;
    }
}
