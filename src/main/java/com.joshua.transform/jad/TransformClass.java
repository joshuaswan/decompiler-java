package com.joshua.transform.jad;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by joshua on 2017/4/17.
 */
public class TransformClass {
    public static void transformClass(String src, String des) {
        Runtime runtime = Runtime.getRuntime();
        String cmd[] = new String[7];
        cmd[0] = "cmd "; //命令行
        cmd[1] = "/c "; //运行后关闭，
        cmd[2] = "start "; //启动另一个窗口来运行指定的程序或命令(cmd 命令集里的)
        cmd[3] = "C:\\workspace\\transformOne\\src\\main\\resources\\jad.exe ";
        cmd[4] = "-sJava ";
        cmd[5] = "-d" + des + " ";
        cmd[6] = src;

        String fullCmd = "";
        for (String s : cmd) {
            fullCmd += s;
            System.out.print(s);
        }
        System.out.println();
        System.out.println(fullCmd);
        try {
            Process process = runtime.exec(fullCmd);
            System.out.println(process.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
