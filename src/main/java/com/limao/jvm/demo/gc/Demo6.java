package com.limao.jvm.demo.gc;
/**
 * -XX:NewSize=104857600                          100M
 * -XX:MaxNewSize=104857600                       100M
 * -XX:InitialHeapSize=209715200                  200M
 * -XX:MaxHeapSize=209715200                      200M
 * -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15
 * -XX:PretenureSizeThreshold=20971520             20M
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:gc_demo6.log
 *
 * after optimization
 * -XX:NewSize=209715200
 * -XX:MaxNewSize=209715200
 * -XX:InitialHeapSize=314572800
 * -XX:MaxHeapSize=314572800
 * -XX:SurvivorRatio=2
 * -XX:MaxTenuringThreshold=15
 * -XX:PretenureSizeThreshold=20971520
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:gc_demo6_after_optimization.log
 *
 * @author <a href="mailto:luojianwei@qiancangkeji.cn">LuoJianwei</a>
 * @since 1.0.0
 */
public class Demo6 {

    public static void main(String[] args) throws Exception {
        Thread.sleep(30000);
        while (true) {
            loadData();
        }
    }

    private static void loadData() throws Exception {
        byte[] data = null;
        for (int i=0; i<4; i++){
            data = new byte[10 * 1024 * 1024];
        }
        data = null;

        byte[] data1 = new byte[10 * 1024 * 1024];
        byte[] data2 = new byte[10 * 1024 * 1024];
        byte[] data3 = new byte[10 * 1024 * 1024];
        data3 = new byte[10 * 1024 * 1024];

        Thread.sleep(1000);
    }
}
