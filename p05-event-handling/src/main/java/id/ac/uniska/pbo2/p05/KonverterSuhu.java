/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package id.ac.uniska.pbo2.p05;

/**
 *
 * @author asus
 */
public class KonverterSuhu {

    public static double keFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double keKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double keReamur(double celsius) {
        return celsius * 4.0 / 5.0;
    }
}