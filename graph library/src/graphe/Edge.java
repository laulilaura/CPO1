package graphe;

import java.util.Random;

/**
 * Edge class
 */
public class Edge{
    
    private int id;
    private Color color;
    public Vertex[] ends = new Vertex[2];
    private double value;

    /**
     * 
     * @param color la couleur de l'arrête
     * @param start le vertex du début de l'arrête
     * @param ends le vertex de fin de l'arrête
     * @param value la valeur de l'arrête
     */
    public Edge(Color color, Vertex start, Vertex ends, double value){
        this.id=genererIdEdge(1, 100000);
        this.ends[0]=start;
        this.ends[1]=ends;
        this.color=color;
        this.value=value;
    }
    
    static int genererIdEdge(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }

    /**
     * 
     * @return renvoie l'id de l'arrête
     */
    public int getId(){
        return this.id;
    }

    /**
     * 
     * @return renvoie le vertex de début
     */
    public Color getColor(){
        return this.color;
    }
 
    /**
     * 
     * @return renvoie le vertex de fin
     */
    public Vertex[] getEnds(){
        return this.ends;
    }

    /**
     * 
     * @return renvoie la valeur de l'arrête
     */
    public double getValue(){
        return this.value;
    }

    /**
     * 
     * @return la chaine de caractère "arrête"
     */
    public String toString(){
        return "arrete "+this.value;
    }
    
    

} 