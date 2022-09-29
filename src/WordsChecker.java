import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WordsChecker {

    protected String text;
    Set<String> textCollection;


    public WordsChecker(String text) {
        textCollection = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));

    }


    public boolean hasWord(String word) {
        return textCollection.contains(word);
    }


}
