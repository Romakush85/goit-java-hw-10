import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
// TASK 1
//        System.out.println("-------Task 1-------");
//        try(BufferedReader br = new BufferedReader(new FileReader("./hw-10/src/resources/phones.txt"))) {
//            String phone;
//            while((phone = br.readLine()) != null) {
//                if(phone.trim().matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$") ||
//                   phone.trim().matches("^\\([0-9]{3}\\)\s[0-9]{3}-[0-9]{4}$")){
//                    System.out.println(phone);
//                }
//                continue;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//TASK 2
        System.out.println("-------Task 2-------");

        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("./hw-10/src/resources/users.txt"))) {
            reader.readLine();
            String userStr;
            while ((userStr = reader.readLine()) != null) {
                String[] userArr = userStr.split("\s");
                System.out.println(userStr);
                System.out.println(userArr[0]);
                System.out.println(Arrays.toString(userArr));
                System.out.println(userArr.length);
                for (String s : userArr) {
                    System.out.println(s);

                }
                for(int i = 0; i < userArr.length; i++) {
                    System.out.println(userArr[i]);
                }
                System.out.println(userArr[userArr.length - 1]);
                System.out.println(userArr[1]);
//                User user = new User(userArr[0], Integer.valueOf(userArr[1]));
//                users.add(user);
            }
//            System.out.println(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

//TASK 3 test
//        System.out.println("-------Task 3-------");
//        FreqCounter counter = new FreqCounter();
//        counter.countFreq(new File("./hw-10/src/resources/words.txt"));
//    }
    }
}