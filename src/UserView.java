public class UserView {
    public void displayUserProfile(User user) {
        // Display user profile details
        System.out.println("User Profile:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }
}