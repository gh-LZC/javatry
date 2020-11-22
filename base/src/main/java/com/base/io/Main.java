package com.base.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * @class Main
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/1 18:19
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws  FileNotFoundException {
        File file = new File("demo");
        System.out.println(Main.class.getResource("").getPath());
        System.out.println(ClassLoader.getSystemResource(""));
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
    }

    public void testByteCode() throws UnsupportedEncodingException {
        String s = "123慕课网abc-";
        //GBK,中文占用2个字节，数字和英文及符号占用1个字节
        byte[] gbkBytes = s.getBytes("GBK");
        //utf-8,中文占用3个字节，数字和英文及符号占用1个字节
        byte[] utf8Bytes = s.getBytes("UTF-8");
        //UTF-16be,中文占用2两个字节，数字和英文及符号占用2个字节
        byte[] utf16Bytes = s.getBytes("UTF-16be");
        for (byte b : gbkBytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        for (byte b : utf8Bytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        for (byte b : utf16Bytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        String s1 = new String();
        //当用特定编码的字节流创建，字符串时候，需要把字符串设置位对于的编码，要不就会乱码。
        //文本文件 就是字节序列，特定的文本会有默认的字符编码
        //如果我们在中文机器上创建文本文件，那么该文本文件只认识ansi编码
    }
}
