/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsstore;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles {

    
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    
    public void printReport() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("------------------------------------------------------------------");
        System.out.println("CONSOLE DEVICE TYPE: " + getConsoleType());
        System.out.println("ELECTRONICS STORE:   " + getStore());
        System.out.println("TOTAL SALES:         " + getTotalSales());
        System.out.println("------------------------------------------------------------------");
    }
}
