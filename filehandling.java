import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
public class car {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int option;
        System.out.println("--------------Welcome to Car Records Database System-----------------");
        System.out.println("What task do you want to perform? ");
        System.out.println("1.Creation of a File: ");
        System.out.println("2.Reading a file: ");
        System.out.println("3.Writing to a file: ");
        System.out.println("4.Deleting a file: ");
        System.out.println("5.Nothing: ");
        System.out.println("Enter your choice");
        option = sc.nextInt();
        switch(option){
            case 1:
            createfile();
            break;
            case 2:
            readfile();
            break;
            case 3:
            writefile();
            break;
            case 4:
            deletefile();
            break;
            case 5:
            System.out.println("Have a nice day.GoodBye.");
            break;
            default:
            System.out.println("Option not available");
            break;
        
        }
        sc.close();
    }
    public static void createfile(){
        Scanner sc=new Scanner(System.in);
        String filename;
        System.out.println("Enter filename of the file you want to create: ");
        filename=sc.nextLine();
        File f1=new File(filename);
        try{
            if(f1.createNewFile()){
                System.out.println("File created: " +f1.getName());
            }
            else{
                System.out.println("File already exists ");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while creating the file ");
        }
        sc.close();
    }
    public static void readfile(){
        Scanner sc1=new Scanner(System.in);
        String filename;
        System.out.println("Enter the name of the file you want to read: ");
        filename=sc1.nextLine();
        File file=new File(filename);
        try{
            Scanner filereader=new Scanner(file);
            while(filereader.hasNextLine()){
                String data=filereader.nextLine();
                System.out.println(data);
            }
            filereader.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found ");
        }
        sc1.close();
    }
    public static void writefile(){
        Scanner sc2=new Scanner(System.in);
        String filename;
        System.out.println("Enter the name of file you want to write on: ");
        filename=sc2.nextLine();
        File file=new File(filename);
        try{
            FileWriter writer=new FileWriter(file,true);
            System.out.println("Enter the details of the Car: ");
            String data=sc2.nextLine();
            writer.write(data +"\n");
            writer.close();
            System.out.println("Details written to the file ");
        }catch(IOException e){
            System.out.println("An error occurred while wrting the data:");
        }
        sc2.close();
    }
    public static void deletefile(){
        Scanner sc3=new Scanner(System.in);
        String filename;
        System.out.println("Enter the  filename you want to delete: ");
        filename=sc3.nextLine();
        File file=new File(filename);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete file.");
        }
        sc3.close();
    }

}
