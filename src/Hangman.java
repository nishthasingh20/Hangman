import javax.swing.*;

public class Hangman extends JFrame {
    private final WordDB wordDB;

    //counting incorrect guesses:
    private int incorrectGuesses;

    //store challenge:
    private String[] wordChallenge;

    public Hangman() {
        super("Hangman Game (using JAVA)");
        setSize(CommonConstants.FRAME_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        //initialize variables:
        wordDB = new WordDB();
        wordChallenge = wordDB.loadChallenge();


        addGuiComponents();
    }

    private void addGuiComponents() {
        
    }
}