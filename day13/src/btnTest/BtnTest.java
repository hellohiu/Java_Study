package btnTest;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BtnTest extends JFrame {

    public BtnTest(){
        setTitle("타이틀 입니다.");
        setSize(350, 500);

        setLocationRelativeTo(null);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("닫기");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new BtnTest();
    }
}
