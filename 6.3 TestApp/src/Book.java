/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAHIDUL ISLAM
 */
public class Book   {
    private String name;
    private Author author;
    private double price;
    private double stock;
    public Book (String name,Author author,double price,double stock)
    {
        this.name= name;
        this.author=author;
        this.price=price;
        this.stock=stock;        
    }

    
    public String getName()
    {
        return name;
    }
    public Author getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public double getStock()
    {
        return stock;
    }

    

    
}
