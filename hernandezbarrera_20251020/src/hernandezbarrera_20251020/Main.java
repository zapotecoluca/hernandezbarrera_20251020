/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera_20251020;

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
        
        Pila miPila = new Pila(5);
        
        System.out.println("¿La pila está vacía?   "+miPila.estaVacia()); //DEVUELVE TRUE O FALSE
        System.out.println(); //SALTO DE LINEA
        
        
        System.out.println("AGREGANDO VALORES CON METODO PUSH");
        miPila.push(10); //INSERTA EL VALOR ENTERO 10
        miPila.push(20); //INSERTA EL VALOR ENTERO 20
        miPila.push(30); //INSERTA EL VALOR ENTERO 30
        miPila.push(40); //INSERTA EL VALOR ENTERO 40
        miPila.push(50); //INSERTA EL VALOR ENTERO 50
        
        System.out.println(); //SALTO DE LINEA
        
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+miPila.tamano()+" elementos");
        System.out.println(); //SALTO DE LINEA
        
        System.out.println("AGREGANDO ELEMENTO CON PILA LLENA");
        miPila.push(60);
        System.out.println(); //SALTO DE LINEA
        
        System.out.println("VERIFICACION DE ULTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println(); //SALTO DE LINEA
        
        System.out.println("EXTRAER VALORES DE LA PILA");
        System.out.println("Se ha extraido el valor de: "+miPila.pop());
        System.out.println("Se ha extraido el valor de: "+miPila.pop());
        
        System.out.println("MOSTRANDO VALORES DE LA PILA");
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+miPila.tamano()+" elementos");
        System.out.println(); //SALTO DE LINEA
        
        while(!miPila.estaVacia()) {
            System.out.println("Se ha extraido el valor de: "+miPila.pop());
        }
        System.out.println(); //SALTO DE LINEA
        
        miPila.pop();
        System.out.println(); //SALTO DE LINEA
        
        System.out.println("VERIFICACION DE ULTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println(); //SALTO DE LINEA
        
        
    }
    
}
