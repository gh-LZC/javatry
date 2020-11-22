package com.base.io;

import java.io.File;
import java.io.IOException;

/**
 * @class FileClassTest
 * @Author Administrator
 * @Description 1.file类只能用于文件(目录)的信息，不能用于文件内容的访问
 * @Date 2020/3/1 19:37
 * @Version 1.0
 */
public class FileClassTest {
    public static void main(String[] args) throws IOException {
      File file = new File("D:\\project\\javatry\\src\\main\\java\\com\\base\\io\\javaio.txt");
      if(!file.exists()){
          file.mkdir();
          file.mkdirs();

      }else {
          file.delete();
      }
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File file1 = new File("D:\\project\\javatry\\src\\main\\java\\com\\base\\io\\javaio.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        System.out.println(file1.getName());
    }
}
