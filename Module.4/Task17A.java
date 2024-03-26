// Abstract class representing the blueprint for all login pages
public abstract class AbstractLoginPage {
    // Username field
    public abstract void setUsername(String username);

    // Password field
    public abstract void setPassword(String password);

    // Forgot password field
    public abstract void forgotPassword();

    // Sign-in button
    public abstract void signIn();
}