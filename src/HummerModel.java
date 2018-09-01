public abstract class HummerModel {
    /*
    首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正要是能够发动起来，那这个实现要在实现类里里
     */
    public abstract void start();

    //能发动，还要能停下来，那才是真本事
    public abstract void stop();

    //喇叭会发出声音，是滴滴叫，还是哔哔叫
    public abstract void alarm();

    //引擎会轰隆隆的响，不响那是假的
    public abstract void engineBoom();

    //那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    public   void run(){
        this.start();
        //引擎开始轰鸣声
        this.engineBoom();
        //要让它叫的就叫，喇叭不想让它响就不响
        if (this.isAlarm()){
            this.alarm();
        };
        //到达目的地就停车
        this.stop();
    };

    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return  true;
    }
}