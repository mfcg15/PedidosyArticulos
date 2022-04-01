import java.util.ArrayList;

public class Pedido 
{
    private String nombre;
    private double total;
    private boolean listo;
    private ArrayList<Articulo> items = new ArrayList<>();

    public Pedido(String nombre, double total, boolean listo, ArrayList<Articulo> items) 
    {
		this.nombre = nombre;
		this.total = total;
		this.listo = listo;
		this.items = items;
	}

    public String getNombre() 
    {
		return nombre;
	}

	public void setNombre(String nombre) 
    {
		this.nombre = nombre;
	}

	public double getTotal() 
    {
		double totalPedido = 0;

		for(int i = 0; i < getItems().size(); i++)
        {
			totalPedido += getItems().get(i).getPrecio();
        }

		setTotal(totalPedido);
		return total;
	}

	public void setTotal(double total) 
    {
		this.total = total;
	}

	public boolean isListo() 
    {
		return listo;
	}

	public void setListo(boolean listo) 
    {
		this.listo = listo;
	}

	public ArrayList<Articulo> getItems() 
    {
		return items;
	}

	public void setItems(ArrayList<Articulo> items) 
    {
		this.items = items;
	}
}
