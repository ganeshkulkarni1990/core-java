import com.olx.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    private static User register() {
        Scanner ss = new Scanner(System.in);
        System.out.println("First Name:");
        String firstName = ss.next();
        System.out.println("Last Name :");
        String lastName = ss.next();
        System.out.println("Mobile No :");
        String mobileNo = ss.next();
        System.out.println("City: ");
        String city = ss.next();
        System.out.println("Username: ");
        String userName = ss.next();
        System.out.println("Password: ");
        String password = ss.next();
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        Address address = new Address();
        address.setCity(city);
        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
        user.setAddress(addressList);
        user.setUsername(userName);
        user.setPassword(password);
        user.setMobileNo(mobileNo);
        return user;
    }

    private static Login login() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Username:");
        String userName = ss.next();
        System.out.println("password:");
        String password = ss.next();
        Login login = new Login();
        login.setUsername(userName);
        login.setPassword(password);
        return login;
    }

    private static void printMenu() {
        System.out.println("1. Register User");
        System.out.println("2. Login User");
        System.out.println("3. Search by city");
        System.out.println("4. Search by location");
        System.out.println("5. Users Count");
        System.out.println("6. Posts Count");
    }

    public static void main(String[] args) {
        printMenu();
        Scanner s = new Scanner(System.in);
        Olx olx = Olx.getInstance();
        while (true) {
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    User user = register();
                    UserDetails userDetails = olx.registerUser(user);
                    if (userDetails == null) {
                        System.out.println("Error in registration.");
                    } else {
                        System.out.println(userDetails);
                    }
                    break;
                case 2:
                    Login login = login();
                    userDetails = olx.login(login);
                    if (userDetails == null) {
                        System.out.println("Wrong username or password");
                    } else {
                        System.out.println("Login Successful");
                    }
                    break;
                case 3:
                    //searchByCity();
                    break;
                case 4:
                    //searchByLocation();
                    break;
                case 5:
                    System.out.println("Current System has :" + olx.getUsersCount() +" Users.");
                    break;
                case 6:
                    System.out.println("Current system has " + olx.getPostsCount()+ " Posts.");
                    break;
                default:
                    System.out.println("Wrong choice please select main again");
                    printMenu();
            }
        }
    }
}