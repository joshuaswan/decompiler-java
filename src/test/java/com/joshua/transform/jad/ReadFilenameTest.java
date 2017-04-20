package com.joshua.transform.jad;

import org.junit.Test;

import java.io.File;

/**
 * Created by joshua on 2017/4/18.
 */
public class ReadFilenameTest {

    @Test
    public void testReadFile() throws Exception {
        String parent = "D:\\workfile\\流量审计\\argus_bjunicom\\argus_bjunicom\\argus-bjunicom-2016.7.5";
        File file = new File(parent);
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f.toString());
            ReadFilename.readFile(f.toString() + "\\lib");
            System.out.println("------------------------------------");
        }
    }
}