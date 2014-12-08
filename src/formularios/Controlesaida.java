package formularios;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "controlesaida", catalog = "bancoprojetointegrado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Controlesaida.findAll", query = "SELECT c FROM Controlesaida c"),
    @NamedQuery(name = "Controlesaida.findByCodControleS", query = "SELECT c FROM Controlesaida c WHERE c.codControleS = :codControleS"),
    @NamedQuery(name = "Controlesaida.findByCodp", query = "SELECT c FROM Controlesaida c WHERE c.codp = :codp"),
    @NamedQuery(name = "Controlesaida.findByCodc", query = "SELECT c FROM Controlesaida c WHERE c.codc = :codc"),
    @NamedQuery(name = "Controlesaida.findByQntMov", query = "SELECT c FROM Controlesaida c WHERE c.qntMov = :qntMov")})
public class Controlesaida implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codControleS")
    private Integer codControleS;
    @Basic(optional = false)
    @Column(name = "codp")
    private int codp;
    @Basic(optional = false)
    @Column(name = "codc")
    private int codc;
    @Basic(optional = false)
    @Column(name = "qntMov")
    private int qntMov;

    public Controlesaida() {
    }

    public Controlesaida(Integer codControleS) {
        this.codControleS = codControleS;
    }

    public Controlesaida(Integer codControleS, int codp, int codc, int qntMov) {
        this.codControleS = codControleS;
        this.codp = codp;
        this.codc = codc;
        this.qntMov = qntMov;
    }

    public Integer getCodControleS() {
        return codControleS;
    }

    public void setCodControleS(Integer codControleS) {
        Integer oldCodControleS = this.codControleS;
        this.codControleS = codControleS;
        changeSupport.firePropertyChange("codControleS", oldCodControleS, codControleS);
    }

    public int getCodp() {
        return codp;
    }

    public void setCodp(int codp) {
        int oldCodp = this.codp;
        this.codp = codp;
        changeSupport.firePropertyChange("codp", oldCodp, codp);
    }

    public int getCodc() {
        return codc;
    }

    public void setCodc(int codc) {
        int oldCodc = this.codc;
        this.codc = codc;
        changeSupport.firePropertyChange("codc", oldCodc, codc);
    }

    public int getQntMov() {
        return qntMov;
    }

    public void setQntMov(int qntMov) {
        int oldQntMov = this.qntMov;
        this.qntMov = qntMov;
        changeSupport.firePropertyChange("qntMov", oldQntMov, qntMov);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codControleS != null ? codControleS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Controlesaida)) {
            return false;
        }
        Controlesaida other = (Controlesaida) object;
        if ((this.codControleS == null && other.codControleS != null) || (this.codControleS != null && !this.codControleS.equals(other.codControleS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formularios.Controlesaida[ codControleS=" + codControleS + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
