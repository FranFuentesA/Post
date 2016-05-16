import java.util.ArrayList;
/**
 * Write a description of class commentsPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentsPost extends Post
{
    
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class commentsPost
     */
    public CommentsPost(String author)   
    {
        super(author);
        comments = new ArrayList<>();
    }

     /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }
}
