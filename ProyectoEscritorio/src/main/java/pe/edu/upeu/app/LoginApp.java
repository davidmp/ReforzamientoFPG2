package pe.edu.upeu.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;

    JPanel panel;
    JLabel usuarioLabel;
    JLabel claveLabel;
    JTextField usuarioTxt;
    JTextField claveTxt;
    JButton btnIngresar;

    public LoginApp(){
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(300, 150);
        panel = new JPanel();

        usuarioLabel=new JLabel("Usuario:");
        usuarioLabel.setBounds(10, 10, 80, 25);        
        usuarioTxt = new JTextField(20);
        usuarioTxt.setBounds(100, 10, 160, 25);

        claveLabel=new JLabel("Clave:");
        claveLabel.setBounds(10, 40, 80, 25);
        claveTxt = new JTextField(20);
        claveTxt.setBounds(100, 40, 160, 25);

		btnIngresar = new JButton("login");
		btnIngresar.setBounds(10, 80, 80, 25);        

        panel.add(usuarioLabel);
        panel.add(usuarioTxt);
        panel.add(claveLabel);
        panel.add(claveTxt);
        panel.add(btnIngresar);

        this.add(panel);
        this.setVisible(true);
    }


    //@Override
    public void actionPerformed(ActionEvent e) { 

    }


}