package com.shkim.temp.panel;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
 
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class TransparentPanel extends JDialog {
    // public static void main(String[] args) throws IOException {
    public JFrame frame = new JFrame("Hello");
    public List<JLabel> jLabelList = new ArrayList<JLabel>();
    static KeyListener listener = new KeyListener() {
 
        public void keyPressed(KeyEvent e) {
            printEventInfo("Key Pressed", e);
 
        }
 
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
 
        }
 
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            printEventInfo("Key Typed", e);
 
        }
 
        private void printEventInfo(String str, KeyEvent e) {
            System.out.println(str);
            int code = e.getKeyCode();
            System.out.println("   Code: " + KeyEvent.getKeyText(code));
            System.out.println("   Char: " + e.getKeyChar());
        }
 
    };
 
    public void initial() {
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setType(javax.swing.JFrame.Type.UTILITY);
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);
        frame.setLocation(0, 0); // 1620 780
        frame.setSize(1920, 1080);
        frame.getContentPane().setLayout(new java.awt.BorderLayout(0, 0));
        frame.setBackground(new Color(0, 0, 0, 0));
    }
 
    public void drawImage(JFrame frame, String fileName, int x_coor, int y_coor, int x_size, int y_size) {
        ImageIcon myPicture0 = new ImageIcon(fileName);
        Image image0 = myPicture0.getImage();
        Image resizedImage0 = image0.getScaledInstance(x_size, y_size, Image.SCALE_DEFAULT);
        ImageIcon resizedMypic = new ImageIcon(resizedImage0);
        JLabel pitureLabel0 = new JLabel(resizedMypic);
        pitureLabel0.setBorder(BorderFactory.createEmptyBorder(y_coor, x_coor, 0, 0));
        frame.getContentPane().add(pitureLabel0, 0);
        frame.setVisible(true);
    }
 
    public void drawString(JFrame frame, String sentence, int size, int y_coord, int x_coord, float h, float s,
            float b) {
        JLabel key = new JLabel();
        key.setText(sentence);
        Font myFont = new Font("NanumBarunGothic", Font.BOLD, size);
        key.setFont(myFont);
        key.setForeground(Color.getHSBColor(h, s, b));
        key.setBorder(BorderFactory.createEmptyBorder(y_coord, x_coord, 0, 0));
        frame.getContentPane().add(key, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        TransparentPanel kk = new TransparentPanel();
        kk.initial();
        kk.frame.addKeyListener(listener);
        kk.drawString(kk.frame, "안녕하세엽", 20, 0, 800, 0, 0, 0);
        kk.drawImage(kk.frame, "res/niniz.gif", 500, 0, 200, 200);
    }
}


출처: https://banana-media-lab.tistory.com/entry/투명한-JPanel-만들기 [Banana Media Lab]

출처: https://banana-media-lab.tistory.com/entry/투명한-JPanel-만들기 [Banana Media Lab]

출처: https://banana-media-lab.tistory.com/entry/투명한-JPanel-만들기 [Banana Media Lab]
