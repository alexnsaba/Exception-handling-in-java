public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int age[] = {12, 30, 40, 50, 24}; // IndexOufBoundsException
            String message = null; //NullPointerException
            String allowance = "testing"; //NumberFormatException

            int length = message.length();
            int value = age[5];
            int convertedAllowance = Integer.parseInt(allowance);
            System.out.println("Value :" + value);
            System.out.println("Length :" + length);
            System.out.println("convertedAllowance :" + convertedAllowance);
        }
        catch (NullPointerException e){
            System.out.println("Exception "+e.getClass().getSimpleName() +" has occured");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception "+e.getClass().getSimpleName() +" has occured");
        }catch (NumberFormatException e){
            System.out.println("Exception "+e.getClass().getSimpleName() +" has occured");
        }
    }
}
