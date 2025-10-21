/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandezbarrera_20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    //METODO CONSTRUCTOR DE CLASE PILA
    //AL INSTANCIAR NUEVA VARIABLE DE TIPO PILA, ENTONCES
    //SE CREARÁ UN OBJETO CON LOS ATRIBUTOS QUE ESTÁN
    //DENTRO DE ESE CONSTRUCTOR
    public Pila(int tamano) {
        
        this.capacidad = tamano; //CANTIDAD DE ELEMENTOS QUE HABRÁ EN LA PILA
        this.elementos = new int[this.capacidad]; //CREAR NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1; //VALOR POR DEFECTO DE LA CIMA (VACÍA)
        
    }
    
    //METODO PARA VERIFICAR SI LA PILA ESTÁ VACÍA
    public boolean estaVacia() {
        
        if(this.cima == -1) {
            //VALOR DE PILA -1, ESTÁ VACÍA
            return true;
        } else {
            // VALOR DE CIMA DISTINTO A -1
            //POR TANTO, NO ESTÁ VACÍA
            return false;
        }
    }
    
    public boolean estaLlena() {
        
        if(this.cima == (this.capacidad -1)) {
            
            //VALOR DE LA CIMA ES IGUAL A CANTIDAD DE ELEMENTOS
            return true;
        } else {
            //EL VALOR DE LA CIMA ES DIFERENTE A LA CANTIDAD DE ELEMENTOS
            return false;
        }
    }
    
    //DEVUELVE EL VALOR DE LA CIMA, ES DECIR
    //EL ÚLTIMO ELEMENTO INSERTADO AL ARREGLO
    public int tamano() {
        return this.cima + 1;
        
    }
    
    //METODO PARA AGREGAR ELEMENTOS AL ARREGLO, ES DECIR, A LA PILA
    //PRIMERO SE VERIFICA EL TAMAÑO DE LA PILA
    //UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO
    public void push(int elemento) {
        
        //VERIFICA SI LA PILA ESTÁ LLENA
        if(estaLlena()) {
            System.out.println("La pila esta llena, no se puede agregar el valor: "+ elemento);
            //return;
        } else {
            this.cima++; //SE INCREMENTA EL VALOR DE LA CIMA
            this.elementos[this.cima] = elemento;//AGREGA EL NUEVO ELEMENTO A LA PILA
            System.out.println("El valor: "+elemento+" fue agregado a la pila");
        }
    }
    
    //METODO PARA EXTRAER UN ELEMENTO DE LA PILA (ÚLTIMO INSERTADO AL ARREGLO)
    public int pop() {
        
        //SE VERIFICA QUE LA FILA NO ESTÉ VACÍA PARA PODER EXTRAER UN ELEMENTO
        if(estaVacia()){
            //SI ESTÁ VACÍA SE NOTIFICA AL USUARIO
            System.out.println("La pila está vacia, no puede hacer la extracción del elemento");
            //NO SE REALIZA NINGUNA ACCIÓN
            return -1;
        } else {
            //SI HAY ELEMENTOS QUE EXTRAER , SE CREA UNA NUEVA VARIABLE
            //QUE ALMACENARÁ EL VALOR EXTRAÍDO
            int elementoExtraido = this.elementos[this.cima]; //LA NUEVA VARIABLE POSEE EL VALOR DEL ÚLTIMO ELEMENTO INSERTADO AL ARREGLO
            this.cima--; //SE REDUCE EL VALOR DE LA CIMA, DEBIDO A QUE YA SE EXTRAJO UN ELEMENTO
            return elementoExtraido; //SE DEVUELVE AL USUARIO EL VALOR EXTRAÍDO
        }
    }
    
    //metodo para verificar el ultimo valor insertado
    //ES DECIR, VER EL ULTIMO VALOR QUE SE PUEDE EXTRAER DE LA PILA
    public int peek() {
        
        //VERIFICA SI ESTÁ VACÍA
        if(estaVacia()) {
            //SI ESTÁ VACÍA ALERTA AL USUARIO
            System.out.println("La pila está vacía");
            //NO REALIZA NINGUNA ACCIÓN
            return -1;
        } else {
            
            //DEVUELVE AL USUARIO EL ULTIMO VALOR INSERTADO
            //PRÓXIMO A SER EXTRAÍDO
            return this.elementos[this.cima];
        }
    }
    
    //METODO PARA IMPRIMIR LOS VALORES DE UNA PILA
    //SIGUE LIFO, IMPRIMIENDO DESDE EL ULTIMO HASTA EL PRIMERO INSERTADO
    public void mostrar() {
        
        //VERIFICA SI ESTÁ VACÍA
        if(estaVacia()) {
            //NO HACE NADA SI ESTÁ VACÍA
            System.out.println("La pila está vacía");
            
        } else {
            //IMPRIME SALIDA AL USUARIO
             System.out.print("Contenido de la pila (desde la cima, hasta la base de la pila)");
             //INICIA UNA ESTRUCTURA CON CORCHETE "["
              System.out.print("[");
              
              //DEBE RECORRERSE EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
              //EN LA ESTRUCTURA ITERATIVA SE INICIA DESDE EL VALOR DE LA CIMA, ES DECIR,
              //DESDE EL ÚLTIMO VALOR AGREGADO AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA MAYOR QUE CERO
              //(ES DECIR QUE AUN NO HA LLEGADO A LA BASE DE LA PILA *NO CONFUNDIR CON EL -1 DEL INICIO 
              // QUE ES EL VALOR DE LA CIMA*)
              //EL VALOR "i" ESTARÁ EN DECREMENTO HASTA LLEGAR A CERO
              for(int i = this.cima; i >= 0; i--) {
                  
                  //IMPRIME CADA VALOR EN SU POSICION CORRESPONDIENTE
                   System.out.print(this.elementos[i]);
                   if (i>0) {
                        System.out.print(",");
                   } 
              }
              
               System.out.print("]");
        }
    }
}
