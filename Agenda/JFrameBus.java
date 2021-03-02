import javax.swing.*;
import java.awt.*;

public class JFrameBus extends JFrame{
  Busqueda bus = new Busqueda();
  
  public JFrameBus(){   
    initComponents();
  }
   
   private void initComponents(){
      setSize(310, 210);
      setTitle("Usuario y contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(bus);
      setVisible(true);
       
   }   
}