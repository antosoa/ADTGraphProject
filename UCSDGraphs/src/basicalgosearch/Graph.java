package basicalgosearch;

abstract class Graph {
	
	private int numVertices;
	private int numEdges;
	
	
	public Graph()
	{
		numVertices=0;
		numEdges=0;
	}
	
	
	public int getNumVertices()
	{
		return numVertices;
	}
	public int getNumEdges()
	{
		return numEdges;
	}
	
	public void addVertex()
	{
		absaddVertex();
		numVertices++;
		
	}
	
	protected abstract void absaddVertex();
	
	public void addEdges()
	{
		absAddEdges();
		numEdges++;
	}
	
	protected abstract void absAddEdges();
	
	
}
