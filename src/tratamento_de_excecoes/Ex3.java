package tratamento_de_excecoes;

class DadoInvalidoException extends Exception {
    public DadoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class RepositorioException extends Exception {
    public RepositorioException(String mensagem) {
        super(mensagem);
    }
}

class ClienteJaExistenteException extends Exception {
    public ClienteJaExistenteException(String mensagem) {
        super(mensagem);
    }
}

class ClienteInexistenteException extends Exception {
    public ClienteInexistenteException(String mensagem) {
        super(mensagem);
    }
}

class Cliente {
    private String cpf;

    public Cliente(String cpf) throws DadoInvalidoException {
        if (!validarCPF(cpf)) {
            throw new DadoInvalidoException("CPF inválido");
        }
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) throws DadoInvalidoException {
        if (!validarCPF(cpf)) {
            throw new DadoInvalidoException("CPF inválido");
        }
        this.cpf = cpf;
    }

    
}

class CadastroCliente {
    private Cliente[] clientes;
    private int quantidadeClientes;

    public CadastroCliente() {
        this.clientes = new Cliente[10];
        this.quantidadeClientes = 0;
    }

    public void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException {
        if (quantidadeClientes >= clientes.length) {
            throw new RepositorioException("Não é possível inserir mais clientes. O repositório está cheio.");
        }

        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getCPF().equals(cliente.getCPF())) {
                throw new ClienteJaExistenteException("Já existe um cliente cadastrado com o CPF informado.");
            }
        }

        clientes[quantidadeClientes] = cliente;
        quantidadeClientes++;
    }

    public Cliente buscar(String cpf) throws ClienteInexistenteException {
        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getCPF().equals(cpf)) {
                return clientes[i];
            }
        }
        throw new ClienteInexistenteException("Cliente com o CPF informado não encontrado.");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        CadastroCliente cadastro = new CadastroCliente();

        try {
            Cliente cliente1 = new Cliente("12345678901");
            cadastro.inserir(cliente1);

            Cliente cliente2 = new Cliente("23456789012");
            cadastro.inserir(cliente2);

            Cliente cliente3 = new Cliente("34567890123");
            cadastro.inserir(cliente3);

            Cliente cliente4 = new Cliente("12345678901"); // CPF repetido
            cadastro.inserir(cliente4); // Deve lançar a exceção ClienteJaExistenteException

            Cliente clienteEncontrado = cadastro.buscar("23456789012");
            System.out.println("Cliente encontrado: " + clienteEncontrado.getCPF());

            Cliente clienteNaoEncontrado = cadastro.buscar("99999999999");
            System.out.println("Cliente encontrado: " + clienteNaoEncontrado.getCPF()); // Deve lançar a exceção ClienteInexistenteException
        } catch (DadoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (RepositorioException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ClienteJaExistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ClienteInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
