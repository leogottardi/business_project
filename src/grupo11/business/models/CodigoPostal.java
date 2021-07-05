package grupo11.business.models;

public class CodigoPostal
{
    private int indicativo;
    private int extensao;
    private String zona;

    public CodigoPostal(int indicativo, int extensao, String zona) {
        this.indicativo = indicativo;
        this.extensao = extensao;
        this.zona = zona;
    }

    public int getIndicativo()
    {
        return indicativo;
    }

    public void setIndicativo(int indicativo)
    {
        this.indicativo = indicativo;
    }

    public int getExtensao()
    {
        return extensao;
    }

    public void setExtensao(int extensao)
    {
        this.extensao = extensao;
    }

    public String getZona()
    {
        return zona;
    }

    public void setZona(String zona)
    {
        this.zona = zona;
    }

    public String mostrar() {
        String infoCodigoPostal = "Indicativo: " + this.getIndicativo() +
                ", Extensao: " + this.getExtensao() +
                ", Zona: " + this.getZona() + ".";

        return infoCodigoPostal;
    }
}
