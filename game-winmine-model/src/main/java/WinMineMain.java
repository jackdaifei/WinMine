import com.fly.game.model.WinMineFrame;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-8-29
 * Time: 下午9:11
 * To change this template use File | Settings | File Templates.
 */
public class WinMineMain {
    public static void main(String[] args) throws Exception{
        new WinMineFrame();

    }

    public static void t() throws Exception{
        String[] ar = new String[]{"卷一", "卷二", "卷三","卷四","卷五","卷六","卷七", "卷八"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\迅雷下载\\zx,xdT\\《诛仙》（校对版全本）作者：萧鼎.txt"), "gb2312"));
        String line = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Administrator\\桌面\\诛仙\\1.txt"));
        while (line != null) {
            System.out.println(line);
            for (String s : ar) {
                if (s.equals(line)) {
                    writer.close();
                    writer = new BufferedWriter(new FileWriter("C:\\Documents and Settings\\Administrator\\桌面\\诛仙\\诛仙(" + s + ").txt"));
                }
            }
            writer.write(line);
            writer.newLine();
            line = reader.readLine();
        }
        writer.close();
        reader.close();
    }
}
