package graphe;

/**
 * Test class - (main class)
 */
public class MyTest {

    public static void main(String[] args){
        Vertex myFirstVertex = new Vertex("Premier sommet", Color.YELLOW);
        Vertex mySecondVertex = new Vertex("Second sommet", Color.PINK);
        Edge myEdge = new Edge(Color.BLACK,myFirstVertex,mySecondVertex,10.6);
        System.out.println("Je possede une sommet \""+myFirstVertex+"\" et un autre sommet \""+mySecondVertex+"\".");
        System.out.println("Je possede egalement une arrete de "+myEdge+" entre les deux.");
        System.out.println(myFirstVertex+"----"+myEdge+"----"+mySecondVertex);
    }
}