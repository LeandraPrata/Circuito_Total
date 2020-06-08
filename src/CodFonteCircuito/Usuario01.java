package CodFonteCircuito;

import java.util.Random;
/**
*   Classe com funcionalidade na criacao de dados de acesso do usuario (e mail e senha ).
 */

public class Usuario01 extends  Cadastro01 {
    /**
     * Classe Usuario01 extends Classe01 ,ou seja , classe01 irá herdar todos os atribuitos da classe Usuario01.
     */

    Random aleatorio = new Random();

    /**
     * Variavel id referencia codigo do usuario que gerar gerado automaticamente pelo metodo aleatorio.
     */
    public int Id= aleatorio.nextInt();
    /**
     * Variavel email referencia ao dados de e mail do usuario.
     */
   public String email;
    /**
     * Variavel Senha referencia ao dados de senha do usuario.
     */
    public String senha;

    /**
     *referencia a status do cadastro (true para ativo e false inativo).
     */
    public boolean CodAtivo;
    /**
     * Variavel que irá associar classe de usuario01 com a classe de perfil01; Vincula o perfil com o usuario.
     */
    Perfil01 perfil;
    /**
     * Variavel que irá associar classe de Cadastro01 com a classe de perfil01; Vincula o cadastro como o usuario.
     */
    Cadastro01 cadastro;

    /**
     * @param perfil Variavel que irá identificar o perfil do usuario.
     */
    public void AdicionarPerfil(Perfil01 perfil){
        perfil= perfil;
    }


    /**
     * Metodo construtor criado para gerar dados dos usuario ,
     */
    public void Usuario01() {

        this.email = email;
        this.senha = senha;
        CodAtivo = true;
    }

    /**
     * @return Metodo criado para retornar Codigo  do usuario.
     */
    public int getId() {

        return Id;
    }

    /**
     * @param cod Metodo para armazenar numero de documento do usuario.
     */
    public void setId(int cod) {

        Id = cod ;

    }

    /**
     * @return Metodo criado para retornar e mail do usuario.
     */
    public String getEmail() {

        return email;
    }

    /**
     * @param email Metodo para armazenar e mail do usuario.
     */
    public void setEmail(String email) {

        this.email = email;
    }

    /**
     * @return Metodo criado para retornar dados de Senha  do usuario.
     */
    public String getSenha() {

        return senha;
    }

    /**
     * @param senha Metodo para armazenar senha do usuario.
     */
    public void setSenha(String senha) {

        this.senha = senha;
    }

    /**
     * @return Metodo criado para retornar status atual do cleinte do usuario.( true para ativa e false para inativo).
     */
    public boolean getCodAtivo() {


        return CodAtivo;
    }

    public void setCodAtivo(boolean codAtivo) {

        CodAtivo = codAtivo;
    }


    /**
     * @param confemail Variavel criada no classe principal para validar dados de e mail do usuario.
     * @param confSenha Variavel criada no classe principal para validar dados de senha do usuario.
     */
    public void logarUsuario (String confemail , String  confSenha) {
        if ((this.getEmail().equalsIgnoreCase(confemail)) && (this.getSenha().equalsIgnoreCase(confSenha))) {
            System.out.println("Numero do cadastro: " + this.Id);
            System.out.println(" *****  EXECUTANDO LOGIN  *****");

          } else {
            System.out.println("******  DADOS INVALIDOS *****");

        }

    }

    /**
     * @param senha Variavel criada na classe principal capturar dados de registro de nova senha do usuario.
     */
    public void CadastrarNovosDados(String senha ) {
        Usuario01.this.setSenha(senha);
        System.out.print(" Senha Cadastrada : " + this.getSenha());

    }

    /**
     * Metodo criado para alterar perfil do usuario.
     */
    public void AdicionarPerfil() {
        perfil = perfil;
    }

    /**
     * Metodo criado para desativar usuário;
     */
    public void DesativarUsuario(){
        this.setCodAtivo(false);
    }
}
