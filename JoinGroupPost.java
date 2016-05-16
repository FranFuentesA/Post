
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String group;
    /**
     * Constructor for objects of class MessagePost
     */
    public JoinGroupPost(String author, String group) {
        super(author); 
        this.group = group;
    }      
    
    public String getNomGroup(){        
        return group;   
    }  
}