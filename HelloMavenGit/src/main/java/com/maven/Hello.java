package com.maven;

/**
 * unable to access 'https://github.com/XXXXX/': OpenSSL SSL_read: Connection was reset, errno 10054
 * https://blog.51cto.com/u_14691718/3334457 直接把 .git/cofig中的url里https改成http就OK了
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("这个是初始化提交");
        System.out.println("111");
        System.out.println("创建分支");
        System.out.println("主干添加112233");
        System.out.println("分支添加445566");
        System.out.println("在线更新");
        System.out.println("本地增加新的一行代码commit");
    }
}
