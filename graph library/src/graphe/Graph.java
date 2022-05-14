package graphe;

/**
 * Graph class
 */
public interface Graph{

    /**
     * 
     * @return le nombre de sommets du graph
     */
    public int nbOfVertices();

    /**
     * 
     * @return le nombre d'arretes du graph
     */
    public int nbOfEdges();
     
   /**
    *  Ajoute le sommet passe en parametre au graph
    * @param vertex sommet à ajouter au graph
    */
    public void addVertex(Vertex vertex);


    /**
     *  Ajoute une arrete entre 2 sommets 
     * @param vertex1 Le premier sommet a connecter
     * @param vertex2 Le second sommet a connecter
     * @param EdgeKind Le type d'arrete de l'enum EdgeKind
     */
    public void addEdge(Vertex vertex1,Vertex vertex2,EdgeKind EdgeKind);

    /**
     * 
     * @param vertex Le premier sommet
     * @param vertex2 Le second sommet 
     * @return True si les 2 sommets en parametre sont connectes 
     */
    public boolean isConnected(Vertex vertex,Vertex vertex2);

    /**
     * 
     * @return True si tout les sommets sont connectes 
     */
    public boolean isConnected();

    /**
     * Retourne le ou les arrete(s) connectant les 2 sommets
     * @param vertex1 Le premier sommet
     * @param vertex2 Le second sommet 
     * @return
     */
    public Edge[] getEdges(Vertex vertex1, Vertex vertex2);

   /**
    * 
    * @return toutes les arretes du graph
    */
    public Edge[] getEdges();

    /**
     * 
     * @return tous les sommets du graph
     */
    public Vertex [] getVertices();

    /**
     * 
     * @param vertex Le sommet dont on veut les arretes connectes
     * @return Les arretes connectees a un sommet
     */
    public Edge[] getNeighborEdges(Vertex vertex);

    /**
     * 
     * @return La version String d'un graph
     */
    public String toString();

}