/*
 * Using the available Java GUI features create a program to input the number of each type of coin
 *a user has in their possession and then compute and display the total dollar and cents value of
 *these coins. Your solution must accommodate Quarter, Dime, Nickel, and Penny coins. Include
 *Half-dollar and Dollar coins as well.
 * Name :- Punit Patel 
 * Course: CPSC 24500
 */ 



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class CCalculator extends JFrame {

   private JPanel contentPane;
   private JTextField txtQuarter;
   private JTextField txtDime;
   private JTextField txtNickel;
   private JTextField txtPenny;
   private JTextField txtHalfDollar;
   private JTextField txtDollar;
   private JTextField textOut;

   double Nickel = 5;
   double Quarter = 25;
   double Dime = 10;
   double Penny = 1;
   double HalfDollar = 50;
   double Dollar = 100;
   private final Action action = new SwingAction();

   
   public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   CCalculator frame = new CCalculator();
                   frame.setVisible(true);
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       });
   }

   public CCalculator() {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100, 100, 427, 477);
       contentPane = new JPanel();
       contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
       setContentPane(contentPane);
       contentPane.setLayout(null);

       JLabel lblCurrencyCalculator = new JLabel("CURRENCY CALCULATOR");
       lblCurrencyCalculator.setBounds(128, 38, 264, 14);
       contentPane.add(lblCurrencyCalculator);

       JLabel lblQuarter = new JLabel("Quarter");
       lblQuarter.setBounds(48, 81, 46, 14);
       contentPane.add(lblQuarter);

       JLabel lblDime = new JLabel("Dime");
       lblDime.setBounds(48, 121, 46, 14);
       contentPane.add(lblDime);

       JLabel lblNickel = new JLabel("Nickel");
       lblNickel.setBounds(48, 163, 46, 14);
       contentPane.add(lblNickel);

       JLabel lblPenny = new JLabel("Penny");
       lblPenny.setBounds(48, 207, 46, 14);
       contentPane.add(lblPenny);

       JLabel lblHalfdollar = new JLabel("Half-dollar");
       lblHalfdollar.setBounds(48, 250, 71, 14);
       contentPane.add(lblHalfdollar);

       JLabel lblDollar = new JLabel("Dollar ");
       lblDollar.setBounds(48, 296, 46, 14);
       contentPane.add(lblDollar);

       txtQuarter = new JTextField();
       txtQuarter.setBounds(140, 78, 216, 20);
       contentPane.add(txtQuarter);
       txtQuarter.setColumns(10);

       txtDime = new JTextField();
       txtDime.setBounds(140, 118, 216, 20);
       contentPane.add(txtDime);
       txtDime.setColumns(10);

       txtNickel = new JTextField();
       txtNickel.setBounds(138, 160, 218, 20);
       contentPane.add(txtNickel);
       txtNickel.setColumns(10);

       txtPenny = new JTextField();
       txtPenny.setBounds(140, 204, 216, 20);
       contentPane.add(txtPenny);
       txtPenny.setColumns(10);

       txtHalfDollar = new JTextField();
       txtHalfDollar.setBounds(140, 247, 216, 20);
       contentPane.add(txtHalfDollar);
       txtHalfDollar.setColumns(10);

       txtDollar = new JTextField();
       txtDollar.setBounds(140, 293, 216, 20);
       contentPane.add(txtDollar);
       txtDollar.setColumns(10);

       JButton btnCalculate = new JButton("CALCULATE");
       btnCalculate.setAction(action);
       btnCalculate.setBounds(112, 337, 169, 38);
       contentPane.add(btnCalculate);

       textOut = new JTextField();
       textOut.setBounds(35, 386, 337, 41);
       contentPane.add(textOut);
       textOut.setColumns(10);
   }

   private class SwingAction extends AbstractAction {
       public SwingAction() {
           putValue(NAME, "CALCULATE");
           putValue(SHORT_DESCRIPTION, "Some short description");
       }

       public void actionPerformed(ActionEvent e) {

           try {
               if (Integer.parseInt(txtQuarter.getText().trim()) < 0 || Integer.parseInt(txtDime.getText().trim()) < 0
                       || Integer.parseInt(txtNickel.getText().trim()) < 0
                       || Integer.parseInt(txtPenny.getText().trim()) < 0
                       || Integer.parseInt(txtHalfDollar.getText().trim()) < 0
                       || Integer.parseInt(txtDollar.getText().trim()) < 0) {
                   JOptionPane.showMessageDialog(null, "You can not enter negative value");
               } else {
                   int totalQuater = (int) (Quarter * Integer.parseInt(txtQuarter.getText().trim()));
                   int totalDime = (int) (Dime * Integer.parseInt(txtDime.getText().trim()));
                   int totalNickel = (int) (Nickel * Integer.parseInt(txtNickel.getText().trim()));
                   int totalPenny = (int) (Penny * Integer.parseInt(txtPenny.getText().trim()));
                   int totalHalfDollar = (int) (HalfDollar * Integer.parseInt(txtHalfDollar.getText().trim()));
                   int totalDollar = (int) (Dollar * Integer.parseInt(txtDollar.getText().trim()));

                   int total = totalQuater + totalDime + totalNickel + totalPenny + totalHalfDollar + totalDollar;

                   int finalDollars = total / 100;
                   int cents = total % 100;
                  
                   String output = "You have toally " + finalDollars + "$ and " + cents +" cents.";
                   textOut.setText(output);

               }
           } catch (NumberFormatException e1) {
               JOptionPane.showMessageDialog(null, "You can not enter anything other than numbers");
           }
       }
   }
}

