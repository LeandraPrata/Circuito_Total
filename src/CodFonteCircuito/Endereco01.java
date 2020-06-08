package CodFonteCircuito;

import java.util.ArrayList;

/**
 * Classe com funcionalidade de criacat das estrutura de endereços para eventos e usuarios. .
 */

public class Endereco01 {
    /**
     * Variavel referencia os dados nome de Cidade cadastrada pelo usuario.
     */
    private String cidade;
    /**
     *  Variavel referencia os dados nome de Bairro cadastrada pelo usuario.
     */
    private String bairro;
    /**
     *  Variavel referencia os dados nome de Rua cadastrada pelo usuario.
     */
    private String rua;
    /**
     *  Variavel referencia os dados numeração de endereço cadastrada pelo usuario.
     */
    private String num;

    /**
     * Vetor criado para armazenar lista de eventos vinculados ao endereço;
     * Consideracao : Em lugar comercias como teatros , etc poderá haver no mesmo endereco varios eventos.
     */
    ArrayList<Evento01> listEventos;
    private Object Evento01;

    /**
     * @param evento Metodo para armazenar na list de Eventos mais de um eventos do endereco .
     */
    public void AdicionarEventos(Evento01 evento){

        listEventos.add(evento);
    }

    /**
     * @param evento Metodo para remover na lista de  Eventos varios eventos do endereço .
     */
    public void excluirEvento(Evento01 evento){
        listEventos.remove(evento);
    }

    public void Endereco01(String cidade, String bairro, String rua, String num) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.num = num;
    }

    /**
     * @return Metodo criado para retornar nome da cidade dos endereço cadastrado.
     */
    public String getCidade() {

        return cidade;
    }

    /**
     * @param cidade Variavel referencia os dados de nome da cidade dos endereço cadastrado.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return Metodo criado para retornar nome da Bairro dos endereço cadastrado.
     */
    public String getBairro() {

        return bairro;
    }

    /**
     * @param bairro Variavel referencia os dados de nome da Bairro dos endereço cadastrado.
     */
    public void setBairro(String bairro) {

        bairro = bairro;
    }

    /**
     * @return Metodo criado para retornar nome da Rua dos endereço cadastrado.
     */
    public String getRua() {

        return rua;
    }

    /**
     * @param rua Variavel referencia os dados de nome de Rua dos endereço cadastrado.
     */
    public void setRua(String rua) {
        rua = rua;
    }

    /**
     * @return Metodo criado para retornar numero  dos endereço cadastrado.
     */
    public String getNum() {

        return num;
    }

    /**
     * @param num Variavel referencia os dados de numeracao dos endereço cadastrado.
     */
    public void setNum(String num) {

        this.num = num;
    }

    /**
     * Metodo criado para alterar endereco.
     * @param cidade Variavel referencia os dados nome de Cidade cadastrada pelo usuario.
     * @param bairro  Variavel referencia os dados nome de Bairro cadastrada pelo usuario.
     * @param rua  Variavel referencia os dados numeração de endereço cadastrada pelo usuario.
     * @param num  Vetor criado para armazenar lista de eventos vinculados ao endereço.
     */
    public void alterarEndereco(String cidade, String bairro, String rua, String num){
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.num = num;
    }

    /**
     * Metodo criado para consulta de endereço.
     */
    public void ConsultarEndereco(){
        System.out.println("Endereço Cadastrado .");
        System.out.println("\nCidade: " +this.getCidade()+ "\nBairro : "+ this.getBairro()+ "\n Rua :"+ this.getRua()+ "    N° : "+this.getNum());
    }
}

