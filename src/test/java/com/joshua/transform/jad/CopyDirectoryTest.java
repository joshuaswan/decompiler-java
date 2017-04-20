package com.joshua.transform.jad;

import org.junit.Test;

import java.io.File;


/**
 * Created by joshua on 2017/4/18.
 */
public class CopyDirectoryTest {
    @Test
    public void testCopy() throws Exception {
        CopyDirectory.copy("src\\test\\resources\\class\\com","src\\test\\resources\\java\\com");
    }

    @Test
    public void turnJarToDir() throws Exception{
        String sec = "C:\\workspace\\transformOne\\src\\test\\resources\\jar";
        File file = new File(sec);
        File[] files = file.listFiles();
        File des = new File("C:\\workspace\\transformOne\\src\\test\\resources\\class");
        for (File f : files){
            Runtime runtime = Runtime.getRuntime();
            String cmd[] = new String[5];
            cmd[0] = "cmd "; //命令行
            cmd[1] = "/c "; //运行后关闭，
            cmd[2] = "start "; //启动另一个窗口来运行指定的程序或命令(cmd 命令集里的)
            cmd[3] = "mkdir ";
            cmd[4] = des + f.toString().substring(sec.length());
            String fullCmd = "";
            for (String s : cmd){
                fullCmd += s;
            }
            Process process = runtime.exec(fullCmd);
        }
    }
}