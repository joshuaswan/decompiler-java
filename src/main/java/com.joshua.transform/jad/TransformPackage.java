package com.joshua.transform.jad;

/**
 * Created by joshua on 2017/4/18.
 */

import java.io.*;

public class TransformPackage {

    public static void copy(String src, String des) {
        File file1=new File(src);
        File[] fs=file1.listFiles();
        File file2=new File(des);
        if(!file2.exists()){
            file2.mkdirs();
        }
        for (File f : fs) {
            if(f.isFile()){
//                String filename = f.getName();
//                if(filename.substring(filename.lastIndexOf(".")+1) == "class"){
                    transformClass(f.getPath(),des);
//                }else {
//                    CopyDirectory.fileCopy(f.getPath(),des+"\\"+f.getName());
//                }
            }else if(f.isDirectory()){
                copy(f.getPath(),des+"\\"+f.getName());
            }
        }
    }

    /**
     * 文件拷贝的方法
     */
    private static void transformClass(String src, String des) {
        TransformClass.transformClass(src,des);
    }
}
