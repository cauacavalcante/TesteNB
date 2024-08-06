
package appareatriangulo;

import entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author caua.acavalcante
 */
public class AppAreaTriangulo {

    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    Triangulo x, y;
    x = new Triangulo ();
    y = new Triangulo ();
    System.out.println("Base triângulo X");
    x.base = ler.nextDouble();
    System.out.println("Altura triângulo X");
    x.altura = ler.nextDouble();
    System.out.println("Base triângulo Y");
    y.base = ler.nextDouble();
    System.out.println("Altura triângulo Y");
    y.altura - ler.nextDouble();
    double areaX = x.areaTriangulo();
    double areaY = y.areaTriangulo();

    
    ler.close();
    }
    
}
