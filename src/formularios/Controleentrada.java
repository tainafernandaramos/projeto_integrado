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
@Table(name = "controleentrada", catalog = "bancoprojetointegrado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Controleentrada.findAll", query = "SELECT c FROM Controleentrada c"),
    @NamedQuery(name = "Controleentrada.findByCodControleE", query = "SELECT c FROM Controleentrada c WHERE c.codControleE = :codControleE"),
    @NamedQuery(name = "Controleentrada.findByCodp", query = "SELECT c FROM Controleentrada c WHERE c.codp = :codp"),
    @NamedQuery(name = "Controleentrada.findByCodf", query = "SELECT c FROM Controleentrada c WHERE c.codf = :codf"),
    @NamedQuery(name = "Controleentrada.findByQntMov", query = "SELECT c FROM Controleentrada c WHERE c.qntMov = :qntMov")})
public class Controleentrada implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codControleE")
    private Integer codControleE;
    @Basic(optional = false)
    @Column(name = "codp")
    private int codp;
    @Basic(optional = false)
    @Column(name = "codf")
    private int codf;
    @Basic(optional = false)
    @Column(name = "qntMov")
    private int qntMov;

    public Controleentrada() {
    }

    public Controleentrada(Integer codControleE) {
        this.codControleE = codControleE;
    }

    public Controleentrada(Integer codControleE, int codp, int codf, int qntMov) {
        this.codControleE = codControleE;
        this.codp = codp;
        this.codf = codf;
        this.qntMov = qntMov;
    }

    public Integer getCodControleE() {
        return codControleE;
    }

    public void setCodControleE(Integer codControleE) {
        Integer oldCodControleE = this.codControleE;
        this.codControleE = codControleE;
        changeSupport.firePropertyChange("codControleE", oldCodControleE, codControleE);
    }

    public int getCodp() {
        return codp;
    }

    public void setCodp(int codp) {
        int oldCodp = this.codp;
        this.codp = codp;
        changeSupport.firePropertyChange("codp", oldCodp, codp);
    }

    public int getCodf() {
        return codf;
    }

    public void setCodf(int codf) {
        int oldCodf = this.codf;
        this.codf = codf;
        changeSupport.firePropertyChange("codf", oldCodf, codf);
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
        hash += (codControleE != null ? codControleE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controleentrada)) {
            return false;
        }
        Controleentrada other = (Controleentrada) object;
        if ((this.codControleE == null && other.codControleE != null) || (this.codControleE != null && !this.codControleE.equals(other.codControleE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formularios.Controleentrada[ codControleE=" + codControleE + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
