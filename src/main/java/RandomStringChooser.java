import java.util.*;

public class RandomStringChooser {
    /* to be implemented in part (a) */
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  
    private ArrayList<String> availableStrings; //declaration

    public RandomStringChooser(String[] wordArray) {
        availableStrings = new ArrayList<>();//initalization
        for (int i = 0; i < wordArray.length; i++) {
            availableStrings.add(wordArray[i]);
        }
    }

    public String getNext() {
        if (availableStrings.size() == 0) {
            return "NONE";
        }
        int randomIndex = (int)(Math.random() * availableStrings.size());
        return availableStrings(randomIndex);
            availableStrings.remove(randomIndex);
    }
}
