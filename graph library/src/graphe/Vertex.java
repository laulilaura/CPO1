package graphe;
import java.util.Random;
// import java.util.UUID;

/**
 * Vertex class
 */
public class Vertex{
    
    private int id;
    private Object info;
    private Color color;
    
    static  int genererIdVertex(int borneInf, int borneSup){
        Random random = new Random();
        return borneInf+random.nextInt(borneSup-borneInf);
    }

    /**
     * 
     * @param info l'object information qui sera stocké dans le sommet
     * @param color la couleur du sommet
     */
    public Vertex(Object info, Color color){
        this.id=genererIdVertex(1, 100000);
        this.info=info;
        this.color=color;
    }

    /**
     * 
     * @return renvoie l'info du sommet
     */
    public Object getInfo(){
        return this.info;
    }

    /**
     * 
     * @return renvoie la couleur du sommet
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * 
     * @return renvoie l'id du sommet
     */
    public int getId(){
        return this.id;
    }

    /**
     * 
     * @return la chaine de caractère "sommet"
     */
    public String toString(){
        return "sommet "+this.info;
    }
}