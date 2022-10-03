package contaExcessao.modulo.excessoes;

public class domainExceptions extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public domainExceptions(String msg) {
        super(msg);
    }
}

