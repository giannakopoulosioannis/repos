package bookexercise;


public class Author {
    
    private String authorName;
    private String authorEmail;
    private String authorGender;
    
    public void setAuthorName(String authorName){
        this.authorName=authorName;
        }
    
    public String getAuthorName (){
        return authorName;
    }
    
    public void setAuthorEmail(String authorEmail){
        this.authorEmail=authorEmail;
    }
    
    public String getAuthorEmail(){
        return authorEmail;
    }
    
    public void setAuthorGender(String authorGender){
        this.authorGender=authorGender;
    }
    
    public String getAuthorGender(){
        return authorGender;    
    }
    
    @Override
    public String toString() {
        return "Author{" + "name= " + authorName + ", email= " + authorEmail + ", Gender= " + authorGender + '}';  
    }
}
