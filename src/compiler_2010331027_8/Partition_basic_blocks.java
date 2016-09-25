package compiler_2010331027_8;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tazbeea Tazakka
 */
public class Partition_basic_blocks {
    public void partition(ArrayList<String> file){
        WriteFile write=new WriteFile();
        ArrayList<Integer> leader= new ArrayList<>();
        leader.clear();
        leader.add(0);// first line is a leader
        for(int i=1;i<file.size();i++){
            if(file.get(i).contains("if")){
                //System.out.println("i="+i);
                String temp=file.get(i);
                String jump="";
                for(int j=temp.length()-1;j>=2;j--){
                
                    if(temp.charAt(j)=='o')
                        break;
                    else
                        jump=temp.charAt(j)+jump;
                }
               // System.out.println("jump="+jump);
                int jumpTo= Integer.parseInt(jump)-1;
                //System.out.println("jumpTo="+jumpTo);
                leader.add(jumpTo);
                if(i+1<file.size())
                    leader.add(i+1);
            }
        }
        Collections.sort(leader);

        leader.add(file.size());
        
        for(int i=0;i<leader.size()-1;i++){
            System.out.println("BLOCK "+(i+1)+" :");
            write.write_file("BLOCK "+(i+1)+" :");
            for(int j=leader.get(i);j<leader.get(i+1);j++){
                System.out.println("\t"+file.get(j));
                write.write_file("\t"+file.get(j));
            }
        }
        
    }
}
