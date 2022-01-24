package Task04;

public class Task4 {

    private int totalWordsLength = 0;
    private int totalWords = 0;

    public double averageWordLength(String input) {
        String[] words = input.split("[ ,.!?0-9]+");
        for (String word : words) {
            totalWordsLength += word.length();
        }
        totalWords += words.length;
        double avgLength = (double) totalWordsLength / totalWords;
        return Math.round(avgLength * 100.0) / 100.0;
    }

}
