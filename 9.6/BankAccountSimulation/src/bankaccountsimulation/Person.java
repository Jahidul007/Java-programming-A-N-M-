package bankaccountsimulation;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {
    private String name,address;
    private int account_no;
    private double balance;
    
    public Person(){}
    public Person(int account_no, String name, String address, double balance){
        this.account_no = account_no;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    
    public void setAccountNo(int account_no){
        this.account_no = account_no;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String password){
        this.address = password;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public int getAccountNo(){
        return account_no;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getBalance(){
        return balance;
    }
    
    @Override
    public String toString(){
        return String.format("Account No : %d\nName : %s\nAddess : %s\nBalance : %.2f\n", account_no,name, address, balance);
    }
    
}
