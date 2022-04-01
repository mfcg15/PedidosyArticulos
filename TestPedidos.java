import java.util.ArrayList;

public class TestPedidos 
{
    public static void main(String[] args) 
    {
        Articulo articulo1 = new Articulo("moka",2.7);
        Articulo articulo2 = new Articulo("latte", 1.8);
        Articulo articulo3 = new Articulo("café de goteo", 3.2);
        Articulo articulo4 = new Articulo("capuchino", 2.5);

        ArrayList<Articulo> listaPedido1 = new ArrayList<>();
        ArrayList<Articulo> listaPedido2 = new ArrayList<>();
        ArrayList<Articulo> listaPedido3 = new ArrayList<>();
        ArrayList<Articulo> listaPedido4 = new ArrayList<>();
        
        Pedido pedido1 = new Pedido("Cindhuri", 0, false, listaPedido1);
        Pedido pedido2 = new Pedido("Jimmy", 0, false, listaPedido2);
        Pedido pedido3 = new Pedido("Noah", 0, false, listaPedido3);
        Pedido pedido4 = new Pedido("Sam", 0, false, listaPedido4);

        listaPedido1.add(articulo3);
        listaPedido2.add(articulo1);
        listaPedido3.add(articulo4);
        listaPedido4.add(articulo2);
        listaPedido4.add(articulo2);
        listaPedido4.add(articulo2);

        pedido1.setItems(listaPedido1);
        pedido2.setItems(listaPedido2);
        pedido3.setItems(listaPedido3);
        pedido4.setItems(listaPedido4);

        pedido1.setListo(true);
        pedido2.setListo(true);

        System.out.println(pedido1);

        System.out.println("-----------");

        System.out.printf("Nombre: %s\n", pedido1.getNombre());
        System.out.printf("Total: %s\n", pedido1.getTotal());
        System.out.printf("Listo: %s\n", pedido1.isListo());
       
        System.out.println("-----------");

        System.out.printf("Nombre: %s\n", pedido2.getNombre());
        System.out.printf("Total: %s\n", pedido2.getTotal());
        System.out.printf("Listo: %s\n", pedido2.isListo());

        System.out.println("-----------");

        System.out.printf("Nombre: %s\n", pedido3.getNombre());
        System.out.printf("Total: %s\n", pedido3.getTotal());
        System.out.printf("Listo: %s\n", pedido3.isListo());

        System.out.println("-----------");

        System.out.printf("Nombre: %s\n", pedido4.getNombre());
        System.out.printf("Total: %s\n", pedido4.getTotal());
        System.out.printf("Listo: %s\n", pedido4.isListo());

    }
}
