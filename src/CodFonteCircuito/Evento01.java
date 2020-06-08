package CodFonteCircuito;
/**
 * Classe com a funcionalidade de criar eventos .
 */

public class Evento01 {

    /**
     *Variavel referencia os dados nome do eventos Cadastrado .
     */
        public String nome;
    /**
     * Variavel referencia os dados de Data de inicio do evento Cadastrado .
     */
        public String dataInicio;
    /**
     * Variavel referencia os dados de Data de termino do evento Cadastrado .
     */
        public String dataFim;
    /**
     * Variavel referencia os dados de Hora de inicio do evento Cadastrado .
     */
        public String horaInicio;
    /**
     * Variavel referencia os dados de hora de termino do evento Cadastrado .
     */
        public String horaFim;
    /**
     *  Variavel referencia os dados descricao do evento Cadastrado .
     */
        public String descricao;
    /**
     * Variavel criada para associor e vincular classes Eventos01 a classe Endereço .
     * Referencia os dados de endereço do evento Cadastrado
     */
        public Endereco01 enderecoEvento;
    /**
     * Variavel criada para associor e vincular classes Evento a classe Cadastro01.
     * Referencia os dados de usuario que está realizando cadastro do eventos .
     */
        public Cadastro01 usuarioCadastro;

        public Evento01(String nome, String dataInicio,
                        String dataFim, String horaInicio, String horaFim, String descricao) {
                this.nome = nome;
                this.dataInicio = dataInicio;
                this.dataFim = dataFim;
                this.horaInicio = horaInicio;
                this.horaFim = horaFim;
                this.descricao = descricao;
        }

    /**
     * @return Metodo criado para retornar nome do eventos.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome Variavel referencia os dados de nome do evento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Metodo criado para retornar Data de inicio do eventos.
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio Variavel referencia os dados de data de inicio do evento.
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return Metodo criado para retornar data de termino do evento.
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim Variavel referencia os dados de data de termino do eventos.
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return Metodo criado para retornar horario de inicio do evento.
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio Variavel referencia os dados Horario de inicio do eventos.
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return Metodo criado para retornar horario de termino do eventos.
     */
    public String getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim Variavel referencia os dados de horario de termino do evento.
     */
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * @return Metodo criado para retornar descricao do evento.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao Variavel referencia os dados de descricao  do evento.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return Metodo criado para retornar endereço do evento.
     */
    public Endereco01 getEnderecoEvento() {
        return enderecoEvento;
    }

    public void setEnderecoEvento(Endereco01 enderecoEvento) {
        this.enderecoEvento = enderecoEvento;
    }

    /**
     * Metodo criado para alterar informacoes do eventos.
     */
    public void alterarEvento (){
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.descricao = descricao;
    }

}
