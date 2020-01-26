import java.util.ArrayList;

/*
 * Cada instancia a esta clase representa cada vertice
 * Cada vertice tiene asociado una etiqueta
 * Por tanto, la existencia de esta no permite vértices duplicados
 * El array de lista vecindad contiene las aristas incidentes al vértice
*/


public class Vertice
{
 
    private ArrayList<Arista> vecindad;
    private String etiqueta;

    public Vertice (String etiqueta)
    {
	this.etiqueta = etiqueta;
	this.vecindad = new ArrayList<Arista>();
    }

    /**
     * Añade un objeto Arista al array de lista vecindad
     * si y solo este no esté contenido en dicho array de lista 
     * @param arista. Objeto a añadir
     */
    public void insertarVecino(Arista arista)
    {
	if( !this.vecindad.contains(arista))
	    this.vecindad.add(arista);
    }

    /**
     * Comprueba si la arista incide en este vertice
     * @param arista. Objeto a evaluar
     * @return true. Si y solo si el objeto esta contenido en el array de lista vecindad
     */
    public boolean contieneUnVecino(Arista arista)
    {
	return this.vecindad.contains(arista);
    }

    /**
     * @param indice. Indica la posicion a extraer
     * @return Arista. La arista apuntada por el índice en el array de lista vecindad
     */
    public Arista getVecino(int indice)
    {
	return this.vecindad.get(indice);
    }

    /**
     * Se elimina una arista del array de lista vecindad mediante posición
     * @param indice. Indica la posicion a eliminar
     * @return Arista. La Arista que ha sido eliminada del array de lista vecindad
     */
    public Arista eliminarVecino(int indice)
    {
	return this.vecindad.remove(indice);
    }


    /**
     * Se elimina el objeto Arista del array de lista vecindad mediante
     * el identificando la referencia del objeto Arista
     * @param arista. indice el objeto Arista a eliminar
     */
    public void eliminarVecino(Arista arista)
    {
	this.vecindad.remove(arista);
    }

    /**
