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
    public static final int MAX_DEF = 10; 
    public String[] significado = new String[MAX_DEF];
    
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
        try{
        if(f != null){
        palabra = f.next();
        traducción = f.next();        
        String next = f.next();
        int i = 0;
        while( next.compareTo("+") != 0 ){
            if(next.compareTo( "-") == 0){
                String aux = "";
                next = f.next();
                if(next.compareTo("+") != 0){
                while(next.compareTo( "-") != 0){
                    aux += next + " ";
                    next = f.next();           
                }
                significado[i] = aux;
                i++;
            }
            }
        }
    }
        else throw new FileNotFoundException();
    }catch(FileNotFoundException e){System.out.println("Fichero no encontrado");}
        
    }
}
