import javax.swing.*;
import java.awt.*;

public class WestPanel extends JScrollPane {
    private JPanel mainPanel=new JPanel();

    public WestPanel(){
        mainPanel.setSize(100 , 800);
        GridBagLayout ly=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        mainPanel.setLayout(ly);
        gbc.fill = GridBagConstraints.VERTICAL;


        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton Home = new JButton("Home");
        Home.setSize(new Dimension(50 , 100));
        mainPanel.add(Home , gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton addMusic = new JButton("addMusic");
        addMusic.setSize(new Dimension(50 , 100));
        mainPanel.add(addMusic , gbc);

        JButton jButton=new JButton("Library");

//        jButton.enable(false);

        gbc.gridx=0;
        gbc.gridy=2;
        jButton.setSize(new Dimension(50 , 100));
        mainPanel.add(jButton,gbc);

        JButton Albums=new JButton("Alubms");
        gbc.gridx=0;
        gbc.gridy=3;
        Albums.setSize(new Dimension(50 , 100));
        mainPanel.add(Albums,gbc);


        JButton Songs=new JButton("Songs");
        gbc.gridx=0;
        gbc.gridy=4;
        Songs.setSize(new Dimension(50 , 100));
        mainPanel.add(Songs,gbc);


        JButton PlayList=new JButton("PlayList");
        gbc.gridx=0;
        gbc.gridy=5;
        PlayList.setSize(new Dimension(50 , 100));
        mainPanel.add(PlayList,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 0;       //reset to default
        gbc.weighty = 2;   //request any extra vertical space
        gbc.anchor = GridBagConstraints.PAGE_END; //bottom of space
        gbc.insets = new Insets(10,0,0,0);  //top padding
        gbc.gridx = 0;       //aligned with button 2
        gbc.gridwidth = 2;   //2 columns wide
        gbc.gridy = 6;
        JButton newPlayList = new JButton("newPlayList" );
        newPlayList.setSize(new Dimension(50 , 100));
        mainPanel.add(newPlayList , gbc);


        setViewportView(mainPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);



    }
}