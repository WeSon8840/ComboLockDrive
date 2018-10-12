/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

/**
 *
 * @author Gloria Song
 */
public class ComboLock {
    private int first;
    private int second;
    private int third;
    
    public ComboLock(int num1, int num2, int num3) {
        first = num1;
        second =  num2;
        third = num3;
    }
    
//    public ComboLock(){
//        first = (int)(Math.random() * 3) + 1;
//        second = (int)(Math.random() * 3) + 1;
//        third = (int)(Math.random() * 3) + 1;
//    }
//    
//    public boolean checkCombo(int num1, int num2, int num3){
//        if(num1 == first && num2 == second && num3 == third){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    
//    public String getCombo(){
//        return first + "," + second + "," + third ;
//    }
    
    /**
     * This method allow the user to set the first number of the lock.
     * pre:needs an first number
     * post:sets the first number
     */
    public int getfirst() {
        return first;
    }
    
    /**
     * This method allow the user to set the second number of the lock.
     * pre:needs an second number
     * post:sets the second number
     */
    public int getsecond() {
        return second;
    }
    
    /**
     * This method allow the user to set the third number of the lock.
     * pre:needs an third number
     * post:sets the third number
     */
    public int getthird() {
        return third;
    }
}
