// TASK 3
import java.io.*;
import java.util.HashMap;

public class FreqCounter {
    public void countFreq(File file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String string = "";
            String line;
            while((line = br.readLine())!= null) {
                string += line + " ";
            }
            String[] words = string.split(" ");

            HashMap<String, Integer> wordsMap = new HashMap<>();
            for (String word : words) {
                if(!word.isEmpty()) {
                    Integer count = wordsMap.get(word);
                    if (count == null) {
                        count = 0;
                    }
                    wordsMap.put(word, ++count);
                }
            }
            for(String word : wordsMap.keySet()) {
                System.out.println(word + " " + wordsMap.get(word));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
