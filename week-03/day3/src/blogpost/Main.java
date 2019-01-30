package blogpost;

public class Main {
    public static void main(String[] args) {

        BlogPost blogPost1 = new BlogPost();

        blogPost1.authorName = "John Doe";
        blogPost1.publicationDate = "2018.02.11.";
        blogPost1.title = "This is a title";
        blogPost1.text = "Once upon a time";


        blogPost1.showBlog();



    }
}
