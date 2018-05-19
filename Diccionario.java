 import java.io.*;
 import java.util.Scanner;
 
/**
 * Write a description of class Diccionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diccionario extends NodePalabra
{
    public int numPalabros = 0;
    public static final char separadorDef = '-';
    public Palabra p = null;
    public Diccionario(){
        try{
            Scanner file = new Scanner(new File("diccionario.txt"));
            next = null;
            while(file.hasNext()){
                Palabra p = new Palabra(file);
                numPalabros++;
                next = new NodePalabra(p,next);
            }
        }catch(FileNotFoundException e){System.out.print("No se ha encontrado el archivo");}
    }
    public static void add(Palabra s){
        // Palabra aux = s;
        // Palabra and = null;
        // while(aux != null && aux.palabracompareTo(s.palabra) < 0){
            // ant = aux;
            // aux = aux.next;
        // }
        // if(aux.palabra == s.palabra){
            
        // }
    }
    public static void delete(String s){
    
    }
    // public static String showAll(){return "PENE";}
    // public static NodeString search(String s){return;}
    // public static NodeString searchString(String s){return;}
    // public static boolean contains(String s){return;}
    // public static boolean isEmpty(){return;}
    // public static int tamañoDiccionario(){return;}
    // public static void editarPalabra(NodeString s, String p){return;}
}
