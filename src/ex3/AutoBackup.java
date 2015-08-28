/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.util.List;

/**
 *
 * @author Bobbie
 */
public class AutoBackup implements Runnable {

    private List<String> lines;

    public AutoBackup(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public void run() {
        while(true){
        try {
            FileWriter writer = new FileWriter("backup.txt", false);
            PrintWriter out = new PrintWriter(writer);
            for (String s: lines) {
                out.println(s);
            }
            out.close();
            sleep(15000);
        } catch (Exception e) {
        }
        
        }
        
    }

}
