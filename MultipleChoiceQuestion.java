public class MultipleChoiceQuestion {
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;

    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n" +
                   "A. " + a + "\n" +
                   "B. " + b + "\n" +
                   "C. " + c + "\n" +
                   "D. " + d + "\n" +
                   "E. " + e + "\n";
        correctAnswer = answer.toUpperCase();
    }

    static String ask(String question) {
        String answer;
        do {
            answer = JOptionPane.showInputDialog(question).toUpperCase();
            if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        } while (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E"));
        return answer;
    }

    void check() {
        nQuestions++;
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }
}
