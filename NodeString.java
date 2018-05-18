
/**
 * Write a description of class NodeString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodeString
{
    public String s;
    public NodeString next;
    public String traducción;
    public NodeString(String a){
        this.s = a;
        this.next = null;
    }
    public NodeString(String a,NodeString n){
        this.s = a;
        this.next = n;
    }
}
