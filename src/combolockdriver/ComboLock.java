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
    private final int first;
    private final int second;
    private final int third;
    
    public ComboLock(final int first, final int second, final int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public int getfirst() {
        return first;
    }
    
    public int getsecond() {
        return second;
    }
    
    public int getthird() {
        return third;
    }
}
