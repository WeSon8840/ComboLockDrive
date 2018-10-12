/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;
import javax.swing.JOptionPane;

/**
 *
 * @author Gloria Song
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Creat combination lock");
        int first = Integer.parseInt(JOptionPane.showInputDialog("Please set your first digit;"));
        int second = Integer.parseInt(JOptionPane.showInputDialog("Please set your second digit;"));
        int third = Integer.parseInt(JOptionPane.showInputDialog("Please set your third digit;"));
        
        ComboLock lock = new ComboLock(first, second, third);
        
        JOptionPane.showMessageDialog(null, "Please open the lock!");
        while (true) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("What is your first digit?"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("What is your second digit?"));
            int num3 = Integer.parseInt(JOptionPane.showInputDialog("What is your third digit?"));
            if (num1 == lock.getfirst() && num2 == lock.getsecond() && num3 == lock.getthird()) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            }
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
        
        int[] Combo = new int[3];
        for(int i = 0; i < Combo.length; i++) {
            Combo[i] = (int)(Math.random()*3+1);
            }
        ComboLock random = new ComboLock(Combo[0],Combo[1],Combo[2]);
        JOptionPane.showMessageDialog(null,"Guess the next digit locks combo (1~3), you have 3 trys. ");
        for (int i = 0; i < 3; i++) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first digit?"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second digit?"));
            int num3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third digit?"));
            // verify the match
            if (num1 == random.getfirst() && num2 == random.getsecond() && num3 == random.getthird()) {
                // notify they guessed right
                JOptionPane.showMessageDialog(null, "Correct!");
                return;// exit
            }
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
        JOptionPane.showMessageDialog(null, "3 incorrect guesses! \n The combo was " + random.getfirst() + " - "
                        + random.getsecond() + " - " + random.getthird());
    }
    
}
