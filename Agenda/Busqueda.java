import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Busqueda extends JPanel implements ActionListener{
  private JButton btnBuscar, btnCancelar;
  private JTextField txtCel;
  
  public Busqueda()
  {
    setLayout(new GridLayout(3,2));
    JLabel lblCel = new JLabel("Celular", JLabel.RIGHT);
    txtCel = new JTextField(10);
    add(lblCel);
    add(txtCel);;
    
    btnBuscar = new JButton ("Buscar");
    btnBuscar.addActionListener(this);
    btnCancelar = new JButton ("Cancelar");
    btnCancelar.addActionListener(this);
    
    add(btnBuscar);
    add(btnCancelar);
  }
  
  public void actionPerformed(ActionEvent e)
  {
     String celular = txtCel.getText();
     int v;
     
     if(e.getSource() == btnBuscar)
     {
       if(celular.isEmpty())
       {
         celular=JOptionPane.showInputDialog(null, "Ingrese el numero de celular a buscar"
            ,JOptionPane.QUESTION_MESSAGE);
          JOptionPane.showMessageDialog(null, "Buscando");
          txtCel.requestFocus();
        }
        else{
           for (int i = 0; i < ; i++) {
            if(){
               JFrameMenu menu = new JFrameMenu();
               v = 0;
               break;
            }
            else
               v++;
           } 
          if(v > 0){
            JOptionPane.showMessageDialog(null, "Numero de celular Incorrecto", 
            "Warning", JOptionPane.WARNING_MESSAGE);
            txtCel.setText(null);
            txtCel.requestFocus();
           }
        }//else
     }//if botón Aceptar
    
   if(e.getSource()==btnCancelar){
      System.exit(0);
    }
  }//ActionPerformed
}