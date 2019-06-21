import javax.swing.*;
import java.awt.*;

public class North extends JPanel {

    private JTextField search = new JTextField();

    public North() {
        JLabel label = new JLabel("Search : ");
        label.setVisible(true);

        FlowLayout fly = new FlowLayout(FlowLayout.LEFT);
        setLayout(fly);
        search.setColumns(20);

        this.add(label);
        this.add(search );
    }
}