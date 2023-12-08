// Controller: AdminController class extending UserController for admin-specific functionalities
public class AdminController extends UserController {
    public AdminController(Admin model, UserView view) {
        super(model, view);
    }

    // Additional methods for handling admin-specific interactions
}
