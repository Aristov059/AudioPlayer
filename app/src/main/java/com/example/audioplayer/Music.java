package com.example.audioplayer;

public class Music {
    private String title;
    private String group;
    private int filePath;

    public Music(String title, String group, int filePath) {
        this.title = title;
        this.group = group;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return group;
    }

    public int getFilePath() {
        return filePath;
    }
}