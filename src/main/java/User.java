import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private  Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<User> getUsersFromFile(String filepath) {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            reader.readLine();
            String userStr;
            while ((userStr = reader.readLine()) != null && !(userStr = reader.readLine()).isBlank()) {
                String[] userArr = userStr.split("\s");
                User user = new User(userArr[0], Integer.valueOf(userArr[1]));
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public String toString() {
        return "User{name = " + getName() + "; age = " + getAge() + "}";
    }
}
