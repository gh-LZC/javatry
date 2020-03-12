RandomAccessFile 支持随机访问文件，可以访问的任意位置
1.java文件模型
在硬盘上的文件是byte byte byte 存储的，是数据的集合。
2.打开文件
有两种模式“rw”读写，“r”只读
RandomAccessFile raf = new RandomAccessFile(file,"rw");
文件指正，打开文件时指针在开头point = 0;
3.写方法
raf.write(int)-->只写一个字节（后8位），同时指针指向下一个位置，准备再次写入
4.读方法
int b = raf。read（） 读一个字节
5.文件写完以后一定要关闭 oracle 官方说明