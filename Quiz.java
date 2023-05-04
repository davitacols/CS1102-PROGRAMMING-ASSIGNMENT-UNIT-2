public static void main(String[] args) {
    // First question
    MultipleChoiceQuestion q1 = new MultipleChoiceQuestion(
        "Which of the following is an example of a mammal?\n",
        "Elephant", "Sleep", "We", "Quickly", "From", "A"
    );
    check(q1);
    
    // Second question
    MultipleChoiceQuestion q2 = new MultipleChoiceQuestion(
        "What is the capital of France?\n",
        "Paris", "Berlin", "Madrid", "London", "Rome", "A"
    );
    check(q2);

    // Third question
    MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(
        "Which of the following is an example of a reptile?\n",
        "Octopus", "Starfish", "Dog", "Snake", "Lotus", "D"
    );
    check(q3);

    // Fourth question
    MultipleChoiceQuestion q4 = new MultipleChoiceQuestion(
        "What is the largest planet in our solar system?\n",
        "Mercury", "Venus", "Jupiter", "Saturn", "Mars", "C"
    );
    check(q4);

    // Fifth question
    MultipleChoiceQuestion q5 = new MultipleChoiceQuestion(
        "What is the smallest country in the world by land area?\n",
        "Monaco", "San Marino", "Liechtenstein", "Tuvalu", "Vatican City", "E"
    );
    check(q5);
    
    // Display score
    JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
}
