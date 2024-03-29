package com.limao.jvm.demo.oom;

/**
 * -XX:ThreadStackSize=1m
 *
 * -XX:+PrintGCDetails
 * -Xloggc:gc.log
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:HeapDumpPath=./
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 */
public class Demo2 {
    public static long counter = 0;

    public static void work(){
        System.out.println("目前是第" + (++counter) + "次调用方法");
        work();
    }

    public static void main(String[] args) {
        work();
    }
}
