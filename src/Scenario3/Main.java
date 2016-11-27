package Scenario3;

import java.util.Scanner;

/**
 * Created by Eigenaar on 27-11-2016.
 */
public class Main {
    public static void main(String[] args) {

        GetPictureData image = new PictureProxy("proxyPicture.jpg");

        image.display();
        System.out.println("\nSet Grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = new Integer(scanner.next());
        image.setPictureGrade(grade);
    }
}
