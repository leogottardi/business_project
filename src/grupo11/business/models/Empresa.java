package grupo11.business.models;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Empresa
{
    private String nome;
    private LocalDateTime dataFundacao;
    private CodigoPostal codigoPostal;
    private HashMap<String, Pessoa> funcionarios;

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public LocalDateTime getDataFundacao()
    {
        return this.dataFundacao;
    }

    public void setDataFundacao(LocalDateTime dataFundacao)
    {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(CodigoPostal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
