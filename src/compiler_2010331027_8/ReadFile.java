/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiler_2010331027_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tazbeea Tazakka
 */
public class ReadFile {
    public void read(){
        String line=new String();
        ArrayList<String> wholefile=new ArrayList<String>();
        try {
              //  BufferedReader br = new BufferedReader(new FileReader("/home/ratul/NetBeansProjects/WordCountOushneek/src/wordcountoushneek/word.txt"));
                BufferedReader br = new BufferedReader(new FileReader("task8.txt"));

                wholefile.clear();
                while((line=br.readLine())!=null){
                    wholefile.add(line);
                }
//                for(int i=0;i<wholefile.size();i++){
//                    System.out.println(wholefile.get(i));
//                }
            
            }
        catch(IOException Ex){
            System.out.println("Exception");
        }
        
        Partition_basic_blocks file = new Partition_basic_blocks();
        file.partition(wholefile);
    }
}
