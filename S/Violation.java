package S;

class Book2{
    private String name;
    private String author;
    private String text;

    public String replaceWordInText(String word){
        return text.replaceAll(word,text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    void PrintTextToConsole(String text){
        System.out.println(text);
    }
}



public class Violation {
    //class Book1 is violating the rule of single responsibility as it is trying to implement
    // two responsibilities.
}
