package bankaccountsimulation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BankAccountSimulation {

    public BankAccountSimulation(){
        
    }
    
    public void writeTo(Person person, FileWriter writer){
        
        try {
            writer.write(person.getAccountNo()+" ");
            writer.write(person.getName()+" ");
            writer.write(person.getAddress()+" ");
            writer.write(person.getBalance()+"\r\n");
        } catch (IOException e) {
            System.out.println("File can't be read."+person.getName());
        }
        finally {
            try {
                writer.flush();
            } catch (IOException e) {
                System.out.println("File can't be flushed.");
            }
        }
    }
    
    public int readFrom(FileReader reader){
        
        int n=0;
        Scanner x = new Scanner(reader);
        while(x.hasNext()) {
            n=x.nextInt();
            System.out.println(String.format("Account No : %d\nName : %s\nAddess : %s\nBalance : %.2f\n",n,x.next(),x.next(),x.nextDouble()));
        }
        try {
            reader.close();
        } catch (IOException ex) {
            System.out.println("File can't be closed.");
        }
        return n;
    }
    
    public static void main(String[] args) {
        
        FileWriter writer = null;
        try{
            writer = new FileWriter("Account doc.txt",true);
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File can't be read.");
        }
        FileReader reader = null;
        try {
            reader = new FileReader("Account doc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        int no=0;
        BankAccountSimulation b = new BankAccountSimulation();
        no=b.readFrom(reader);
        Person person = new Person(++no,"abir","abcd",1000.00);
        b.writeTo(person, writer);
        b.writeTo(new Person(++no,"kamal","abcd",2000.00), writer);
        b.writeTo(new Person(++no,"Fahim","abcd",3000.00), writer);
        
        //System.out.println("\b");
        //Runtime.getRuntime().exec("cls");
        //Runtime.getRuntime().exec("clear");
        //System.out.flush();
        //System.out.println("\f");
        //System.console();
        
        
        try {
            b.readFrom(new FileReader("Account doc.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        
    }
    
}
