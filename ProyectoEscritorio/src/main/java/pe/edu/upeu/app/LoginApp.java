package pe.edu.upeu.app;


import javax.swing.*;
import java.awt.event.*;
import org.jdal.swing.form.BoxFormBuilder;

public class LoginApp extends JDialog implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    JTextField usuarioTxt=new JTextField();
    JPasswordField claveTxt=new JPasswordField();
    JButton btnIngresar=new JButton("Ingresar");

    public LoginApp(){        
        this.add(construir());
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);        
    }

    public JComponent construir(){
        BoxFormBuilder fb = new BoxFormBuilder(BorderFactory.createTitledBorder(("Login")));
        fb.row();                       // start a new base component row
        fb.startBox();                  // add new simple box     
        fb.setFixedHeight(true);        // fix the height of this simple box
        fb.row();                       // add new row in the new simpleBox
        fb.add("Usuario: ", usuarioTxt);       // add the name text box (this call increment the cursor by two). 
        fb.row(); 
        fb.add("Clave: ", claveTxt);
        fb.endBox();
        
        fb.row(); 
        fb.startBox();
        fb.setFixedHeight(true);
        fb.row(); 
        fb.add(btnIngresar);
        fb.endBox(); 
        btnIngresar.addActionListener(this);
        return fb.getForm();    
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        System.out.println("Holasassss");
        if(e.getSource()==btnIngresar){
            if(usuarioTxt.getText().equals("davidmp") && claveTxt.getText().equals("123456")){
                new MainGUI2();
                this.dispose();            
            }
        }
        
    }


}