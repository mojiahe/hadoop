package org.mjh.hadoop.rpc.server;

/**
 * Created by mojiahe on 2017/7/31.
 * 服务器端接口
 */
public interface UserServiceInterface {
    public static final long versionID = 1L;
    public String login(String username,String password);
}
