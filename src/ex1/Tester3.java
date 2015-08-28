/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Bobbie
 */
public class Tester3 {

    public static void main(String[] args) {
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());

        GetBytesFromUrl t1 = new GetBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        GetBytesFromUrl t2 = new GetBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        GetBytesFromUrl t3 = new GetBytesFromUrl("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");

        long start = System.nanoTime();
        t1.start();
        t2.start();
        t3.start();
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
        }
        long end = System.nanoTime();
        System.out.println("Time Sequental: " + (end - start));
    }
}
