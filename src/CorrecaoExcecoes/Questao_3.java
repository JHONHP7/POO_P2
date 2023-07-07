package CorrecaoExcecoes;


//Classe de exceção para dados inválidos
class DadoInvalidoException extends Exception {
 public DadoInvalidoException(String mensagem) {
     super(mensagem);
 }
}

//Classe de exceção para o caso de não ser possível adicionar mais clientes
class RepositorioException extends Exception {
 public RepositorioException(String mensagem) {
     super(mensagem);
 }
}

//Classe de exceção para o caso de um cliente já existir no cadastro
class ClienteJaExistenteException extends Exception {
 public ClienteJaExistenteException(String mensagem) {
     super(mensagem);
 }
}

//Classe de exceção para o caso de um cliente não existir no cadastro
class ClienteInexistenteException extends Exception {
 public ClienteInexistenteException(String mensagem) {
     super(mensagem);
 }
}

//Classe Cliente com atributos, getters e setters
class Cliente {
 private String cpf;

 public Cliente(String cpf) throws DadoInvalidoException {
     setCpf(cpf);
 }

 public String getCpf() {
     return cpf;
 }

 public void setCpf(String cpf) throws DadoInvalidoException {
     if (cpf == null || cpf.isEmpty()) {
         throw new DadoInvalidoException("CPF inválido");
     }
     this.cpf = cpf;
 }
}

//Classe CadastroCliente
class CadastroCliente {
 private static final int TAMANHO_MAXIMO = 10;
 private Cliente[] clientes;
 private int quantidade;

 public CadastroCliente() {
     clientes = new Cliente[TAMANHO_MAXIMO];
     quantidade = 0;
 }

 public void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException {
     if (quantidade >= TAMANHO_MAXIMO) {
         throw new RepositorioException("Não é possível adicionar mais clientes");
     }

     for (int i = 0; i < quantidade; i++) {
         if (clientes[i].getCpf().equals(cliente.getCpf())) {
             throw new ClienteJaExistenteException("Cliente já cadastrado");
         }
     }

     clientes[quantidade] = cliente;
     quantidade++;
 }

 public Cliente buscar(String cpf) throws ClienteInexistenteException {
     for (int i = 0; i < quantidade; i++) {
         if (clientes[i].getCpf().equals(cpf)) {
             return clientes[i];
         }
     }
     throw new ClienteInexistenteException("Cliente não encontrado");
 }
}

//Classe de teste
public class Questao_3 {
 public static void main(String[] args) {
     CadastroCliente cadastro = new CadastroCliente();

     try {
         Cliente cliente1 = new Cliente("11111111111");
         cadastro.inserir(cliente1);
         System.out.println("Cliente 1 inserido com sucesso");

         Cliente cliente2 = new Cliente("22222222222");
         cadastro.inserir(cliente2);
         System.out.println("Cliente 2 inserido com sucesso");

         // Tentando inserir um cliente com o mesmo CPF
         Cliente cliente3 = new Cliente("11111111111");
         cadastro.inserir(cliente3);
         System.out.println("Cliente 3 inserido com sucesso");
     } catch (RepositorioException | ClienteJaExistenteException | DadoInvalidoException e) {
         System.out.println("Erro ao inserir cliente: " + e.getMessage());
     }

     try {
         // Buscando um cliente existente
         Cliente clienteEncontrado = cadastro.buscar("22222222222");
         System.out.println("Cliente encontrado: " + clienteEncontrado.getCpf());

         // Buscando um cliente inexistente
         Cliente clienteInexistente = cadastro.buscar("33333333333");
         System.out.println("Cliente encontrado: " + clienteInexistente.getCpf());
     } catch (ClienteInexistenteException e) {
         System.out.println("Erro ao buscar cliente: " + e.getMessage());
     }
 }
}
