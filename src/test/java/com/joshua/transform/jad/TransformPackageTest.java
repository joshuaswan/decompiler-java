package com.joshua.transform.jad;

import org.junit.Test;

import java.io.File;

/**
 * Created by joshua on 2017/4/18.
 */
public class TransformPackageTest {

    @Test
    public void testCopy() throws Exception {
        TransformPackage.copy("src\\test\\resources\\class","src\\test\\resources\\java");
//        TransformPackage.copy("src\\test\\resources\\class\\com","src\\test\\resources\\java\\com");
    }
    @Test
    public void exportAllJar() throws Exception{
        String jarPath = "src\\test\\resources\\jar";
        File source = new File(jarPath);
        File[] files = source.listFiles();
        for (File f : files) {
            System.out.println(f.toString());
            System.out.println("src\\test\\resources\\class" + f.toString().substring(jarPath.length()));
            ExportJar.export(f.toString(),
                    "src\\test\\resources\\class" + f.toString().substring(jarPath.length()));
        }

        TransformPackage.copy("src\\test\\resources\\class","src\\test\\resources\\java");
    }
}