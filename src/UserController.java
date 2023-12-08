public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    // Methods for handling user interactions and updating the model

    public void updateUserProfile(String username, String password, String email) {
        model.setUsername(username);
        model.setPassword(password);
        model.setEmail(email);
        view.displayUserProfile(model);
    }
}