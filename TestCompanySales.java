/*
 *Modify the following assignment that you have previously completed to apply Java GUI
 *features. Everything should be the same except that your main() program should
 *implement Java GUI to get input from the user to enter objects Services and Supplies into
 *ArrayList Account. 
 * Name :- Punit Patel 
 * Course: CPSC 24500
 */ 


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TestCompanySales extends JFrame {

   private static final long serialVersionUID = 1L;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private List<Account> list=new ArrayList<>();
   public static void main(String[] args) {
     
	   EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   TestCompanySales frame = new TestCompanySales();
                   frame.setVisible(true); 
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       });
   }

   
   //Create the frame.
   
   public TestCompanySales() {
       setTitle("Company Sales"); 
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100, 100, 307, 341);
      
       getContentPane().setLayout(null);
       
       setLocationRelativeTo(null);
      
       JLabel lblNewLabel = new JLabel("Account ID:");
       lblNewLabel.setBounds(41, 91, 109, 28);
       getContentPane().add(lblNewLabel);

       JLabel lblNumberOfItem = new JLabel("Number of Item:");
       lblNumberOfItem.setBounds(40, 131, 110, 28);
       getContentPane().add(lblNumberOfItem);

       JLabel lblPricePerItem = new JLabel("Price per Item:");
       lblPricePerItem.setBounds(41, 171, 109, 28);
       getContentPane().add(lblPricePerItem);
      
       textField = new JTextField();
       textField.setBounds(151, 95, 123, 20);
       getContentPane().add(textField);
       textField.setColumns(10);

       textField_1 = new JTextField();
       textField_1.setColumns(10);
       textField_1.setBounds(151, 135, 123, 20);
       getContentPane().add(textField_1);

       textField_2 = new JTextField();
       textField_2.setColumns(10);
       textField_2.setBounds(151, 175, 123, 20);
       getContentPane().add(textField_2);

       // create radio buttons
       
       JRadioButton rdbbtnSupply = new JRadioButton("Supply");
       rdbbtnSupply.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               lblNumberOfItem.setText("Number of items:");
               lblPricePerItem.setText("Price per items:");
           }
       });
       rdbbtnSupply.setForeground(Color.BLUE);
       rdbbtnSupply.setFont(new Font("Verdana", Font.BOLD, 14));
       rdbbtnSupply.setBounds(41, 39, 87, 23);
       getContentPane().add(rdbbtnSupply);
       rdbbtnSupply.setSelected(true);

       JRadioButton rdbtnService = new JRadioButton("Service");
       rdbtnService.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               lblNumberOfItem.setText("Number of hours:");
               lblPricePerItem.setText("Rate per hour:");
           }
       });
       rdbtnService.setForeground(Color.BLUE);
       rdbtnService.setFont(new Font("Verdana", Font.BOLD, 14));
       rdbtnService.setBounds(151, 39, 109, 23);
       getContentPane().add(rdbtnService);

       ButtonGroup bg=new ButtonGroup();
       bg.add(rdbbtnSupply);
       bg.add(rdbtnService);

       JButton btnCalculateSales = new JButton("Calculate Sales");
       btnCalculateSales.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               try {
                  
                   int accountNo=Integer.parseInt(textField.getText());
                   int noOfSales=Integer.parseInt(textField_1.getText());
                   double ratePerSale=Double.parseDouble(textField_2.getText());
                   
                   if(rdbbtnSupply.isSelected()) {
                    
                       Supplies supplies=new Supplies(accountNo, noOfSales, ratePerSale);
                       list.add(supplies); // add to list
                      
                       JOptionPane.showMessageDialog(null, supplies+"\n\nSupply added in list Successfully.!","Result",1);
                   }else {
                      
                       Services service=new Services(accountNo, noOfSales, ratePerSale);
                       list.add(service);
                       JOptionPane.showMessageDialog(null, service+"\n\nService added in list Successfully.!","Result",1);
                   }
               }catch(Exception e2) {
                   // if user enters any wrong input
                   JOptionPane.showMessageDialog(null, "Wrong input.Please try again...!!!","Error",0);
               }
               // clearing all text fields
               textField.setText("");
               textField_1.setText("");
               textField_2.setText("");
           }
       });
       btnCalculateSales.setBounds(10, 231, 126, 23);
       getContentPane().add(btnCalculateSales);

       // show all sales
       JButton btnShowAllSales = new JButton("Show All Sales");
       btnShowAllSales.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
               String allSales="";
               for (Account account : list) {
                   allSales+=account+"\n\n";
               }
               JOptionPane.showMessageDialog(null, "All Sales: \n\n"+allSales,"Result",1);
           }
       });
       btnShowAllSales.setBounds(151, 231, 123, 23);
       getContentPane().add(btnShowAllSales);

       JButton btnExit = new JButton("Exit");
       btnExit.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
       btnExit.setBounds(102, 268, 89, 23);
       getContentPane().add(btnExit);
   }
}




        
    
	

	


