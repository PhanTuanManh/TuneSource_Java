class AuthenticationService {
    static boolean authenticate(String username, String password) {
        User user = Database.getUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
