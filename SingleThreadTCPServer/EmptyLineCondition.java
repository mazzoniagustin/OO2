public class EmptyLineCondition implements CloseCondition{

    @Override
    public boolean shouldClose(String inputLine) {
        return "".equalsIgnoreCase(inputLine);
    }
}
