/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author Bobbie
 */
public class GetBytesFromUrl extends Thread{
    private String url;
    private int sum = 0;
    
    public GetBytesFromUrl(String url){
        this.url = url;
    }
    
    protected byte[] getBytesFromUrl(String url) {
        ByteArrayOutputStream bis = new ByteArrayOutputStream();
        try {
            InputStream is = new URL(url).openStream();
            byte[] bytebuff = new byte[4096];
            int read;
            while ((read = is.read(bytebuff)) > 0) {
                bis.write(bytebuff, 0, read);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return bis.toByteArray();
    }
 
    @Override
    public void run() {
        sum = 0;
        for(byte b : getBytesFromUrl(url)){
            sum+=b;
        }
    }
    public int getSum(){
        return sum;
    }
    
    public static void main(String[] args) {
        GetBytesFromUrl a = new GetBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        a.start();
        try {
            sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(a.getSum());
        
    }
}
