package CodFonteCircuito;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe com funcionalidade de criacao do perfil do Usuario.
 */
public class Perfil01 {
    /**
     * Variavel cidade referencia ao dados nome da Cidade do usuario.
     */
    private String cidade;
    /**
     * Variavel bairro referencia ao dados nome de bairro do usuario.
     */
    private String bairro;
      /**
     * Variavel criada para referenciar numero de dependentes do usuario.
     */
    private int dependentes;
    /**
     * Variavel criada para referenciar o valor de soma de idade dos dependentes do usuario.
     * Considerção: será calculda a meédia para imprimir média de idades os dependentes.
     */
    public int idade;
    /**
     * Variavel criada para associor e vincular classes Usuario a classe Perfil01
     */
    Usuario01 usuario;
    /**
     *  Variavel criada para associor e vincular classes endereço a classe Perfil01.
     */
    Endereco01 endereco;

    /**
     * Criado uma lista para armazenar Categorias preferencias do usuario.
     */
   ArrayList<Categorias> listPreferencia;
    /**
     * Criado uma lista para armazenar Categorias preferencias do  parceiro(a) do usuario.
     */
   ArrayList<Categorias> listPreferenciaParceio;

    /**
     * @return Metodo criado para retornar dados de cidade  do usuario.
     */
    public String getCidade() {

        return cidade;
    }

    /**
     * @param cidade Metodo para armazenar nome de cidade do usuario.
     */
    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    /**
     * @return Metodo criado para retornar dados de bairro  do usuario.
     */
    public String getBairro() {

        return bairro;
    }

    /**
     * @param bairro Metodo para armazenar nome de bairro do usuario.
     */
    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    /**
     * @return Metodo criado para retornar dados de Numero de dependentes  do usuario.
     */
      public int getDependentes() {

        return dependentes;
    }

    /**
     * @param dependentes Metodo para armazenar numero de dependentes do usuario.
     */
    public void setDependentes(int dependentes) {

        this.dependentes = dependentes;
    }

    /**
     * @return Metodo criado para retornar média de idade dos dependentes do  usuario.
     */
    public int getIdade() {

        return idade;
    }

    /**
     * @param idade Metodo para armazenar Somo de idades dos dependentes do usuario.
     * @param dependentes  Metodo para armazenar numero de dependentes do usuario.
     */
    public void setIdade(int idade, int dependentes) {

        this.idade = idade/dependentes;
        System.out.println("Média de idade : " + this.idade);
    }

    /**
     * Criado metodo para alterar nome de cidade e bairro do usuario.
     */
    public void AlterarPerfil() {
        System.out.println("\n Alteração de perfil :\n ");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite nome da cidade desejada : ");
            this.cidade = input.next();
            System.out.println("Digite nome no bairro desejado : ");
            this.bairro = input.next();

        }


    }
}
