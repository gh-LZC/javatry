package com.base.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @class FileUtils
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 21:18
 * @Version 1.0
 */
public class FileUtils {
    //列出指定目录下(包括其子目录)的所有文件
    public static List<String> listFileNames(File dir,List<String> fileNames) throws IllegalAccessException {
        if (!dir.exists()) {
            throw new IllegalAccessException("目录:" + dir + "不存在.");
        }
        if (!dir.isDirectory()) {
            throw new IllegalAccessException(dir + "不是目录.");
        }
        /*String[] filenames = dir.list();
        for (String finename : filenames) {
            System.out.println(finename);
        }*/
        File[] files = dir.listFiles();
        //List<String> fileNames = new ArrayList<>();
        List<String> dirNames = new ArrayList<>();
        int countFile = 0;
        if (files != null && files.length != 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    dirNames.add(file.getName());
                    listFileNames(file,fileNames);
                } else {
                    fileNames.add(file.getName());
                    countFile++;
                }
            }
            System.out.println("dirNames:"+dirNames);
            System.out.println("fileNames:"+fileNames);
            System.out.println(countFile);
        }
        return fileNames;
    }

    public static int getFilesNum(File file) throws IllegalAccessException {
        int filesNum = listFileNames(file,new ArrayList<>()).size();
        System.out.println(filesNum);
        return filesNum;
    }


}
