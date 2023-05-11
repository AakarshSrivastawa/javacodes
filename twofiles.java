import java.io.*;
import java.util.Scanner;
public class lab {
    public static void main (String args []){
        File file1 = new File("Hello.txt");
        File file2 = new File("Ashu.txt");
        

        try{
            Scanner sc = new Scanner(file1);
            FileWriter file3 = new FileWriter("Final.txt");
            while(sc.hasNextLine()){
                file3.append(sc.nextLine());
            }
            Scanner sc2 = new Scanner(file2);
            while(sc2.hasNextLine()){
                file3.append(sc2.nextLine());
            }
            sc.close();
            sc2.close();
            file3.close();
        }
        catch(Exception e){

        }
        
       

    }
}