/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas_colas;

/**
 *
 * @author Andre
 */
public class Cola {
    private int capacidad = 10;
    int cola[] = new int[capacidad];
    int tamano = 0;
    int top = -1;
    int rear = 0;
    
    public void push(int numero){
        if(top<capacidad -1){
            top++;
            cola[top]= numero;
            System.out.println("Numero "+ numero + " es ingresado a la cola!");
            
        }
        else{
            System.out.println("Cola sobrecargada");
        }
    }
    
    public int pop(){
        if(top>=0){
            int numero = cola[0];
            System.out.println("Obtener "+numero);
            ordenar();
            top--;
            return numero;
        }
        else{
            return -1;
        }
    }

    private void ordenar() {
        if(top>0){
            for(int i= 0; i<top; i++)
            {
                if(i<top){
                    cola[i]= cola[i+1];
                }
                if(i==top)
                    cola[i]=-1;
            }
        }
    }
}
