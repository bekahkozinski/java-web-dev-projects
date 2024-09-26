package questions;

public class CheckBox extends Question {
    public CheckBox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }
    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "CHOOSE ONE OR MORE:" + newLine + getQuestion() + newLine + getFormattedChoices();
    }
    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
