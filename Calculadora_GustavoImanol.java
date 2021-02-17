import java.awt.Color;
import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora_GustavoImanol extends JFrame implements ActionListener {
    
   private JButton botonsuma,botonresta,botonmulti,botondiv,botonlimpiar,botonsalir;
   private JTextField valor1,valor2,camporesultado;
   JLabel label1,label2, label3;
  
   public void Controles(){
      Container contenedor = getContentPane();
      contenedor.setLayout( new GridLayout(10,10,10,2));
      contenedor.setBackground(Color.gray);
      label1 = new JLabel("N1");
      contenedor.add(label1);
      valor1 = new JTextField(10);
      contenedor.add(valor1);
      valor1.setBackground(Color.lightGray);
      label2 = new JLabel("N2");
      contenedor.add(label2);
      valor2 = new JTextField(10);
      contenedor.add(valor2);
      valor2.setBackground(Color.lightGray);
      label3 = new JLabel("Resultado");
      contenedor.add(label3);
      camporesultado = new JTextField(10);
      contenedor.add(camporesultado);
      camporesultado.setBackground(Color.lightGray);
      botonsuma = new JButton("+");
      contenedor.add(botonsuma);
      botonsuma.addActionListener(this);
      botonsuma.setBackground(Color.cyan);
      botonresta = new JButton("-");
      contenedor.add(botonresta);
      botonresta.addActionListener(this);
      botonresta.setBackground(Color.cyan);
      botonmulti = new JButton("x");
      contenedor.add(botonmulti);
      botonmulti.addActionListener(this);
      botonmulti.setBackground(Color.cyan);
      botondiv = new JButton("/");
      botondiv.addActionListener(this);
      contenedor.add(botondiv);
      botondiv.setBackground(Color.cyan);
      botonlimpiar = new JButton("C");
      contenedor.add(botonlimpiar);
      botonlimpiar.addActionListener(this);
      botonlimpiar.setBackground(Color.red);
      botonsalir=new JButton("Salir");
      contenedor.add(botonsalir);
      botonsalir.addActionListener(this);
   }
  
   public Calculadora_GustavoImanol(){
      super("Calculadora");
      Controles();
      setSize(250,450);
      setLocationRelativeTo(null);
      setVisible(true);
   }
  
   public void actionPerformed(ActionEvent e) {
     double  num1,num2,resul;
     String resultado;
        if (e.getSource()==botonsuma) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.WARNING_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resul=num1+num2;
          resultado=String.valueOf(resul);
          camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==botonresta) {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resul=num1-num2;
          resultado=String.valueOf(resul);
          camporesultado.setText(resultado);
         }          
        } 
        if (e.getSource()==botonmulti) {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resul=num1*num2;
          resultado=String.valueOf(resul);
          camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==botondiv) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están Incompletos",
          "Error",JOptionPane.ERROR_MESSAGE);
         }
         
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          try{
           resul=num1/num2;
           resultado=String.valueOf(resul);
           camporesultado.setText(resultado);
          }
          catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "División entre cero NO PERMITIDA!",
            "Error",JOptionPane.ERROR_MESSAGE);
          }
           
         }  
        }
          
        
        if (e.getSource()==botonlimpiar){
         valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
       } 
        if(e.getSource()==botonsalir)
        {
         System.exit(0);   
        }
    }
     
    public static void main(String[] args) {
      JFrame.setDefaultLookAndFeelDecorated(true);
      Calculadora_GustavoImanol calc = new Calculadora_GustavoImanol();
      calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}