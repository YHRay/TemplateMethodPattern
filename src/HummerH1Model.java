public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    public void start() {
        //汽车发动
        System.out.println("悍马H1发送。。。。");
    }

    @Override
    public void stop() {
        //停车
        System.out.println("悍马H1停车。。。。");

    }

    @Override
    public void alarm() {
        //H1型号的悍马车鸣笛
        System.out.println("悍马H1鸣笛。。。。");

    }

    @Override
    public void engineBoom() {

        //引擎轰鸣声
        System.out.println("悍马H1引擎声音是这样在。。。。");

    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是有客户的来决定的
    public void setAlarmFlag(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
