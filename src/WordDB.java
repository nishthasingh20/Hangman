import java.util.*;
import java.io.*;

public class WordDB {
    //key: category, value: words
    private HashMap<String, String[]> wordList;

    //pick a random category
    private ArrayList<String> categories;

    public WordDB() {
        try{
            wordList = new HashMap<>();
            categories = new ArrayList<>();

            //file path:
            String filePath = getClass().getClassLoader().getResource(CommonConstants.DATA_PATH).getPath();
            if(filePath.contains("%20")) {
                filePath = filePath.replaceAll("%20", " ");
            }
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            //iterating through each line in data.txt:
            String line;
            while((line = reader.readLine()) != null) {
                //splitting data by ,:
                String[] parts = line.split(",");

                String category = parts[0];
                categories.add(category);

                //rest of the values: are words
                String values[] = Arrays.copyOfRange(parts, 1, parts.length);
                wordList.put(category, values);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public String[] loadChallenge() {
        Random rand = new Random();

        //generating random number to choose category:
        String category = categories.get(rand.nextInt(categories.size()));

        //generating random number to choose value from the category:
        String[] categoryValues = wordList.get(category);
        String word = categoryValues[rand.nextInt(categoryValues.length)];

        //[0] -> category and [1] -> word
        return new String[]{
            category.toUpperCase(), word.toUpperCase()
        };

    }
}
