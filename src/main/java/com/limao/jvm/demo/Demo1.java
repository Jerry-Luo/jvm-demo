package com.limao.jvm.demo;
/**
 * -XX:NewSize=5242880                                 5M
 * -XX:MaxNewSize=5242880                              5M
 * -XX:InitialHeapSize=10485760                       10M
 * -XX:MaxHeapSize=10485760                           10M
 * -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=10485760                10M
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:gc_demo1.log
 *
 * @author <a href="mailto:luojianwei@qiancangkeji.cn">LuoJianwei</a>
 * @since 1.0.0
 */
public class Demo1 {
    public static void main(String[] args) {
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
    }
}
