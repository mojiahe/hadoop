package org.mjh.hadoop.rpc.client;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.mjh.hadoop.rpc.server.UserServiceInterface;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCClient {

    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        UserServiceInterface userServiceImpl = RPC.getProxy(UserServiceInterface.class, 1L, new InetSocketAddress("127.0.0.1", 10000), conf);
        String user = userServiceImpl.login("mojiahe", "123456");
        System.out.println(user);
    }
}
