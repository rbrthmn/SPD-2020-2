package marcio;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class RelacaoGuias {
    @XStreamAlias(value = "ans:numeroGuiaPrestador")
    private String numeroGuiaPrestador;

    @XStreamAlias(value = "ans:")
    private String numeroGuiaOperadora;

    @XStreamAlias(value = "ans:numeroGuiaOperadora")
    private String senha;

    @XStreamAlias(value = "ans:nomeBeneficiario")
    private String nomeBeneficiario;

    @XStreamAlias(value = "ans:numeroCarteira")
    private String numeroCarteira;

    @XStreamAlias(value = "ans:dataInicioFat")
    private String dataInicioFat;

    @XStreamAlias(value = "ans:dataFimFat")
    private String dataFimFat;

    @XStreamAlias(value = "ans:horaFimFat")
    private String horaFimFat;

    @XStreamAlias(value = "ans:situacaoGuia")
    private String situacaoGuia;

    @XStreamAlias(value = "ans:valorInformadoGuia")
    private double valorInformadoGuia;

    @XStreamAlias(value = "ans:valorProcessadoGuia")
    private double valorProcessadoGuia;

    @XStreamAlias(value = "ans:valorLiberadoGuia")
    private double valorLiberadoGuia;

    @XStreamAlias(value = "ans:valorGlosaGuia")
    private double valorGlosaGuia;

    public RelacaoGuias(String numeroGuiaPrestador, String numeroGuiaOperadora, String senha, String nomeBeneficiario, String numeroCarteira, String dataInicioFat, String dataFimFat, String horaFimFat, String situacaoGuia, double valorInformadoGuia, double valorProcessadoGuia, double valorLiberadoGuia, double valorGlosaGuia) {
        this.numeroGuiaPrestador = numeroGuiaPrestador;
        this.numeroGuiaOperadora = numeroGuiaOperadora;
        this.senha = senha;
        this.nomeBeneficiario = nomeBeneficiario;
        this.numeroCarteira = numeroCarteira;
        this.dataInicioFat = dataInicioFat;
        this.dataFimFat = dataFimFat;
        this.horaFimFat = horaFimFat;
        this.situacaoGuia = situacaoGuia;
        this.valorInformadoGuia = valorInformadoGuia;
        this.valorProcessadoGuia = valorProcessadoGuia;
        this.valorLiberadoGuia = valorLiberadoGuia;
        this.valorGlosaGuia = valorGlosaGuia;
    }

    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    public void setNumeroGuiaPrestador(String numeroGuiaPrestador) {
        this.numeroGuiaPrestador = numeroGuiaPrestador;
    }

    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    public void setNumeroGuiaOperadora(String numeroGuiaOperadora) {
        this.numeroGuiaOperadora = numeroGuiaOperadora;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public String getDataInicioFat() {
        return dataInicioFat;
    }

    public void setDataInicioFat(String dataInicioFat) {
        this.dataInicioFat = dataInicioFat;
    }

    public String getDataFimFat() {
        return dataFimFat;
    }

    public void setDataFimFat(String dataFimFat) {
        this.dataFimFat = dataFimFat;
    }

    public String getHoraFimFat() {
        return horaFimFat;
    }

    public void setHoraFimFat(String horaFimFat) {
        this.horaFimFat = horaFimFat;
    }

    public String getSituacaoGuia() {
        return situacaoGuia;
    }

    public void setSituacaoGuia(String situacaoGuia) {
        this.situacaoGuia = situacaoGuia;
    }

    public double getValorInformadoGuia() {
        return valorInformadoGuia;
    }

    public void setValorInformadoGuia(double valorInformadoGuia) {
        this.valorInformadoGuia = valorInformadoGuia;
    }

    public double getValorProcessadoGuia() {
        return valorProcessadoGuia;
    }

    public void setValorProcessadoGuia(double valorProcessadoGuia) {
        this.valorProcessadoGuia = valorProcessadoGuia;
    }

    public double getValorLiberadoGuia() {
        return valorLiberadoGuia;
    }

    public void setValorLiberadoGuia(double valorLiberadoGuia) {
        this.valorLiberadoGuia = valorLiberadoGuia;
    }

    public double getValorGlosaGuia() {
        return valorGlosaGuia;
    }

    public void setValorGlosaGuia(double valorGlosaGuia) {
        this.valorGlosaGuia = valorGlosaGuia;
    }
}
