import java.io.IOException;

public class ThrowsDemo {
    public static String connectToDevice(String deviceName) throws IOException {
        return deviceName + " Device connected";
    }

    public static void main(String[] args) {
        try {
            System.out.println(connectToDevice("ATM"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
