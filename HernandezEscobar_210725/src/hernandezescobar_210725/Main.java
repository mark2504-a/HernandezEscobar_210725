/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezescobar_210725;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("50 Grados Centigrados a Fahrenheit: "+celsius_a_fahrenheit()+" F");
        System.out.println("50 Grados centigrados a kelvin: " + celsius_a_kelvin() + " K");
        System.out.println("50 Grados centigrados a Rankine: " + celsius_a_rankine() + " R");
        System.out.println("30 Grados fahrenheit a celsius: " + fahrenheit_a_celsius() + " C");
        System.out.println("30 Grados fahrenheit a kelvin: " + fahrenheit_a_kelvin() + " K");
    }
    
    public static double celsius_a_fahrenheit(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5) + 32;
                }
    
    public static double celsius_a_kelvin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 491.67;
    }
    
    public static double fahrenheit_a_celsius(){
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit - 32) * 5) /9;
    }
    
    public static double fahrenheit_a_kelvin(){
        double grados_fahrenheit = 30.0;
        return (((grados_fahrenheit - 32) * 5)/9) + 273.15;
    }
}
