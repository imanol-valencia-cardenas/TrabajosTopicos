import javax.swing.*;
import java.awt.*;

public class JFrameDatos extends JFrame
{
   PanelDatosA pdA = new PanelDatosA();
      public JFrameDatos()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(310, 210);
      setTitle("Datos Personales");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pdA);
      setVisible(true);
   }   
}