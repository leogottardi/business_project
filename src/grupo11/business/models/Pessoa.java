package grupo11.business.models;

public class Pessoa
{
    private String nome;
    private long contribuinte;
    private int idade;
    private CodigoPostal codigoPostal;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public long getContribuinte()
    {
        return contribuinte;
    }

    public void setContribuinte(long contribuinte)
    {
        this.contribuinte = contribuinte;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public CodigoPostal getCodigoPostal()
    {
        return codigoPostal;
    }

    public void setCodigoPostal(CodigoPostal codigoPostal)
    {
        this.codigoPostal = codigoPostal;
    }
}
