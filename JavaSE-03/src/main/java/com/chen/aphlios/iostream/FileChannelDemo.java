package com.chen.aphlios.iostream;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/25  15:47
 * @PackageName: com.chen.aphlios.iostream
 * @ClassName: FileChannelDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class FileChannelDemo {

    /**
     *
     * StandardOpenOption   枚举
     *
            *READ,                  -->打开阅读权限。
            *WRITE,                 -->打开以进行写入。
            *APPEND,                --->如果文件打开WRITE访问，则字节将被写入文件的末尾而不是开头。
            *TRUNCATE_EXISTING,     -->如果文件已经存在，并且打开 WRITE访问，则其长度将截断为0。
            *CREATE,                --->创建一个新文件（如果不存在）。
            *CREATE_NEW,            --->创建一个新的文件，如果该文件已经存在失败。
            *DELETE_ON_CLOSE,       --->关闭时删除。
            *SPARSE,                --->稀疏文件
            *SYNC,                  --->要求将文件内容或元数据的每次更新都同步写入底层存储设备。
            *DSYNC;                 --->要求将文件内容的每次更新都与底层存储设备同步写入。
     *
     */

    //NIO实现文件的复制
    //通道之间的数据传输(直接缓冲区的模式)
    public void copyDemo3(File file,File dst) throws IOException {
        //只读。
        FileChannel open = FileChannel.open(file.toPath(), StandardOpenOption.READ);
        //读、写、创建。
        FileChannel fileChannel = FileChannel.open(dst.toPath(), StandardOpenOption.READ,
                StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
        //  从给定的可读字节通道将字节传输到该通道的文件中。
        long from = fileChannel.transferFrom(open, 0, open.size());
    }

    //使用直接缓冲区完成文件的复制(内存映射文件)
    public void copyDemo2(File file , File dst) throws IOException {
        //只读
        FileChannel inChannel = FileChannel.open(file.toPath(), StandardOpenOption.READ);
        //读、写、创建
        FileChannel outChannel = FileChannel.open(dst.toPath(), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
        MappedByteBuffer inMapperBuf = inChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
        MappedByteBuffer outMapperBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        byte[] bytes = new byte[inMapperBuf.limit()];
        inMapperBuf.get(bytes);
        outMapperBuf.put(bytes);
        inChannel.close();
        outChannel.close();
    }




    public static void main(String[] args) {
    }
}
