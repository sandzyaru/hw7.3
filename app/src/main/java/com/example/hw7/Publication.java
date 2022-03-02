package com.example.hw7;

public class Publication {
    private String postText;
    private String postData;
    private int image;
    private Integer keyId;
    public  Publication (String postText,String postData,int image,Integer keyId){
        this.postText=postText;
        this.postData=postData;
        this.image=image;
        this.keyId=keyId;
    }
    public  Publication (String postText,String postData,int image){
        this.postText=postText;
        this.postData=postData;
        this.image=image;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostData() {
        return postData;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }
}
