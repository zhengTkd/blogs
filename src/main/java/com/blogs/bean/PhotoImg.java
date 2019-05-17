package com.blogs.bean;

public class PhotoImg {
    private Integer photoImgId;

    private String imgName;

    private Integer photoId;

    public Integer getPhotoImgId() {
        return photoImgId;
    }

    public void setPhotoImgId(Integer photoImgId) {
        this.photoImgId = photoImgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }
}