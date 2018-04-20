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
public class Pila  {
    int tope = -1;
    private int[] pila = new int[10];
    final int MAX = 9;
    
    public boolean llena(){
        return(tope == MAX);
    }
    public void push(int elem)
    {
        if(this.llena()){
            
        }else{
            tope++;
            pila[tope]=elem;
        }
    }
    
    public boolean vacia(){
        return (tope ==-1);
    }
    
    public int pop(){
        if(this.vacia()) {
            return -1;
        }else{
            int x = pila[tope];
            tope--;
            return x;
        }
    }
}
