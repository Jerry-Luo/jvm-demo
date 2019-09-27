package com.limao.jvm.demo;
/**
 * -XX:NewSize=10485760                             10M
 * -XX:MaxNewSize=10485760                          10M
 * -XX:InitialHeapSize=20971520                     20M
 * -XX:MaxHeapSize=20971520                         20M
 * -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15
 * -XX:PretenureSizeThreshold=10485760              10M
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:gc_demo2.log
 *
 * @author <a href="mailto:luojianwei@qiancangkeji.cn">LuoJianwei</a>
 * @since 1.0.0
 */
public class Demo3 {
    public static void main(String[] args) {
        byte[] array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2 * 1024 * 1024];

        byte[] array2 = new byte[128 * 1024];
        array2 = null;

        byte[] array3 = new byte[2 * 1024 * 1024];
    }
}
