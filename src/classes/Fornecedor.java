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
@Table(name = "fornecedor", catalog = "bancoprojetointegrado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByCodf", query = "SELECT f FROM Fornecedor f WHERE f.codf = :codf"),
    @NamedQuery(name = "Fornecedor.findByCnpjcpff", query = "SELECT f FROM Fornecedor f WHERE f.cnpjcpff = :cnpjcpff"),
    @NamedQuery(name = "Fornecedor.findByNomefantansiaf", query = "SELECT f FROM Fornecedor f WHERE f.nomefantansiaf = :nomefantansiaf"),
    @NamedQuery(name = "Fornecedor.findByRazaof", query = "SELECT f FROM Fornecedor f WHERE f.razaof = :razaof"),
    @NamedQuery(name = "Fornecedor.findByEnderecof", query = "SELECT f FROM Fornecedor f WHERE f.enderecof = :enderecof"),
    @NamedQuery(name = "Fornecedor.findByNumerof", query = "SELECT f FROM Fornecedor f WHERE f.numerof = :numerof"),
    @NamedQuery(name = "Fornecedor.findByCepf", query = "SELECT f FROM Fornecedor f WHERE f.cepf = :cepf"),
    @NamedQuery(name = "Fornecedor.findByCidadef", query = "SELECT f FROM Fornecedor f WHERE f.cidadef = :cidadef"),
    @NamedQuery(name = "Fornecedor.findByEstadof", query = "SELECT f FROM Fornecedor f WHERE f.estadof = :estadof"),
    @NamedQuery(name = "Fornecedor.findByContatof", query = "SELECT f FROM Fornecedor f WHERE f.contatof = :contatof"),
    @NamedQuery(name = "Fornecedor.findByTelefonef1", query = "SELECT f FROM Fornecedor f WHERE f.telefonef1 = :telefonef1"),
    @NamedQuery(name = "Fornecedor.findByTelefonef2", query = "SELECT f FROM Fornecedor f WHERE f.telefonef2 = :telefonef2")})
public class Fornecedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codf")
    private Integer codf;
    @Basic(optional = false)
    @Column(name = "cnpjcpff")
    private String cnpjcpff;
    @Column(name = "nomefantansiaf")
    private String nomefantansiaf;
    @Basic(optional = false)
    @Column(name = "razaof")
    private String razaof;
    @Column(name = "enderecof")
    private String enderecof;
    @Column(name = "numerof")
    private Integer numerof;
    @Column(name = "cepf")
    private String cepf;
    @Column(name = "cidadef")
    private String cidadef;
    @Column(name = "estadof")
    private String estadof;
    @Column(name = "contatof")
    private String contatof;
    @Column(name = "telefonef1")
    private String telefonef1;
    @Column(name = "telefonef2")
    private String telefonef2;

    public Fornecedor() {
    }

    public Fornecedor(Integer codf) {
        this.codf = codf;
    }

    public Fornecedor(Integer codf, String cnpjcpff, String razaof) {
        this.codf = codf;
        this.cnpjcpff = cnpjcpff;
        this.razaof = razaof;
    }

    public Integer getCodf() {
        return codf;
    }

    public void setCodf(Integer codf) {
        Integer oldCodf = this.codf;
        this.codf = codf;
        changeSupport.firePropertyChange("codf", oldCodf, codf);
    }

    public String getCnpjcpff() {
        return cnpjcpff;
    }

    public void setCnpjcpff(String cnpjcpff) {
        String oldCnpjcpff = this.cnpjcpff;
        this.cnpjcpff = cnpjcpff;
        changeSupport.firePropertyChange("cnpjcpff", oldCnpjcpff, cnpjcpff);
    }

    public String getNomefantansiaf() {
        return nomefantansiaf;
    }

    public void setNomefantansiaf(String nomefantansiaf) {
        String oldNomefantansiaf = this.nomefantansiaf;
        this.nomefantansiaf = nomefantansiaf;
        changeSupport.firePropertyChange("nomefantansiaf", oldNomefantansiaf, nomefantansiaf);
    }

    public String getRazaof() {
        return razaof;
    }

    public void setRazaof(String razaof) {
        String oldRazaof = this.razaof;
        this.razaof = razaof;
        changeSupport.firePropertyChange("razaof", oldRazaof, razaof);
    }

    public String getEnderecof() {
        return enderecof;
    }

    public void setEnderecof(String enderecof) {
        String oldEnderecof = this.enderecof;
        this.enderecof = enderecof;
        changeSupport.firePropertyChange("enderecof", oldEnderecof, enderecof);
    }

    public Integer getNumerof() {
        return numerof;
    }

    public void setNumerof(Integer numerof) {
        Integer oldNumerof = this.numerof;
        this.numerof = numerof;
        changeSupport.firePropertyChange("numerof", oldNumerof, numerof);
    }

    public String getCepf() {
        return cepf;
    }

    public void setCepf(String cepf) {
        String oldCepf = this.cepf;
        this.cepf = cepf;
        changeSupport.firePropertyChange("cepf", oldCepf, cepf);
    }

    public String getCidadef() {
        return cidadef;
    }

    public void setCidadef(String cidadef) {
        String oldCidadef = this.cidadef;
        this.cidadef = cidadef;
        changeSupport.firePropertyChange("cidadef", oldCidadef, cidadef);
    }

    public String getEstadof() {
        return estadof;
    }

    public void setEstadof(String estadof) {
        String oldEstadof = this.estadof;
        this.estadof = estadof;
        changeSupport.firePropertyChange("estadof", oldEstadof, estadof);
    }

    public String getContatof() {
        return contatof;
    }

    public void setContatof(String contatof) {
        String oldContatof = this.contatof;
        this.contatof = contatof;
        changeSupport.firePropertyChange("contatof", oldContatof, contatof);
    }

    public String getTelefonef1() {
        return telefonef1;
    }

    public void setTelefonef1(String telefonef1) {
        String oldTelefonef1 = this.telefonef1;
        this.telefonef1 = telefonef1;
        changeSupport.firePropertyChange("telefonef1", oldTelefonef1, telefonef1);
    }

    public String getTelefonef2() {
        return telefonef2;
    }

    public void setTelefonef2(String telefonef2) {
        String oldTelefonef2 = this.telefonef2;
        this.telefonef2 = telefonef2;
        changeSupport.firePropertyChange("telefonef2", oldTelefonef2, telefonef2);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codf != null ? codf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codf == null && other.codf != null) || (this.codf != null && !this.codf.equals(other.codf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetointegrado.Fornecedor[ codf=" + codf + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
