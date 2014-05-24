package gameview;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import databaseConnection.ConnectionDB;

public class NewUserReg extends JFrame implements ActionListener {

  
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblCPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtCPassword;
    private JButton btnSave;
    private ButtonGroup group;

    public NewUserReg() {
        super("User registration");
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocation(300, 175);
        this.setSize(350, 300);
    
        
        lblUsername = new JLabel("Kullanýcý Adý");
        lblPassword = new JLabel("Þifre");
        lblCPassword = new JLabel("Tekrar þifre");
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        txtCPassword = new JPasswordField();
        btnSave = new JButton("Save", new ImageIcon(ClassLoader.getSystemResource("gameview/save.png")));
        lblUsername.setBounds(30, 30, 100, 30);
        lblPassword.setBounds(30, 80, 150, 30);
        lblCPassword.setBounds(30, 130, 150, 30);
        txtUsername.setBounds(150, 30, 150, 25);
        txtPassword.setBounds(150, 80, 150, 25);
        txtCPassword.setBounds(150, 130, 150, 25);
       
        btnSave.setBounds(120, 210, 100, 25);
        
        add(lblUsername);
        add(lblPassword);
        add(lblCPassword);
        add(txtUsername);
        add(txtPassword);
        add(txtCPassword);
        add(btnSave);
        btnSave.addActionListener(this);
     
    }//constructor closed
    public void actionPerformed(ActionEvent e) {
        String Type;
        try {
        	ConnectionDB mgr = ConnectionDB.getInstance();
        	Connection con = (Connection) mgr.getConnection();
            Statement st = con.createStatement();
            try {
                if (e.getSource() == btnSave) {
                    String Username = txtUsername.getText();
                    String Password = txtPassword.getText();
                    String CPassword = txtCPassword.getText();
                    if(Username.equalsIgnoreCase("")){
                        JOptionPane.showMessageDialog(null, "kullanýcý adý boþ olamaz!!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(Password.equalsIgnoreCase("")){
                    	JOptionPane.showMessageDialog(null, "password boþ kalamaz!!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!CPassword.equals(Password)) {
                        JOptionPane.showMessageDialog(null, "Þifreler ayný deðil!!!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String str = "insert into USERS(Username,Password) values(?,?)";
                    PreparedStatement ps = con.prepareStatement(str);
                  
                    ps.setString(1, Username);
                    ps.setString(2, Password);
                
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Database successfully updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                    txtUsername.setText("");
                    txtPassword.setText("");
                    txtCPassword.setText("");
                    setVisible(false);
                }//if Closed
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "kullanýcý daha önce kullanýlmýþ!!", "Error", JOptionPane.ERROR_MESSAGE);
            }//inner try catch closed
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Database baðlantý hatasý!!", "Error", JOptionPane.ERROR_MESSAGE);
        }//outer try catch closed
    }//actionPerformed() closed
}//class closed

