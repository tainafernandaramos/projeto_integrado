/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

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

/**
 *
 * @author TainaRamos
 */
@Entity
@Table(name = "produto", catalog = "bancoprojetointegrado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodp", query = "SELECT p FROM Produto p WHERE p.codp = :codp"),
    @NamedQuery(name = "Produto.findByQntmin", query = "SELECT p FROM Produto p WHERE p.qntmin = :qntmin"),
    @NamedQuery(name = "Produto.findByQntmax", query = "SELECT p FROM Produto p WHERE p.qntmax = :qntmax"),
    @NamedQuery(name = "Produto.findByDescp", query = "SELECT p FROM Produto p WHERE p.descp = :descp"),
    @NamedQuery(name = "Produto.findByMarca", query = "SELECT p FROM Produto p WHERE p.marca = :marca"),
    @NamedQuery(name = "Produto.findByModelo", query = "SELECT p FROM Produto p WHERE p.modelo = :modelo")})
public class Produto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codp")
    private Integer codp;
    @Basic(optional = false)
    @Column(name = "qntmin")
    private int qntmin;
    @Basic(optional = false)
    @Column(name = "qntmax")
    private int qntmax;
    @Basic(optional = false)
    @Column(name = "descp")
    private String descp;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;

    public Produto() {
    }

    public Produto(Integer codp) {
        this.codp = codp;
    }

    public Produto(Integer codp, int qntmin, int qntmax, String descp) {
        this.codp = codp;
        this.qntmin = qntmin;
        this.qntmax = qntmax;
        this.descp = descp;
    }

    public Integer getCodp() {
        return codp;
    }

    public void setCodp(Integer codp) {
        Integer oldCodp = this.codp;
        this.codp = codp;
        changeSupport.firePropertyChange("codp", oldCodp, codp);
    }

    public int getQntmin() {
        return qntmin;
    }

    public void setQntmin(int qntmin) {
        int oldQntmin = this.qntmin;
        this.qntmin = qntmin;
        changeSupport.firePropertyChange("qntmin", oldQntmin, qntmin);
    }

    public int getQntmax() {
        return qntmax;
    }

    public void setQntmax(int qntmax) {
        int oldQntmax = this.qntmax;
        this.qntmax = qntmax;
        changeSupport.firePropertyChange("qntmax", oldQntmax, qntmax);
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        String oldDescp = this.descp;
        this.descp = descp;
        changeSupport.firePropertyChange("descp", oldDescp, descp);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codp != null ? codp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codp == null && other.codp != null) || (this.codp != null && !this.codp.equals(other.codp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetointegrado.Produto[ codp=" + codp + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
