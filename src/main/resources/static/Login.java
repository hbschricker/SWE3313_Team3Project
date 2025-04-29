

public class Login {
    /**
     * @return
     * @Param emil
     * @prama password
     **/

    public boolean login(String email, String password)
    {
        if (email == null && password == null) {
            return false;
        }
        return email.equals("hello@gmail.com") && password.equals("Password34");

    }

    /**
     * New user account
     *
     * @param firstName
     * @param lastName
     * @param username
     * @param email
     * @param password
     * @return True if the account was created successfully, otherwise return false.
     **/
    public boolean  createAccount (String firstName, String lastName, String username, String email, String password )
    {
        if (firstName == null || lastName == null || username == null || email == null || password == null)
        {
            return  false;
        }
        return  true;
    }

    public static void main (String[] args)
    {
        Login loginApp = new Login();
        System.out.println("Login : " + loginApp.login("hello@gmail.com", "Password34"));
        System.out.println("Account: " + loginApp.createAccount("brook", "James", "Jbrook123", "hello@gmail.com", "Password34"));
    }
}
