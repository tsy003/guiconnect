import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Connect extends JFrame{
    Button btnHost, btnJoin;

    public Connect(){
        setTitle("Connect");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(640, 380));

        btnHost = new Button("Host");
        btnHost.addActionListener(this::buttonPress);
        btnJoin = new Button("Join");
        btnJoin.addActionListener(this::buttonPress);

        //GridLayout gridLayout = new GridLayout();

        panel.add(btnHost);
        panel.add(btnJoin);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);    // Centers window
        setVisible(true);
    }
    public void buttonPress(ActionEvent e) {
        if (e.getSource() == btnHost) {
            System.out.println("btnHost pressed");
        }
        else if (e.getSource() == btnJoin) {
            System.out.println("btnJoin pressed");
        }
    }

}

class Button extends JButton{
    public Button(String txt){
        super(txt);
        setPreferredSize(new Dimension(100, 30));
        setFont(new Font(getFont().getName(), Font.PLAIN, 16));
        setBackground(new Color(255, 255, 255));
        setBounds(100, 100, 100, 30);

        //addMouseListener(this::buttonHover);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(170, 170, 170));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(255, 255, 255));
            }
        });


    }

}
