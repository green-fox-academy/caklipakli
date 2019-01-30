package blogpost;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public void showBlog(){

        System.out.println(" '" + title + "' by " + authorName + " posted  at " + publicationDate);
        System.out.println(text);
    }
}
