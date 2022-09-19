import java.util.HashSet;
import java.util.Set;


public class WordsChecker {

    protected String text;
    Set<String> textCollection;


    public String getText(String s) {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    public WordsChecker(String text) {
        this.text = text;
        Set<String> textCollection = new HashSet<>();
        textCollection.add(String.valueOf(text.split("\\P{IsAlphabetic}+")));
        this.textCollection = textCollection;


    }


    public boolean hasWord(String word) {
        if (textCollection.contains(word)) {
            return true;
        } else {
            return false;
        }
    }


}
