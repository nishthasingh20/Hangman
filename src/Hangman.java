import javax.swing.*;

public class Hangman extends JFrame {

    //counting incorrect guesses:
    private int incorrectGuesses;

    //store challenge:
    private String[] wordChallenge;

    private final WordDB wordDB;

    //JLablel : a component for displaying non-interactive text or images
    private JLabel hangmanImage;

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
        //hangman image:
        hangmanImage = CustomTools.loadImage();
    }
}