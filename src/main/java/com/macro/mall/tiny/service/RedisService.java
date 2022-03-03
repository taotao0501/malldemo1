package com.macro.mall.tiny.service;

/**
 * @Description: redis操作Service, 对象和数组都以json形式进行存储
 * @Author: Bentao She
 * @Date: 2022/3/3 15:53
 * @Version: V1.0
 **/

public interface RedisService {

    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
