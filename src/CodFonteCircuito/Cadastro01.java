package CodFonteCircuito;

import java.awt.desktop.SystemSleepEvent;

/**
 * Classe com funcionalidade de criacao no cadastro do usuário.
 */
public class Cadastro01 {

    /**
     *  Variavel numDoc referencia ao dados de numero de docomento do usuario.
     */
    protected int numDoc;

    /**
     * Variavel nome  referencia ao dados nome do usuario.
     */
    protected String nome;
    /**
     * Varivavel Sobrenome referencia ao dados Sobrenome do usuario.
     */
    protected String sobrenome;
    /**
     *  Variavel CodDeAtivaçao referencia a status do cadastro (true para ativo e false inativo).
     */
    protected boolean CodDeAtivacao;
    /**
     * Variavel codDeCnpj criada para identficar se usuario é classificado como pessoa Juridica OU Pessoa Fisica ,
     * sendo true para pessoa juridica.
     */
    protected boolean codDeCnpj;
    /**
     * Variavel que refenrencia e vincula classe de usuario ao cadastro.
     */
    Usuario01 usuarioVinculado;

    /**
     * @return getNumDoc Medoto criado para retonar numero de documento do usuário.
     */
    public int getNumDoc() {

        return numDoc;
    }

    /**
     * @param numDoc Metodo para armazenar numero de documento do usuario.
     */
    public void setNumDoc(

            int numDoc) {


        this.numDoc = numDoc;
    }

    /**
     * @return getNome Metodo criado para retornar nome do usuario.
     */
    public String getNome() {

        return nome;
    }

    /**
     * @param nome Metodo criado para armazenar nome do usuario como parametro.
     */
    public void setNome(String nome) {


        this.nome = nome;
    }

    /**
     * @return getSobrenome Metodo criado retornar sobrenome do usuário.
     */
    public String getSobrenome() {

       return sobrenome;
    }

    /**
     * @param sobrenome criado para armazenar sobrenome do usuário.
     */
    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }


    /**
     * Metdo criado para realizar cadastro do usuario.
     */
    public void cadastrar(){

        this.numDoc=numDoc;
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.CodDeAtivacao = true;

        if(codDeCnpj== true){

            System.out.print("***** Cadastrado CLIENTE JURIDICO .***** \n");
            System.out.println(codDeCnpj);
        } else {

            System.out.println("Cadastro realizado com sucesso . ");

        }
        System.out.println(this.getNome() + getSobrenome());
        System.out.println(this.getNumDoc());
    }

    /**
     * Metodo alterarCadastro criado para alterar cadastro do usuario.
     */
    public void alterarCadastro(){

        this.nome = nome;
        this.sobrenome = sobrenome;
        System.out.print("Cadastro alterado com Sucesso . ");

    }

    /**
     * Metodo deletar Cadastro criado para desativar usuario na aplicacao
     */
    public void deletarCadastro(){

        this.CodDeAtivacao = false;
        this.codDeCnpj= false;
        System.out.println("Cadastro DELETADO COM SUCESSO . ");

    }


}
