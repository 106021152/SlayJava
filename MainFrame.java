import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private Container cp;
    private ImageIcon icon1 = new ImageIcon("pencilMan.png");
    private JLabel pencilManImg = new JLabel();
    private JButton jbtnRun = new JButton("Run");
    private JButton jbtnExit = new JButton("Exit");
    private JLabel jlbName = new JLabel("爬塔");
    private JPanel jpnc = new JPanel();
    private JPanel jpns = new JPanel(new GridLayout(1,2,1,1));
    private JPanel jpnn = new JPanel();
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(400,600,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp =this.getContentPane();
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jpns,BorderLayout.SOUTH);
        cp.add(jpnn,BorderLayout.NORTH);
        jpns.add(jbtnRun);
        jpns.add(jbtnExit);
        jpnc.add(pencilManImg);
        jpnn.add(jlbName);
        Image img1 = icon1.getImage();
        Image newImg =img1.getScaledInstance(50,60, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImg);
        pencilManImg.setIcon(icon1);
        jbtnRun.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Battle1 bt1 = new Battle1();
                bt1.setVisible(true);
                MainFrame.this.setVisible(false);
            }
        });
        jbtnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
