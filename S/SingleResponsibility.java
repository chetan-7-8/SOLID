package S;

class Book{
    private String name;
    private String author;
    private String text;

    public String replaceWordInText(String word){
        return text.replaceAll(word,text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}

class BookPrinter{
    void PrintTextToConsole(String text){
        System.out.println(text);
    }
}


public class SingleResponsibility {
    public static void main(String args[]){
         //According to single responsibility every class should perform single functionality
        //Implementation of multiple functionality violate the rule

    }
}
