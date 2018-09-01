import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args){
        //xx公司要H1型号的悍马

        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要，1-需要");
        String type = null;
        try {
            type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        HummerModel h1 = new HummerH1Model();
        if (type.equals("0")){
            ((HummerH1Model) h1).setAlarmFlag(false);
        }

        h1.run();

        System.out.println("-----------------H2悍马----------------");
        HummerModel h2 = new HummerH2Model();

        //H2模型演示
        h2.run();
    }
}
