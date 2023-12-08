import java.util.HashMap;
import java.util.Map;

class Database {
    private static final Map<String, User> userDatabase = new HashMap<>();

    static void addUser(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    static User getUser(String username) {
        return userDatabase.get(username);
    }
}