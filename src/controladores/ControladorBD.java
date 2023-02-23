package controladores;

import modelos.FormaPago;
import modelos.Prestamo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

public class ControladorBD {

    Session ss;
    Transaction tr;
    
    public ControladorBD() {}
    
    private void open() throws HibernateException {
        ss = NewHibernateUtil.getSessionFactory().openSession();
        tr = ss.beginTransaction();
    }

    private void close() throws HibernateException {
        tr.commit();
        ss.close();
    }
    
    public List<FormaPago> getFormasPago(){
        open();
        String hql = "FROM FormaPago";
        Query query = ss.createQuery(hql);
        List results = query.list();
        ss.close();
        return results;
    }
    
    public List<Prestamo> getPrestamos(){
        open();
        Criteria cr = ss.createCriteria(Prestamo.class);
        cr.addOrder(Order.asc("NPrestamo"));
        List results = cr.list();
        ss.close();
        return results;
    }
    
    public boolean addPrestamo(Prestamo p){
        try{
            open();
            ss.save(p);
        }catch(HibernateException he){
            System.out.println("Error " + he);
            return false;
        }finally{
            close();
        }
        return true;
    }
    
    public boolean deletePrestamo(Prestamo p){
        try{
            open();
            ss.delete(p);
        }catch(HibernateException he){
            System.out.println("Error " + he);
            return false;
        }finally{
            close();
        }
        return true;
    }
    
    public boolean updatePrestamo(Prestamo p){
        try{
            open();
            ss.update(p);
        }catch(HibernateException he){
            System.out.println("Error " + he);
            return false;
        }finally{
            close();
        }
        return true;
    }
    
    public Double getProximoPrestamo(List<Prestamo> lista){
        Double aux = 0.0;
        for(Prestamo p : lista){
            if(Double.parseDouble(p.getNPrestamo().toString())>aux){
                aux = Double.parseDouble(p.getNPrestamo().toString());
            }
        }
        return aux+1;
    }
}