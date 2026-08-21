public class objmatriz {
    String vehiculo;
    String dueño;
    String tipo;
    String plan;
    Double precio;
    Double descuento;
    Double total;
    public objmatriz(String vehiculo, String dueño, String tipo, String plan, Double precio, Double descuento,
            Double total) {
        this.vehiculo = vehiculo;
        this.dueño = dueño;
        this.tipo = tipo;
        this.plan = plan;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
    }
    public String getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Double getDescuento() {
        return descuento;
    }
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
