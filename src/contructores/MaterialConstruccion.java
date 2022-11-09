

package contructores;


public class MaterialConstruccion {
    public String Tipo_Material;
    public int cantidad;
    public double Precio;

    public MaterialConstruccion(String Tipo_Material, int cantidad, double Precio) {
        this.Tipo_Material = Tipo_Material;
        this.cantidad = cantidad;
        this.Precio = Precio;
    }

    public String getTipo_Material() {
        return Tipo_Material;
    }

    public void setTipo_Material(String Tipo_Material) {
        this.Tipo_Material = Tipo_Material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    void VerInformacion(){
        System.out.println("El tipo de Material que lleva es :"+" "+ Tipo_Material);
        System.out.println("La cantidad es:"+""+cantidad);
        System.out.println("El precio es :"+""+ Precio);
    }
    
}
