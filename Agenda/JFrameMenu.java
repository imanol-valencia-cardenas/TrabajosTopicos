import javax.swing.*;
import java.awt.*;

public class JFrameMenu extends JFrame{
   Menu men = new Menu();
   
   public JFrameMenu(){
      initComponents();
   }
   
   private void initComponents(){
      setSize(310, 210);
      setTitle("Datos Personales");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(men);
      setVisible(true);
   }   
}