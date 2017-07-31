package org.mjh.hadoop.rpc.server;

/**
 * Created by mojiahe on 2017/7/31.
 * 模拟服务器端服务的实现
 */
public class UserServiceImpl implements UserServiceInterface {
    @Override
    public String login(String username, String password) {
        return username + "logged in successfully !";
    }
}
