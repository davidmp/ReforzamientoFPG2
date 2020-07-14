package pe.edu.upeu.app;
import pe.edu.upeu.modelo.Categoria;
import pe.edu.upeu.modelo.Producto;
import pe.edu.upeu.utils.LeerArchivo;

public class App {
    
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        

        //MainGUI gui=new MainGUI();
        //gui.ventanaPrincipa();
        AppCrud crud=new AppCrud();

        LeerArchivo aq  = new LeerArchivo("Productos"+".txt");
        Producto proTO=new Producto();
        /*
        proTO.setCantdad(20);
        proTO.setNombreProducto("Naranja");
        proTO.setIdProducto(1);
        proTO.setPrecio(14.50);

        crud.crearContenido(aq, proTO);        
        crud.imprimirLista(crud.listarContenido(aq));
        */
        System.out.println("Agregar  Registro");
        proTO=new Producto();
        proTO.setCantdad(10);
        proTO.setNombreProducto("Papaya Boliviana");
        proTO.setIdProducto(4);
        proTO.setPrecio(25.50);
        crud.imprimirLista(crud.agregarContenido(aq, proTO));  

        System.out.println("Buscar valor");
        crud.imprimirLista(crud.buscarContenido(aq,3,"25.5"));
        System.out.println("Edita Valores");
        proTO=new Producto();
        proTO.setCantdad(15);
        proTO.setNombreProducto("Pera");
        crud.imprimirLista(crud.editarRegistro(aq,0,"2",proTO));
        System.out.println("Eliminar Registro");
        crud.imprimirLista(crud.eliminarRegistros(aq, 0, "1"));

        LeerArchivo aqc  = new LeerArchivo("Categoria"+".txt");
        Categoria catPro=new Categoria();
        catPro.setIdCategoria("CA10");
        catPro.setNombreCat("Pollo 1/2");
        crud.crearContenido(aqc, catPro);
        crud.imprimirLista(crud.listarContenido(aqc));
        //new MainGUI2();


        new LoginApp();
    }
}
