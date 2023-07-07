package tratamento_de_excecoes;

class ExcecaoVerificada extends Exception {
    public ExcecaoVerificada(String mensagem) {
        super(mensagem);
    }
}

class ExcecaoNaoVerificada extends RuntimeException {
    public ExcecaoNaoVerificada(String mensagem) {
        super(mensagem);
    }
}

class A {
    public static void main(String[] args) {
        metodoA();
    }

    public static void metodoA() {
        metodoB();
        metodoC();
    }

    public static void metodoB() {
        try {
            lancaExcecaoVerificada();
        } catch (ExcecaoVerificada e) {
            System.out.println("Exceção verificada capturada em métodoB: " + e.getMessage());
        }
    }

    public static void metodoC() {
        try {
            lancaExcecaoNaoVerificada();
        } catch (ExcecaoNaoVerificada e) {
            System.out.println("Exceção não verificada capturada em métodoC: " + e.getMessage());
        }
    }

    public static void lancaExcecaoVerificada() throws ExcecaoVerificada {
        throw new ExcecaoVerificada("Exceção verificada lançada manualmente");
    }

    public static void lancaExcecaoNaoVerificada() {
        throw new ExcecaoNaoVerificada("Exceção não verificada lançada manualmente");
    }
}
