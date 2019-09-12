package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    private String filename;

    WordFrequency(String filename){
        this.filename=filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public Map<String,Integer> wordFrequency(){
        Map< String,Integer> hm = new HashMap< String,Integer>();
        return hm;
    }
}
