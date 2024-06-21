/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SuperClass {
    public double MonthlyFees;
    public double SpicealFees;
    public double yearlyfees;
    public double WeaklyFees;
    public double Dayfees;
    
     public double BookFees;
    public double LibraryFees;
    public double TuteFees;
    public double ParkingFees;
    public double usingsoprdsitemsfees;
    
    
    public double Fees;
    public double OtherFees;
    public double TotalodMD;
    
     public double AllTotalodMD;
     
     
      public double GetAmount()
      {
         Fees=MonthlyFees+SpicealFees+yearlyfees+WeaklyFees+Dayfees;
         OtherFees=BookFees+LibraryFees+TuteFees+ParkingFees+usingsoprdsitemsfees;
                 TotalodMD=Fees+OtherFees;
                 AllTotalodMD=TotalodMD;
       return AllTotalodMD;
      }
      
      private JFrame frame;
      
      public void iExitSystem(){
        frame = new JFrame("Exit");

         if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Student Management Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
         {
         System.exit(0);
         }
}
//=========================================================================Fees=========================================================================================
      
       public double pMonthlyFees=3.56;
    public double pSpicealFees=2.67;
    public double pyearlyfees=2.45;
    public double pWeaklyFees=7.98;
    public double pDayfees=2.34;
    
     public double pBookFees=1.23;
    public double pLibraryFees=1.34;
    public double pTuteFees=3.45;
    public double pParkingFees=4.98;
    public double pusingsoprdsitemsfees=7.31;
      
//========================================================================================================================================================================
    public double McTax=0.90;
    
    public Double CfindTax(double cAmount)
{
double FindTax=cAmount-(cAmount*McTax);
return FindTax;
}
//========================================================================================================================================================================
}
