package com.joshua.transform.jad;

import java.io.File;

/**
 * Created by joshua on 2017/4/18.
 */
public class ReadFilename {
    public static void readFile(String dir){
        File file = new File(dir);
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f.toString().substring(dir.length()+1));
        }
    }
}
