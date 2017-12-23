package com.example.anchitchawla.music;

import android.widget.ArrayAdapter;

/**
 * Created by Anchit Chawla on 24-11-2017.
 */

public class musictaste {
    private String title;
    private String album;
    private int imgid;

    public  musictaste(String name,String name2,int id)
    {
        this.title=name;
        this.album=name2;
        this.imgid=id;
    }

    public String getTitlee()
    {
        return title;
    }
    public String getAlbumm()
    {
        return album;
    }
    public int getImgid()
    {
        return imgid;
    }
}
