package classesExample;


public class PostIt {
    // backgroundColor
    //text on it
    //textColor
    String backgroundColor;
    String text;
    String textColor;

    public PostIt () {

    }

    public PostIt(String backgroundColor, String text, String textColor) {
            this.backgroundColor = backgroundColor;
            this.text = text;
            this.textColor = textColor;

    }

    public void proceeding (){
        System.out.println(text);
        System.out.println("The above text should be " + textColor + " and a background should be " + backgroundColor);
    }
}

