import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
// TASK 1
        System.out.println("-------Task 1-------");
        try(BufferedReader br = new BufferedReader(new FileReader("../hw-10/src/resources/phones.txt"))) {
            String phone;
            while((phone = br.readLine()) != null) {
                if(phone.trim().matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$") ||
                   phone.trim().matches("^\\([0-9]{3}\\)\s[0-9]{3}-[0-9]{4}$")){
                    System.out.println(phone);
                }
                continue;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//TASK 2
        System.out.println("-------Task 2-------");
//TASK 3 test
        System.out.println("-------Task 3-------");
        FreqCounter counter = new FreqCounter();
        counter.countFreq(new File("../hw-10/src/resources/words.txt"));

    }
}
