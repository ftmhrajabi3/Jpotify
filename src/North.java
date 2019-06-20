import javax.swing.*;
import java.awt.*;

public class North extends JPanel {

    private JTextField search = new JTextField();

    public North() {
        JLabel label = new JLabel("Search : ");
       // JTextField jTextField=new JTextField(1);
        GridLayout ly = new GridLayout();
        label.setVisible(true);
//        setLayout(new FlowLayout(1));
        setLayout(ly);


        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        label.setVisible(true);
        this.add(label,gbc);

        gbc.gridx=1;
        gbc.gridheight=5;
        gbc.weightx=1;
        this.add(search , gbc );

    }
}