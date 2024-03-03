package composicao.exercicio03;

public class Documento {

    private String tipoDoDocumento;
    private String numeroDoDocumento;
    private String orgaoExpedidor;

    public Documento(String tipoDoDocumento, String numeroDoDocumento, String orgaoExpedidor) {
        this.tipoDoDocumento = tipoDoDocumento;
        this.numeroDoDocumento = numeroDoDocumento;
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getTipoDoDocumento() {
        return tipoDoDocumento;
    }

    public void setTipoDoDocumento(String tipoDoDocumento) {
        this.tipoDoDocumento = tipoDoDocumento;
    }

    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }
}
