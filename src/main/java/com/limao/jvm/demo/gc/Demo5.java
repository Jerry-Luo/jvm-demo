package com.limao.jvm.demo.gc;
/**
 * -XX:NewSize=104857600                      100M
 * -XX:MaxNewSize=104857600                   100M
 * -XX:InitialHeapSize=209715200              200M
 * -XX:MaxHeapSize=209715200                  200M
 * -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15
 * -XX:PretenureSizeThreshold=3145728           3M
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:gc_demo5.log
 * @author <a href="mailto:luojianwei@qiancangkeji.cn">LuoJianwei</a>
 * @since 1.0.0
 */
public class Demo5 {

    public static void main(String[] args) throws Exception {
        Thread.sleep(30000);
        while (true){
            loadData();
        }
    }

    private static void loadData() throws Exception {
        byte[] data = null;
        for (int i=0; i<50; i++) {
            data = new byte[100 * 1024];
        }
        data = null;

        Thread.sleep(1000);
    }
}
