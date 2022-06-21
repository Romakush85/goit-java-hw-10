import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
// TASK 1
        System.out.println("-------Task 1-------");
        try(BufferedReader br = new BufferedReader(new FileReader("./hw-10/src/main/java/resources/phones.txt"))) {
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
        List<User> users = User.getUsersFromFile("./hw-10/src/main/java/resources/users.txt");
        System.out.println(users);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("./hw-10/src/main/java/resources/user.json"), users);

//TASK 3 test
        System.out.println("-------Task 3-------");
        FreqCounter counter = new FreqCounter();
        counter.countFreq(new File("./hw-10/src/main/java/resources/words.txt"));
    }
    }
