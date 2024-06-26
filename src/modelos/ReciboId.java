package modelos;
// Generated 10-feb-2023 20:12:47 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ReciboId generated by hbm2java
 */
public class ReciboId  implements java.io.Serializable {


     private BigDecimal NPrestamo;
     private long NRecibo;

    public ReciboId() {
    }

    public ReciboId(BigDecimal NPrestamo, long NRecibo) {
       this.NPrestamo = NPrestamo;
       this.NRecibo = NRecibo;
    }
   
    public BigDecimal getNPrestamo() {
        return this.NPrestamo;
    }
    
    public void setNPrestamo(BigDecimal NPrestamo) {
        this.NPrestamo = NPrestamo;
    }
    public long getNRecibo() {
        return this.NRecibo;
    }
    
    public void setNRecibo(long NRecibo) {
        this.NRecibo = NRecibo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReciboId) ) return false;
		 ReciboId castOther = ( ReciboId ) other; 
         
		 return ( (this.getNPrestamo()==castOther.getNPrestamo()) || ( this.getNPrestamo()!=null && castOther.getNPrestamo()!=null && this.getNPrestamo().equals(castOther.getNPrestamo()) ) )
 && (this.getNRecibo()==castOther.getNRecibo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNPrestamo() == null ? 0 : this.getNPrestamo().hashCode() );
         result = 37 * result + (int) this.getNRecibo();
         return result;
   }   


}


