 import java.io.*;
  import java.util.Scanner;
/**
 * Write a description of class Palabra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palabra
{
    public String palabra;
    public String traducción;
    public String[] significado;
    
    public Palabra(String p, String trad, String[] sign){
        palabra = p;
        traducción = trad;
        significado = sign;
    }
    public void combinar(Palabra p){
        if(this.palabra == p.palabra){
            for(int i = 0; this.significado[i] != null; i++){
                for(int j = 0; p.significado != null; j++){
                    this.significado[i+1] = p.significado[j];
                }
            }
        }
    }
    public Palabra(Scanner f){
        palabra = f.next();
        traducción = f.next();        
        String next = f.next();
        String aux = "";
        int i = 0;
        while( next.compareTo("+") != 0 ){
            if(next.compareTo( "-") == 0){
                next = f.next();
                while(next != "-"){
                    aux += next;
                    next = f.next();           
                }
                significado[i] = aux;
                i++;
            }
        }
    }
}
