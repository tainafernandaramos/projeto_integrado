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
@Table(name = "cliente", catalog = "bancoprojetointegrado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodc", query = "SELECT c FROM Cliente c WHERE c.codc = :codc"),
    @NamedQuery(name = "Cliente.findByCnpjcpfc", query = "SELECT c FROM Cliente c WHERE c.cnpjcpfc = :cnpjcpfc"),
    @NamedQuery(name = "Cliente.findByNomefantansiac", query = "SELECT c FROM Cliente c WHERE c.nomefantansiac = :nomefantansiac"),
    @NamedQuery(name = "Cliente.findByRazaoc", query = "SELECT c FROM Cliente c WHERE c.razaoc = :razaoc"),
    @NamedQuery(name = "Cliente.findByEnderecoc", query = "SELECT c FROM Cliente c WHERE c.enderecoc = :enderecoc"),
    @NamedQuery(name = "Cliente.findByNumeroc", query = "SELECT c FROM Cliente c WHERE c.numeroc = :numeroc"),
    @NamedQuery(name = "Cliente.findByCepc", query = "SELECT c FROM Cliente c WHERE c.cepc = :cepc"),
    @NamedQuery(name = "Cliente.findByCidadec", query = "SELECT c FROM Cliente c WHERE c.cidadec = :cidadec"),
    @NamedQuery(name = "Cliente.findByEstadoc", query = "SELECT c FROM Cliente c WHERE c.estadoc = :estadoc"),
    @NamedQuery(name = "Cliente.findByContatoc", query = "SELECT c FROM Cliente c WHERE c.contatoc = :contatoc"),
    @NamedQuery(name = "Cliente.findByTelefonec1", query = "SELECT c FROM Cliente c WHERE c.telefonec1 = :telefonec1"),
    @NamedQuery(name = "Cliente.findByTelefonec2", query = "SELECT c FROM Cliente c WHERE c.telefonec2 = :telefonec2")})
public class Cliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codc")
    private Integer codc;
    @Basic(optional = false)
    @Column(name = "cnpjcpfc")
    private String cnpjcpfc;
    @Column(name = "nomefantansiac")
    private String nomefantansiac;
    @Basic(optional = false)
    @Column(name = "razaoc")
    private String razaoc;
    @Column(name = "enderecoc")
    private String enderecoc;
    @Column(name = "numeroc")
    private Integer numeroc;
    @Column(name = "cepc")
    private String cepc;
    @Column(name = "cidadec")
    private String cidadec;
    @Column(name = "estadoc")
    private String estadoc;
    @Column(name = "contatoc")
    private String contatoc;
    @Column(name = "telefonec1")
    private String telefonec1;
    @Column(name = "telefonec2")
    private String telefonec2;

    public Cliente() {
    }

    public Cliente(Integer codc) {
        this.codc = codc;
    }

    public Integer getCodc() {
        return codc;
    }

    public void setCodc(Integer codc) {
        Integer oldCodc = this.codc;
        this.codc = codc;
        changeSupport.firePropertyChange("codc", oldCodc, codc);
    }

    public String getCnpjcpfc() {
        return cnpjcpfc;
    }

    public void setCnpjcpfc(String cnpjcpfc) {
        String oldCnpjcpfc = this.cnpjcpfc;
        this.cnpjcpfc = cnpjcpfc;
        changeSupport.firePropertyChange("cnpjcpfc", oldCnpjcpfc, cnpjcpfc);
    }

    public String getNomefantansiac() {
        return nomefantansiac;
    }

    public void setNomefantansiac(String nomefantansiac) {
        String oldNomefantansiac = this.nomefantansiac;
        this.nomefantansiac = nomefantansiac;
        changeSupport.firePropertyChange("nomefantansiac", oldNomefantansiac, nomefantansiac);
    }

    public String getRazaoc() {
        return razaoc;
    }

    public void setRazaoc(String razaoc) {
        String oldRazaoc = this.razaoc;
        this.razaoc = razaoc;
        changeSupport.firePropertyChange("razaoc", oldRazaoc, razaoc);
    }

    public String getEnderecoc() {
        return enderecoc;
    }

    public void setEnderecoc(String enderecoc) {
        String oldEnderecoc = this.enderecoc;
        this.enderecoc = enderecoc;
        changeSupport.firePropertyChange("enderecoc", oldEnderecoc, enderecoc);
    }

    public Integer getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(Integer numeroc) {
        Integer oldNumeroc = this.numeroc;
        this.numeroc = numeroc;
        changeSupport.firePropertyChange("numeroc", oldNumeroc, numeroc);
    }

    public String getCepc() {
        return cepc;
    }

    public void setCepc(String cepc) {
        String oldCepc = this.cepc;
        this.cepc = cepc;
        changeSupport.firePropertyChange("cepc", oldCepc, cepc);
    }

    public String getCidadec() {
        return cidadec;
    }

    public void setCidadec(String cidadec) {
        String oldCidadec = this.cidadec;
        this.cidadec = cidadec;
        changeSupport.firePropertyChange("cidadec", oldCidadec, cidadec);
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        String oldEstadoc = this.estadoc;
        this.estadoc = estadoc;
        changeSupport.firePropertyChange("estadoc", oldEstadoc, estadoc);
    }

    public String getContatoc() {
        return contatoc;
    }

    public void setContatoc(String contatoc) {
        String oldContatoc = this.contatoc;
        this.contatoc = contatoc;
        changeSupport.firePropertyChange("contatoc", oldContatoc, contatoc);
    }

    public String getTelefonec1() {
        return telefonec1;
    }

    public void setTelefonec1(String telefonec1) {
        String oldTelefonec1 = this.telefonec1;
        this.telefonec1 = telefonec1;
        changeSupport.firePropertyChange("telefonec1", oldTelefonec1, telefonec1);
    }

    public String getTelefonec2() {
        return telefonec2;
    }

    public void setTelefonec2(String telefonec2) {
        String oldTelefonec2 = this.telefonec2;
        this.telefonec2 = telefonec2;
        changeSupport.firePropertyChange("telefonec2", oldTelefonec2, telefonec2);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codc != null ? codc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codc == null && other.codc != null) || (this.codc != null && !this.codc.equals(other.codc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetointegrado.Cliente[ codc=" + codc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}