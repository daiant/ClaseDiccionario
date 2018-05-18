
/**
 * Write a description of class NodePalabra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodePalabra
{
    public NodePalabra next;
    public Palabra data;
    public NodePalabra(){
        next = null;
        data = null;
    }
    public NodePalabra(Palabra d){
        data = d;
        next = null;
    }
    public NodePalabra(Palabra d, NodePalabra n){
        data = d;
        next = n;
    }
    
}
