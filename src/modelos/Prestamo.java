package modelos;
// Generated 10-feb-2023 20:12:47 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Prestamo generated by hbm2java
 */
public class Prestamo  implements java.io.Serializable {


    private BigDecimal NPrestamo;
    private FormaPago formaPago;
    private Date fecha;
    private BigDecimal importe;
    private BigDecimal importePagado;
    private Set recibos = new HashSet(0);

    public Prestamo() {
    }

	
    public Prestamo(BigDecimal NPrestamo, FormaPago formaPago, Date fecha, BigDecimal importe, BigDecimal importePagado) {
        this.NPrestamo = NPrestamo;
        this.formaPago = formaPago;
        this.fecha = fecha;
        this.importe = importe;
        this.importePagado = importePagado;
    }
    public Prestamo(BigDecimal NPrestamo, FormaPago formaPago, Date fecha, BigDecimal importe, BigDecimal importePagado, Set recibos) {
       this.NPrestamo = NPrestamo;
       this.formaPago = formaPago;
       this.fecha = fecha;
       this.importe = importe;
       this.importePagado = importePagado;
       this.recibos = recibos;
    }
   
    public BigDecimal getNPrestamo() {
        return this.NPrestamo;
    }
    
    public void setNPrestamo(BigDecimal NPrestamo) {
        this.NPrestamo = NPrestamo;
    }
    public FormaPago getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getImporte() {
        return this.importe;
    }
    
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }
    public BigDecimal getImportePagado() {
        return this.importePagado;
    }
    
    public void setImportePagado(BigDecimal importePagado) {
        this.importePagado = importePagado;
    }
    public Set getRecibos() {
        return this.recibos;
    }
    
    public void setRecibos(Set recibos) {
        this.recibos = recibos;
    }

    @Override
    public String toString() {
        return this.NPrestamo+"";
    }

}