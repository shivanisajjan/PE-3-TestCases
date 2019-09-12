package com.stackroute;

public class InFolderSelectGivenExtensionFilename {
    private String foldername;
    private String filename;

    InFolderSelectGivenExtensionFilename(String foldername, String filename){
        this.foldername=foldername;
        this.filename=filename;
    }
    public String getFoldername() {
        return foldername;
    }

    public void setFoldername(String foldername) {
        this.foldername = foldername;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String fileContent(){
        return null;
    }
}
