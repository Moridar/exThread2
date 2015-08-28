/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import static java.lang.Thread.sleep;

/**
 *
 * @author Bobbie
 */
public class Tester {
    public static void main(String[] args) {
        GetBytesFromUrl a = new GetBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        GetBytesFromUrl b = new GetBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        GetBytesFromUrl c = new GetBytesFromUrl("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
    
        a.start();
        b.start();
        c.start();
        while(a.isAlive() || b.isAlive() || c.isAlive()){
        }
        int sum = a.getSum() + b.getSum() + c.getSum();
        System.out.println("Exercise 1b - Sum: " + sum);
    }
}
