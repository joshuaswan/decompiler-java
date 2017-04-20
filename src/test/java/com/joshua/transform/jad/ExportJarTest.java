package com.joshua.transform.jad;

import org.junit.Test;

import java.io.File;

/**
 * Created by joshua on 2017/4/18.
 */
public class ExportJarTest {

    @Test
    public void exportTest(){
        ExportJar.export("src\\test\\resources\\jar\\argus-support-1.0-SNAPSHOT.jar",
                "src\\test\\resources\\class\\");
    }

    @Test
    public void exportAll(){
        String jarPath = "C:\\workspace\\transformOne\\src\\test\\resources\\jar";
        File source = new File(jarPath);
        File[] files = source.listFiles();
        for (File f : files) {
            System.out.println(f.toString());
            System.out.println("C:\\workspace\\transformOne\\src\\test\\resources\\class" + f.toString().substring(jarPath.length()));
            ExportJar.export(f.toString(),
                    "C:\\workspace\\transformOne\\src\\test\\resources\\class" + f.toString().substring(jarPath.length()));
        }
    }
}