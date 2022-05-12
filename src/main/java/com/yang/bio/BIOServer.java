package com.yang.bio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @Author Chengzhi
 * @Date 2021/4/16 14:49
 * @Version 1.0
 *
 *
 * 采用线程池实现BIO实例
 * 服务端
 */
public class BIOServer {
    public static void main(String[] args) throws IOException {
        //创建线程池
        //1.创建一个线程池
        //2.如果有客户端连接，创建一个线程与之通信（单独写一个方法）
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();


        //阿里巴巴推荐使用这种方式创建线程池，可以加深对线程池的理解
        //corePoolSize 核心线程池大小
        //maximumPoolSize最大核心线程池大小
        //keepAliveTime 超时了没有人调用就会被释放
        //TimeUnit 超时单位
        // workQueue 阻塞队列
        //threadFactory 线程工厂
        //handle 拒绝策略
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2,//正常工作的线程个数
                5,         //最大可以工作的线程个数
                10,             //线程释放时间
                TimeUnit.MICROSECONDS,      //线程释放时间单位
                new LinkedBlockingDeque<>(3),   //阻塞任务队列
                Executors.defaultThreadFactory(),       //拒绝策略
                new ThreadPoolExecutor.DiscardOldestPolicy());
        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("服务器已启动啦");
        while(true){
            //监听，等待客户端连接
            System.out.println("等待连接....");
            final Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");
            //创建一个线程与之通信（单独写一个方法）
            threadPool.execute(new Runnable() {
                public void run() {//重写run（）
                    //可以和客服端通信
                    handler(socket);
                }
            });
        }
    }

    //编写一个handler方法，读取客户端发送的消息
    public static void handler(Socket socket){
        try {
            System.out.println("启动一个新线程："+Thread.currentThread().getName() + "与新客户端进行通信");
            byte[] bytes = new byte[1024];
            //通过socket，获取输入流;
            InputStream inputStream = socket.getInputStream();
            //循环的读取客户端发送的数据
            while(true) {
                System.out.println("\nread....");
                int read = inputStream.read(bytes);
                //只有当客户端关闭它的输出流的时候，服务器才能取得结尾的-1
                if (read != -1) {
                    System.out.print("线程池的:" + Thread.currentThread().getName() + "接收到Client says:" + ( new String(bytes, 0, read)));//输出客户端发送的数据
                }
                //服务器打印完毕,发消息给客户端
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭Client的连接");
            
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
