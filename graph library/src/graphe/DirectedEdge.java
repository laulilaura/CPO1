package graphe;

/**
 * DirectedEdge class
 */
public class DirectedEdge extends Edge {

    private int source;

    /**
     * 
     * @param color la couleur de l'arrête
     * @param start le vertex du début de l'arrête
     * @param ends le vertex de fin de l'arrête
     * @param value la valeur de l'arrête
     * @param source la source de l'arrête
     */
    public DirectedEdge(Color color, Vertex start, Vertex ends, double value,int source){
        super(color,start,ends,value);
        this.source=source;
    }

    /**
     * 
     * @return renvoie la source de l'arrête
     */
    public Vertex getSource(){
        return this.ends[source];
    }
    
    public Vertex getSink(){
        return this.ends[source-1];
    }

    /**
     * 
     * @return la chaine de caractère "arrête dirigée"
     */
    public String ToString(){
        return "arrete dirigée";
    }
    
}