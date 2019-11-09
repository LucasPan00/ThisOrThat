/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUCAS
 */
public class ThisOrThat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Question.txt");
        ArrayList<String> a = new ArrayList<String>();
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            a.add(sc.nextLine());
        }
        System.out.println(a);
    }
    
}
