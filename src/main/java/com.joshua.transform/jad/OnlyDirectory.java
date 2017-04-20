package com.joshua.transform.jad;

import java.io.File;

/**
 * Created by joshua on 2017/4/18.
 */
public class OnlyDirectory {

    //复制对应文件目录结构
    public static void copy(String src,String des){
        File file1 = new File(src);
        File[] files = file1.listFiles();
        File file2 = new File(des);

        if (!file2.exists()){
            file2.mkdirs();
        }
        for (File f :files){
            if (f.isDirectory()){
                copy(f.getPath(),des + "\\" + f.getName());
            }
        }
    }
}
