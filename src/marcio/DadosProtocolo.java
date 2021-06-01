package marcio;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

public class DadosProtocolo {
    private double numeroLotePrestador;
    private double numeroProtocolo;
    private String dataProtocolo;
    private double situacaoProtocolo;
    private double valorInformadoProtocolo;
    private double valorProcessadoProtocolo;
    private double valorLiberadoProtocolo;
    private double valorGlosaProtocolo;

    @XStreamAlias(value = "ans:relacaoGuias")
    @XStreamImplicit(itemFieldName="ans:relacaoGuias")
    private List relacaoGuias = new ArrayList();

    public DadosProtocolo(double numeroLotePrestador, double numeroProtocolo, String dataProtocolo, double situacaoProtocolo, double valorInformadoProtocolo, double valorProcessadoProtocolo, double valorLiberadoProtocolo, double valorGlosaProtocolo, List relacaoGuiasList) {
        this.numeroLotePrestador = numeroLotePrestador;
        this.numeroProtocolo = numeroProtocolo;
        this.dataProtocolo = dataProtocolo;
        this.situacaoProtocolo = situacaoProtocolo;
        this.valorInformadoProtocolo = valorInformadoProtocolo;
        this.valorProcessadoProtocolo = valorProcessadoProtocolo;
        this.valorLiberadoProtocolo = valorLiberadoProtocolo;
        this.valorGlosaProtocolo = valorGlosaProtocolo;
        this.relacaoGuias = relacaoGuiasList;
    }

    public double getNumeroLotePrestador() {
        return numeroLotePrestador;
    }

    public void setNumeroLotePrestador(double numeroLotePrestador) {
        this.numeroLotePrestador = numeroLotePrestador;
    }

    public double getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(double numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public String getDataProtocolo() {
        return dataProtocolo;
    }

    public void setDataProtocolo(String dataProtocolo) {
        this.dataProtocolo = dataProtocolo;
    }

    public double getSituacaoProtocolo() {
        return situacaoProtocolo;
    }

    public void setSituacaoProtocolo(double situacaoProtocolo) {
        this.situacaoProtocolo = situacaoProtocolo;
    }

    public double getValorInformadoProtocolo() {
        return valorInformadoProtocolo;
    }

    public void setValorInformadoProtocolo(double valorInformadoProtocolo) {
        this.valorInformadoProtocolo = valorInformadoProtocolo;
    }

    public double getValorProcessadoProtocolo() {
        return valorProcessadoProtocolo;
    }

    public void setValorProcessadoProtocolo(double valorProcessadoProtocolo) {
        this.valorProcessadoProtocolo = valorProcessadoProtocolo;
    }

    public double getValorLiberadoProtocolo() {
        return valorLiberadoProtocolo;
    }

    public void setValorLiberadoProtocolo(double valorLiberadoProtocolo) {
        this.valorLiberadoProtocolo = valorLiberadoProtocolo;
    }

    public double getValorGlosaProtocolo() {
        return valorGlosaProtocolo;
    }

    public void setValorGlosaProtocolo(double valorGlosaProtocolo) {
        this.valorGlosaProtocolo = valorGlosaProtocolo;
    }

    public List getRelacaoGuias() {
        return relacaoGuias;
    }

    public void setRelacaoGuias(List relacaoGuias) {
        this.relacaoGuias = relacaoGuias;
    }
}
