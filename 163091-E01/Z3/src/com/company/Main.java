package com.company;
import java.io.File;
import java.io.FilenameFilter;
public class Main {
    public static File[] pliki(String dir,String ext)
    {
        File tmp = new File(dir);
        FilenameFilter filter = (filter,s) -> !s.endsWith(ext) &&!file.isDirectory();
                return tmp.listFiles(filter);
    }
    public static void Main(String[]args){

    }
}
