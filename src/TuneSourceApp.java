
// Main class for testing the implementation
public class TuneSourceApp {
    public static void main(String[] args) {
        // Creating a user and adding to the database
        User user = new User("john_doe", "password123", "john.doe@example.com");
        Database.addUser(user);

        // Authenticating the user
        boolean isAuthenticated = AuthenticationService.authenticate("john_doe", "password123");
        System.out.println("User Authentication: " + isAuthenticated);

        // Creating user view and controller
        UserView userView = new UserView();
        UserController userController = new UserController(user, userView);

        // Updating user profile
        userController.updateUserProfile("john_doe_updated", "newpassword", "john.doe.updated@example.com");

        // Creating an artist and adding to the database
        Artist artist = new Artist("artist123", "artistpass", "artist@example.com");
        Database.addUser(artist);

        // Authenticating the artist
        isAuthenticated = AuthenticationService.authenticate("artist123", "artistpass");
        System.out.println("Artist Authentication: " + isAuthenticated);

        // Creating artist view and controller
        UserView artistView = new UserView();
        ArtistController artistController = new ArtistController(artist, artistView);

        // Updating artist profile
        artistController.updateUserProfile("artist123_updated", "newartistpass", "artist.updated@example.com");
    }
}
