package com.yang.bio;

import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;


/**
 * @Author Chengzhi
 * @Date 2021/4/21 11:20
 * @Version 1.0
 */
public class BIOClient {

    public static void main(String[] args) throws IOException {
        //发送数据
        writeData();
    }

    public static void writeData() throws IOException {
        //创建与服务器绑定端口对应的套接字;
        //socket 通过 协议 + 端口 + ip 地址找到网络通信进程
        Socket socket = new Socket("127.0.0.1",6666);
        //监听客户端发送的消息(循环)
        Scanner scanner = new Scanner(System.in);
        while(true){
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            String msg = scanner.nextLine();
            byte[] bytes = msg.getBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
        }

    }
}
