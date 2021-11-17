public class ThrowDemo {
    public static String checkWhetherUserIsAllowedToEnter(int age, boolean vaccinated) {
        String result = "";
        if (age < 18 || vaccinated == false) {
            throw new RuntimeException("Not allowed. You can only enter if you're above 18 yrs and Vaccinated");
        } else {
            result = "You can now enter ";
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            int age = 19;
            System.out.println(checkWhetherUserIsAllowedToEnter(age, true));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
