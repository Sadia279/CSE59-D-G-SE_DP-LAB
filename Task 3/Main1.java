public class Main {
    public static void main(String[] args) {
      User user = new User("John", "john@example.com");

      UserRepository repository = new UserRepository();
      repository.save(user);
    }
}

class User {
  private String username;
  private String email;
  public User(String user ,String email){
    this.username = username;
    this.email = email;
  }

  public String getUsername(){
    return username;
  }
   public String getemail(){
    return email;
  }

}

class EmailValidator {
  public static boolean isValid(String email){
    if (email != null && email.contains("@")){
      return true;
    }

    System.out.println("Invalid email format.");
    return false;
  }
}

class UserRepository{
  public void save(User user){
    
      System.out.println("Connecting to database...");
      System.out.println("saving user " + user.getUsername()  + " to the users table.");

    
  }
}
