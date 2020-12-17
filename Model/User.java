package Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private int accessLevel;
    private double limitation;

    private ArrayList<Double> limitations = new ArrayList<>();

    private ArrayList<User> users = new ArrayList<>();

    private ArrayList<User> familyMembers = new ArrayList<>();

    User() {

    }

    User(String login, String password, int accessLevel) {
        this.login = login;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public void setLimitations(double amount) {

    }

    public ArrayList<Double> getLimitations() {
        return limitations;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkAccessLevel(){
        return true;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void createLimitation() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,260);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelFamily = new JLabel("   Family members");
        labelFamily.setSize(100,50);

        String [] family = {""};

        JComboBox comboBox = new JComboBox(family);

        JButton button = new JButton("Delete");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {

        });

        JLabel labelAmount = new JLabel("         Amount");
        labelAmount.setSize(100,50);
        JTextField textFieldAmount = new JTextField();
        textFieldAmount.setMaximumSize(new Dimension(370,50));

        JLabel label1 = new JLabel(" ");
        label1.setSize(100,50);

        JLabel label2 = new JLabel(" ");
        label2.setSize(100,50);

        JButton buttonBack = new JButton("Back");
        buttonBack.setMaximumSize(new Dimension(100,50));
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
        });

        jPanel.add(labelFamily);
        jPanel.add(comboBox);
        jPanel.add(labelAmount);
        jPanel.add(textFieldAmount);
        jPanel.add(label1);
        jPanel.add(button);
        jPanel.add(label2);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }

    public void addFamilyMember() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,260);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelLogin = new JLabel(" Login");
        labelLogin.setSize(100,50);
        JTextField textFieldLogin = new JTextField();
        textFieldLogin.setMaximumSize(new Dimension(370,50));

        JLabel labelPassword = new JLabel(" Password");
        labelPassword.setSize(100,50);
        JTextField textFieldPassword = new JTextField();
        textFieldPassword.setMaximumSize(new Dimension(370,50));
        
        JLabel labelAccessLevel = new JLabel(" Access level (1 - head / 0 - not head");
        labelAccessLevel.setSize(100,50);
        JTextField textFieldAccessLevel = new JTextField();
        textFieldAccessLevel.setMaximumSize(new Dimension(370,50));

        JButton button = new JButton("Add");
        button.setMaximumSize(new Dimension(100,50));
        button.addActionListener(actionEvent ->
        {

        });

        JLabel label = new JLabel(" ");
        label.setSize(100,50);

        JButton buttonBack = new JButton("Back");
        buttonBack.setMaximumSize(new Dimension(100,50));
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
        });

        jPanel.add(labelLogin);
        jPanel.add(textFieldLogin);
        jPanel.add(labelPassword);
        jPanel.add(textFieldPassword);
        jPanel.add(labelAccessLevel);
        jPanel.add(textFieldAccessLevel);
        jPanel.add(button);
        jPanel.add(label);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }

    public void deleteFamilyMember() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,260);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelFamily = new JLabel("          Family");
        labelFamily.setSize(100,50);

        String [] family = {""};

        JComboBox comboBox = new JComboBox(family);

        JButton button = new JButton("Delete");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {

        });

        JLabel label1 = new JLabel(" ");
        label1.setSize(100,50);

        JLabel label2 = new JLabel(" ");
        label2.setSize(100,50);

        JButton buttonBack = new JButton("Back");
        buttonBack.setMaximumSize(new Dimension(100,50));
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
        });

        jPanel.add(labelFamily);
        jPanel.add(comboBox);
        jPanel.add(label1);
        jPanel.add(button);
        jPanel.add(label2);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
