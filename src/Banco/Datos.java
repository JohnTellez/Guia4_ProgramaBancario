package Banco;

public class Datos {
    private final Integer id_cuenta;
    private Integer num_cuenta;
    private String nombre;
    private String tipo;
    private Integer monto;
    private String estado;

    public Datos() {
        this.id_cuenta = null;
        this.num_cuenta = null;
        this.nombre = null;
        this.tipo = null;
        this.monto = null;
        this.estado = null;
    }

    public Datos(Integer id_cuenta, Integer num_cuenta, String nombre, String tipo, Integer monto, String estado) {
        this.id_cuenta = id_cuenta;
        this.num_cuenta = num_cuenta;
        this.nombre = nombre;
        this.tipo = tipo;
        this.monto = monto;
        this.estado = estado;
    }

    public Integer getId_cuenta() {
        return id_cuenta;
    }
    
    public Integer getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(Integer num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Tarea{" + "id_cuenta=" + id_cuenta + ", num_cuenta=" + num_cuenta + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
}
