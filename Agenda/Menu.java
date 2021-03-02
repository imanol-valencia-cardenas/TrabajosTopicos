import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel implements ActionListener{
  private JButton btnMostrar, btnAlta, btnBus;
  JFrameDatos jfd;
  JFrameMostrar jfm;
  public Menu(){
    setLayout(new GridLayout(7,4));
    btnAlta = new JButton("Alta");
    btnAlta.addActionListener(this);
    
    add(btnAlta);
    
    btnBus = new JButton("Buscar");
    btnBus.addActionListener(this);
    
    add(btnBus);
    
    btnMostrar = new JButton("Mostrar");
    btnMostrar.addActionListener(this);
    
    add(btnMostrar);
  }
  
  public void actionPerformed(ActionEvent e) {
  if (e.getSource()==btnAlta) {
      jfd = new JFrameDatos();
	}
   if (e.getSource()==btnMostrar) {
      jfm = new JFrameMostrar();
	}
  } 
}