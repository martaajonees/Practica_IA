package jungle;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class lineaDeCompra
{
    private int cod_linea_compra;
    private static int num_cod_lc = 0;
    private int cantidad_linea_compra;
    private float precio_linea_compra;
    private Medicamento m;
    public LineaDeCompra(int cantidad_, Medicamento m_)
    {
    this.cod_linea_compra = num_cod_lc++;
    this.cantidad_linea_compra = cantidad_;
    this.m = m_;
    this.precio_linea_compra = this.m.getPrecioMedicamento() *
    this.cantidad_linea_compra;
    }
    //Metodos observadores
    public int getCod_linea_compra()
    {
    return this.cod_linea_compra;
    }
    public int getCantidad_linea_compra()
    {
    return this.cantidad_linea_compra;
    }
    public float getPrecio_linea_compra()
    {
    return this.precio_linea_compra;
    }
    public Medicamento getMedicamento()
    {
    return this.m;
    }
    public int getNum_cod_lc()
    {
    return this.num_cod_lc;
    }
}
