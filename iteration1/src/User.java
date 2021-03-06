public class User {
    
    // The variables userName, userID, userType.
    private String userName;
    private int userID;
    private String userType;
    
    // No arg constructor.
    public User() {
        
    }

    // User object is defined with arguments.
    public User(String userName, int userID, String userType) {
        this.userName = userName;
        this.userID = userID;
        this.userType = userType;
    }
    
    // Getter and setter methods for User class.
    public String getUserName() {
        return this.userName;
    }

    public String getUserType() {
        return this.userType;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

   
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
