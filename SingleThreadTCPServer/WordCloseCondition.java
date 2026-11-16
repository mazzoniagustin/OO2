public class WordCloseCondition implements CloseCondition{
    private String word;

    @Override
    public boolean shouldClose(String inputLine) {
        return word.equalsIgnoreCase(inputLine);
    }
}
