package CodFonteCircuito;

import com.sun.jdi.event.StepEvent;

/**
 * Classe com funcionalidade de criar as categorias de eventos.
 * {"Esporte","Apresentação","Parque","Park de Diversão","Shopping","Hospedagem","Camping","Restaurantes" };
 */

public class Categorias {

    /**
     * Vetor Modalidade criado para armazenamento das categorias preferencias do usuario.
     */
    public String[] modalidades = new String[8];
    /**
     * Variavel criada para associor e vincular classes Categorias a classe perfil01 .
     * Referencia aos dados de perfil do usuario.
     */
    Perfil01 perfilUsuario;

    /**
     * Metodo para armazenar para visualizacao de categorias cadastrada pelo usuario.
     */
    public void ConsultarCategorias() {
        for(int b =0 ; b< 9 ; b++){
            System.out.println("Modalidade "+b + " ° :"+ modalidades[b]);
        }

    }
    /**
     * @param modalidades Metodo criado para referenciar as informaçao de categorias cadastrada pelo usuario .
     */
    public void setModalidade(String[] modalidades) {
        for (int i = 0; i < 7; i++)
            modalidades[i] = modalidades[i];
    }
    /**
     * @return Metodo criado para retornar categorias cadastrada pelo usuario .
     */
    public String[] getModalidades (){
        for (int y = 0; y< 8; y++)
        System.out.println(modalidades[y]);
        return modalidades;
    }
}

