/**
 *
 * @author JAHIDUL ISLAM
 */
public class Author {
    
    private String name ;
    private String email;
    private String gender;
    
    public Author (String name ,String email,String gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }
}
