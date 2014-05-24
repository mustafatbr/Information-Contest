package main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import databaseConnection.ConnectionDB;
import model.Player;

public class Login extends JFrame implements ActionListener {

    Container c = getContentPane();
    private JButton btnLogin,  btnCancel,btnreg;
    private JLabel lblUName,  lblPasswd;
    private JTextField txtUName;
    private JPasswordField txtPasswd;
    
    public Login() {
        super("Login ...");
        this.setSize(350, 200);
        this.setLayout(null);
        this.setResizable(false);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((d.width / 2) - 175, (d.height / 2) - 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        
        lblUName = new JLabel("Username");
        lblPasswd = new JLabel("Password");
        txtUName = new JTextField();
        txtPasswd = new JPasswordField();
        btnLogin = new JButton("Login", new ImageIcon(ClassLoader.getSystemResource("main/login.png")));
        btnCancel = new JButton("Cancel", new ImageIcon(ClassLoader.getSystemResource("main/cancel.png")));
        btnreg=new JButton("yeni kayýt");
        lblUName.setBounds(50, 40, 140, 25);
        txtUName.setBounds(150, 40, 130, 25);
        lblPasswd.setBounds(50, 80, 140, 25);
        txtPasswd.setBounds(150, 80, 130, 25);
        btnLogin.setBounds(37, 115, 100, 25);
        btnCancel.setBounds(200, 115, 100, 25);
        btnreg.setBounds(120, 145, 100, 25);
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        btnreg.addActionListener(this);
        this.add(lblUName);
        this.add(lblPasswd);
        this.add(txtUName);
        this.add(txtPasswd);
        this.add(btnLogin);
        this.add(btnCancel);
        this.add(btnreg);
        
    }//constructor closed
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            try {
            	ConnectionDB mgr = ConnectionDB.getInstance();
            	Connection con = (Connection) mgr.getConnection();
                try {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM USERS WHERE USERNAME='" + txtUName.getText() +
                            "' and PASSWORD='" + txtPasswd.getText() + "'");
                    System.out.println(rs);
                    if (rs.next()) {
                     System.out.println(txtUName.getText());
                          new mainDemo(txtUName.getText());
                          this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid username or password","Invalid",JOptionPane.ERROR_MESSAGE);
                    }
                    con.close();
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Invalid", JOptionPane.ERROR_MESSAGE);
                    txtUName.setText("");
                    txtPasswd.setText("");
                }//inner try catch closed
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "Unable to connect to the database", "Connection error", JOptionPane.ERROR_MESSAGE);
            }//outer try catch closed
        }//if closed
if(e.getSource() == btnreg){
	 new NewUserReg().setVisible(true);
 
}
        if (e.getSource() == btnCancel) {
            System.exit(0);
        }//if closed
    }//actionPerformed() closed
    public static void main(String args[])    {
        new Login().setVisible(true);
    }
}//class closed


