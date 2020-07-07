package pe.edu.upeu.modelo;


public class Producto{
  public int idProducto=0;  
  public int cantdad=0;
  public String nombreProducto="";
  public double precio=0;

  public int getIdProducto() {
      return idProducto;
  }

  public void setIdProducto(int idProducto) {
      this.idProducto = idProducto;
  }

  public int getCantdad() {
      return cantdad;
  }

  public void setCantdad(int cantdad) {
      this.cantdad = cantdad;
  }

  public String getNombreProducto() {
      return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
      this.nombreProducto = nombreProducto;
  }

  public double getPrecio() {
      return precio;
  }

  public void setPrecio(double precio) {
      this.precio = precio;
  }


}