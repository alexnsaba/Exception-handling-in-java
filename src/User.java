public class User {
    public String username;
    public String password;

    public static String validateUser(String u, String p){
        if(u.equalsIgnoreCase("demo") && p.equalsIgnoreCase("pass")){
            return "Welcome,you are Logged in as "+u;
        }else{
            throw new UserNotFoundException("User "+ u +" does not exist.");
        }
    }
    public static void main(String[] args) {
       try {
            System.out.println(validateUser("demo1","pass"));
        }catch (UserNotFoundException e){
            System.out.println("Exception "+e.getClass().getSimpleName()+ " has occured");
        }
    }
}
