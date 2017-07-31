package org.mjh.hadoop.rpc.server;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

/**
 * Created by mojiahe on 2017/7/31.
 * 使用hadoop RPC框架开放服务接口
 */
public class RPCServer {
    public static void main(String args[]) throws IOException {
        Configuration conf = new Configuration();
        RPC.Builder builder = new RPC.Builder(conf);
        builder.setInstance(new UserServiceImpl()).setPort(10000).setBindAddress("127.0.0.1").setProtocol(UserServiceInterface.class);
        RPC.Server server = builder.build();
        server.start();
    }
}
