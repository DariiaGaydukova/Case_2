import java.util.HashSet;
import java.util.Set;


public class WordsChecker {

    protected String text;
    Set<String> textCollection = new HashSet<>();


    public WordsChecker(String text) {
        this.text = text;
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words) {
            textCollection.add(word);
        }

    }


    public boolean hasWord(String word) {
        return textCollection.contains(word);
    }


}
