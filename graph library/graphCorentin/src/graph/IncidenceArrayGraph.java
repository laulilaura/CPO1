import graphCClement;

public class IncidenceArrayGraph implements Graph {
    private Vertex[] vertexArray;
    private Edge[] edgeArray;
    private static int nbVertex = 0;
    private static int nbEdge = 0;
    private int maxVertex;
    private Edge[][] incidenceArray;
    
    /**
     * Constructeur IncidenceArrayGraph
     * @param maxVertex le nombre maximum de vertex
     */
    public IncidenceArrayGraph(int maxVert) {
        this.maxVertex = maxVert;
        this.vertexArray = new Vertex[maxVert];
        this.edgeArray = new Edge[maxVert * maxVert];
        this.incidenceArray = new Edge[maxVert][maxVert * maxVert];
    }

    /**
     * 
     * @return le nombre de sommets du graph
     */
    public int nbOfVertices(){
        return nbVertex;
    }

    /**
     * 
     * @return le nombre d'arretes du graph
     */
    public int nbOfEdges(){
        return nbEdge;
    }
     
   /**
    *  Ajoute le sommet passe en parametre au graph
    * @param vertex sommet à ajouter au graph
    */
    public void addVertex(Vertex vertex){
        if(nbVertex < this.maxVertex){
            this.vertexArray[nbVertex] = vertex;
            nbVertex++;
        }
        else{
            System.out.println("Nombre maximum de vertex atteint");
        }
    }


    /**
     *  Ajoute une arrete entre 2 sommets 
     * @param vertex1 Le premier sommet a connecter
     * @param vertex2 Le second sommet a connecter
     * @param EdgeKind Le type d'arrete de l'enum EdgeKind
     */
    public void addEdge(Vertex vertex1,Vertex vertex2,EdgeKind EdgeKind){
        if(nbEdge < (this.maxVertex*this.maxVertex)){
            this.edgesArray[nbEdge] = new Edge(vertex1,vertex2,1,Color.black);
            this.incidenceArray[vertex1.id][nbEdge] = this.edgesArray[nbEdge];
            this.incidenceArray[vertex2.id][nbEdge] = this.edgesArray[nbEdge];
            nbEdge++;
        }
        else{
            System.out.println("Nombre maximum d'edge atteint");
        }
    }

    /**
     * 
     * @param vertex Le premier sommet
     * @param vertex2 Le second sommet 
     * @return True si les 2 sommets en parametre sont connectes 
     */
    @Override
    public boolean isConnected(Vertex vertex1,Vertex vertex2){
        for(int i=0;i <= (maxVertex*maxVertex); i++){
            if(incidenceArray[vertex1.id][i]!=null){
                return incidenceArray[vertex2.id][i]!=null;
            }
        }
        return false;
    }

    // EN COURS
    /**
     * 
     * @return True si tout les sommets sont connectes 
     */
    public boolean isConnected(){
        return false;
    }

    /**
     * Retourne le ou les arrete(s) connectant les 2 sommets
     * @param vertex1 Le premier sommet
     * @param vertex2 Le second sommet 
     * @return
     */
    public Edge[] getEdges(Vertex vertex1, Vertex vertex2){
        return this.getVertices();
    }

   /**
    * 
    * @return toutes les arretes du graph
    */
    public Edge[] getEdges(){
        return this.getVertices();
    }

    /**
     * 
     * @return tous les sommets du graph
     */
    public Vertex [] getVertices(){
        return this.getVertices();
    }

    /**
     * 
     * @param vertex Le sommet dont on veut les arretes connectes
     * @return Les arretes connectees a un sommet
     */
    public Edge[] getNeighborEdges(Vertex vertex){
        return this.getVertices();
    }

    /**
     * 
     * @return La version String d'un graph
     */
    public String toString(){
        return "en cours";
    }

}
