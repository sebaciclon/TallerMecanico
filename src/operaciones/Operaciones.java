
package operaciones;

import hibernate.Cliente;
import hibernate.Factura;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;




public class Operaciones {
    
        
    public void guardarCliente(Cliente cliente) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(cliente);
        t.commit();
        s.close();
    }
    
    public void guardarFactura(Factura factura) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(factura);
        t.commit();
        s.close();
    }
    
       
    public List<Cliente> listaCliente() {

        List<Cliente> lista = null;

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        lista = s.createQuery("FROM Cliente").list();

        return lista;
    }
    
    public List<Factura> listaFactura() {

        List<Factura> lista = null;

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        lista = s.createQuery("FROM Factura").list();

        return lista;
    }
    
    public void actualizarCliente(Cliente cliente) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.update(cliente);
        t.commit();
        s.close();
    }
    
    public void actualizarFactura(Factura f) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.update(f);
        t.commit();
        s.close();
    }
    
    //metodo para eliminar una factura
    public void eliminarFactura(Factura factura) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.delete(factura);
        t.commit();
        s.close();
    }
    
    //metodo para eliminar un cliente
    public void eliminarCliente(Cliente cliente) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.delete(cliente);
        t.commit();
        s.close();
    }
    
    //metodo para ver si existe la patente en la BD, y si existe que devuelva el objeto
    /*public List<Cliente> existePatente(String patente) {
        List<Cliente> lista = null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();

        try {
            lista  = (List<Cliente>) (Cliente) s.createCriteria(Cliente.class).add(Restrictions.eq("patente", patente)).list();               //.uniqueResult();
            if (lista.size() > 0) {
                return lista;
            }
        } catch (Exception e) {
            s.getTransaction().rollback();
        }
//        t.commit();
        s.close();
        return lista;
    }*/
    
    public Cliente existePatente(String patente) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();

        try {
            Cliente busqueda = (Cliente) s.createCriteria(Cliente.class).add(Restrictions.eq("patente", patente)).list();     //.uniqueResult();
            if (busqueda != null) {
                return busqueda;
            }
        } catch (Exception e) {
            s.getTransaction().rollback();
        }
        //t.commit();
        s.close();
        return null;
    }
    
    public List<Cliente> listaClientes() {

        List<Cliente> lista = null;

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();

        lista = s.createQuery("FROM Cliente").list();

        return lista;
    }
    
    public double importe(){
    
    double p = 0;
        try {
            String peso = JOptionPane.showInputDialog(null, "Importe a pagar: ");
            p = Double.parseDouble(peso);
            
        } catch (Exception e) {

        }
        return p;
    }
}
    

