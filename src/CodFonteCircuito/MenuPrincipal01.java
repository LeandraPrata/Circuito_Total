package CodFonteCircuito;

/**
 * Atividade : Projeto Integrador III.
 * Centro Universitário Newton Paiva.
 * @author:  Leandra Prata Oliveira RA 12104421
 *          Rodrigo da Mota Correa RA 12104963
 *          Lucas Trajano Pimenta  RA 12103769
 * @since 07 junhho 2020.
 * @version 1.0
 *
 * Consideracao: Atvidade de programação orientção à objeto.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Classe Principal .
 * Consideracao : Classe criada para instanciar classe da aplicacao e tester algumas funcionalidade.
 */
public class MenuPrincipal01 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                //*A Aplicação irá iniciar com a tela de Login e cadastro , para que o usuário possa entrar na aplicação */
                System.out.println("\n**********C I R C U I T O    T O T A L  ****************");
                System.out.println("\n**********S E J A  B E M  V I N D O **************");
                System.out.println("***************TELA DE CADASTRO ***************** ");
                int opcao = 0;
                System.out.println("[1] - Realizar Cadastro . \n[2] - Alterar Cadastro \n[3]- Deletar Cadastro . ");
                System.out.println("Digite a opção desejada . ");
                do {
                        //*Instanciada a classe Cadastro*/
                        Cadastro01 cadastro1 = new Cadastro01();
                        cadastro1.setNome("Ana Carolina ");
                        cadastro1.setSobrenome("Mendes Pereira ");
                        cadastro1.setNumDoc(123456);
                        System.out.print("\nOpção : ");
                        //* O usuário deverá selecionar a opção da operação que deseja realiza */
                        opcao = input.nextInt();
                        Cadastro01 cadastroUsuario = new Cadastro01();
                        //* Entrada de opção */
                        switch (opcao) {
                                case 1:
                                        int codCnpj = 0;
                                        //* Usuaário deverá selecionar a classificação (tipo) do usuário*/
                                        System.out.print("Digite o tipo de classificação do usuário . \n [1] - Pessoa Fisica ." +
                                                "\n [2] - Pessoa juridica .\n");
                                        System.out.print("Opção : ");
                                        codCnpj = input.nextInt();
                                        //*Entrada de opção */
                                        if (codCnpj == 2) {
                                                cadastro1.codDeCnpj = true;
                                                cadastro1.cadastrar();
                                        } else {
                                                cadastro1.codDeCnpj = false;
                                                cadastro1.cadastrar();
                                        }
                                        break;
                                case 2:
                                        //* Menu para alterar cadastro*/
                                        System.out.print("Digite nome para alterar : ");
                                        cadastro1.setNome(input.next());
                                        System.out.print("Digite Sobrenome para alterar  :");
                                        cadastro1.setSobrenome(input.next());
                                        cadastro1.alterarCadastro();
                                        break;
                                case 3:
                                        //* Menu para deletar cadastro*/
                                        cadastroUsuario.deletarCadastro();
                                        break;
                                default:
                                        System.out.print("Opção Invalida ! \n");
                        }

                } while (opcao != 1 && opcao != 2 && opcao != 3);
                //* Tela DE lOGIN
                System.out.println("\n**************** C I R C U I T O    T O T A L  **********************");
                System.out.println("-----------------T E L A    D E    L O G I N  ---------------------  ");
                //* Cliente deverá selecionar opção de cadastro*/
                System.out.print("Digite a opção desejada .\n[1]-Realizar Login. \n[2]- Esqueci Usuário e Senha .\n");
                //*Instanciada a classe Usuario*/
                Usuario01 usuario1 = new Usuario01();
                usuario1.setEmail("anacarol@yahoo.com.br");
                usuario1.setSenha("45698");


                do {
                        //* entrada de opcão */
                        System.out.print("\n Opção: ");
                        opcao = input.nextInt();
                        //* Criado objeto para capturar dados de e- mail e senha , Obejtivo : Realizar teste*/
                        Usuario01 verificar = new Usuario01();
                        switch (opcao) {
                                case 1:
                                        boolean codVal = false;
                                        //* Usuário terá três tentativas , após exceder numero de tentativas , aplicação pedirá ao usuário ao usuário cadastar nova senha com validação de e- mail*/
                                        int numTentativa= 0;
                                        do {
                                                do {
                                                        //* Laço de repetição para validar e- mail e senha do usuário*/
                                                        Usuario01 usuario = new Usuario01();
                                                        System.out.print("E- mail : ");
                                                        usuario.email = input.next();
                                                        System.out.print("Senha :");
                                                        usuario.senha = input.next();

                                                        if ((usuario1.getEmail().equalsIgnoreCase(usuario.email)) && (usuario1.getSenha().equalsIgnoreCase(usuario.senha))) {
                                                                System.out.println(" *****  EXECUTANDO LOGIN  *****");
                                                                codVal = true;
                                                                numTentativa = 4;
                                                                break;
                                                        } else {
                                                                //* Laço de repetição para validar e- mail e senha do usuário*/
                                                                numTentativa = numTentativa + 1;
                                                                System.out.println("Numero de Tentativa : " + numTentativa);
                                                                System.out.println("******  DADOS INVALIDOS *****");
                                                                if (numTentativa > 3 ){
                                                                        //* Usuário deverá realizar troca de senha */
                                                                        System.out.println("Você excedeu o limite de tentativas ,  cadastre NOVA SENHA !");
                                                                        Usuario01 redefinir = new Usuario01();
                                                                        System.out.print("Digite o E- mail : ");
                                                                        redefinir.email = input.next();
                                                                        if (redefinir.email.equalsIgnoreCase(usuario1.email)) {
                                                                                Usuario01 verificacao = new Usuario01();
                                                                                System.out.print("Digite uma nova senha : ");
                                                                                redefinir.senha= input.next();
                                                                                verificacao.CadastrarNovosDados(redefinir.senha);
                                                                                System.out.println("\nOperação realizada com Sucesso .");
                                                                                break;
                                                                        } else {
                                                                                //* Condição de e- amil não válidado pela aplicação */
                                                                                System.out.println("Dados Invalidos . ");
                                                                        }
                                                                        break;
                                                                }
                                                        }
                                                }while(numTentativa == 3);
                                        }  while(codVal != true );
                                        break;
                                case 2:
                                        //* Código para redefinir senha */
                                        Usuario01 redefinir = new Usuario01();
                                        System.out.print("Digite o E- mail : ");
                                        redefinir.email = input.next();
                                        if (redefinir.email.equalsIgnoreCase(usuario1.email)) {
                                                //* condição de validação de e- mail*/
                                                Usuario01 verificacao = new Usuario01();
                                                System.out.print("Digite uma nova senha : ");
                                                redefinir.senha= input.next();
                                                redefinir.CadastrarNovosDados(redefinir.senha);
                                                System.out.println("\nOperação realizada com Sucesso .\n");
                                        } else {
                                                System.out.println("Dados Invalidos . ");
                                        }
                                        break;
                                default:
                                        System.out.print("Opção Inválida . ");
                        }
                } while (opcao != 1 && opcao != 2);
                System.out.println("**********************  C I R C U I T O    T O T A L  **************************");
                System.out.println("-----------------  P E R F I L    D O     U S U A R I O  ---------------------  ");
                //*Instanciada a classe Perfil*/
                Perfil01 perfil01 = new Perfil01();
                perfil01.setCidade("Belo Horizonte");
                perfil01.setBairro("Prado");

                System.out.println("Cidade : " + perfil01.getCidade());
                System.out.println("Bairro : " + perfil01.getBairro());
                //Código para armazenar média de idades dos dependentes*/
                perfil01.setIdade(20, 2);

                System.out.println("\nSelecione as suas categorias desejadas : ");
                Categorias ConsultarCategorias = new Categorias();
                System.out.println(ConsultarCategorias.getModalidades());

                System.out.println("Informe quantas categorias que deseja cadastrar : ");
                int numCategorias = input.nextInt();

                System.out.println("Selecione a categorias desejadas do seu PARCEIROS(A): ");


                System.out.println("Digite Número de Dependentes : ");
                int numDepen = input.nextInt();
                perfil01.setDependentes(numDepen);

                System.out.println("Digite idade dos seus dependentes: ");

                System.out.println("Digite 'S' para encerrar : ");

                String fimIdade;
                int idadesDependes[]= new int[numDepen];
                System.out.println(numDepen);

                int y =0;
                int idadeTotal =0;
                //* Laço de repetição para armazenar idades dos dependentes*/
                do {
                        y++;
                        idadeTotal += idadeTotal;

                        System.out.println("Digite idade do "+ y + "° dependente : " );
                        idadesDependes[y]= input.nextInt();
                        System.out.println("Deseja encerrar ? ");
                        fimIdade = input.next();
                        if (fimIdade.equalsIgnoreCase("Sim")){
                                break;
                        }
                } while (fimIdade.equalsIgnoreCase("Sim"));
                //* Armazenando dados de soma de idades e numeros de dependentes */
                perfil01.setIdade(idadeTotal , numDepen );
                perfil01.getIdade();

                System.out.println("********************   C I R C U I T O    T O T A L  ****************");
                System.out.println("----------------- C A D A S T R A R   E V E N T O S  ---------------------  ");
                //*Instanciada a classe Eventos */
                Evento01 eventoTambor = new Evento01("Oficina de Tambor","19/07/2020",
                        "21/07/2020","17:00", "19:00","Apresentação de Tambor" );

                System.out.println("********************   C I R C U I T O    T O T A L  ****************");
                System.out.println("----------------- C A D A S T R O   D E  E N D E R E Ç O ---------------------  ");
                //*Instanciada a classe Endereço */
                Endereco01 endereco001 = new Endereco01();
                endereco001.setCidade("Belo Horizonte");
                endereco001.setBairro("Prado");
                endereco001.setRua("Ituiutaba");
                endereco001.setNum("339");
                System.out.println(endereco001.getBairro());
                System.out.println(endereco001.getBairro());
                System.out.println(endereco001.getRua());
                System.out.println(endereco001.getNum());
                // Código de associação entre classe eventos e endereços /
                eventoTambor.setEnderecoEvento(endereco001);
                endereco001.AdicionarEventos(eventoTambor);
        }
}
