package Client;

import Models.Session;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

//1571020257 - Nguyễn Ngọc Đan Trường CNTT15-04
public class RunClient {

    //1571020257 - Nguyễn Ngọc Đan Trường CNTT15-04
    public static void main(String[] args) {
        //1571020257 - Nguyễn Ngọc Đan Trường CNTT15-04
        //1571020257 - Nguyễn Ngọc Đan Trường CNTT15-04
        UIManager.LookAndFeelInfo[] lafInfo = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(lafInfo[3].getClassName());
        } catch (Exception e) {
        }
        String name = JOptionPane.showInputDialog("Nhập tên của bạn để tham gia ");
        if(name == null || name.equals("")){
            return;
        }
        Session.gI().personName = name;
        new FrmDashboard(name).setVisible(true);
    }
    
}
