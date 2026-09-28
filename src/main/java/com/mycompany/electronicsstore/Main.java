/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsstore;
import java.util.Scanner;
/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input details
        System.out.print("Enter the console device type (e.g., PS5, XBOX, SWITCH): ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter the electronics store name: ");
        String store = scanner.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales object
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);

        // Print the report
        System.out.println();
        report.printReport();

        scanner.close();
    }
}
