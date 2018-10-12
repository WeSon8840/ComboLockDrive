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
               final int first = Integer.parseInt(JOptionPane.showInputDialog("Please set your first digit;"));
        final int second = Integer.parseInt(JOptionPane.showInputDialog("Please set your second digit;"));
        final int third = Integer.parseInt(JOptionPane.showInputDialog("Please set your third digit;"));
        
        final ComboLock lock = new ComboLock(first, second, third);
        
        JOptionPane.showMessageDialog(null, "Please open the lock!");
        while (true) {
            final int a1 = Integer.parseInt(JOptionPane.showInputDialog("What is your first digit?"));
            final int a2 = Integer.parseInt(JOptionPane.showInputDialog("What is your second digit?"));
            final int a3 = Integer.parseInt(JOptionPane.showInputDialog("What is your third digit?"));
            if (a1 == lock.getfirst() && a2 == lock.getsecond() && a3 == lock.getthird()) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            }
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
        
        int[] b = new int[3];
        for(int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random()*3+1);
            }
        final ComboLock random = new ComboLock(b[0],b[1],b[2]);
        JOptionPane.showMessageDialog(null,"Guess the next digit locks combo (1~3), you have 3 trys. ");
        for (int i = 0; i < 3; i++) {
            final int a1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first digit?"));
            final int a2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second digit?"));
            final int a3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third digit?"));
            // verify the match
            if (a1 == random.getfirst() && a2 == random.getsecond() && a3 == random.getthird()) {
                // notify they guessed right
                JOptionPane.showMessageDialog(null, "Correct!");
                return;// exit
            }
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
        JOptionPane.showMessageDialog(null, "3 incorrect guesses! The combo was " + random.getfirst() + " - "
                        + random.getsecond() + " - " + random.getthird());
        
    }
    
}
