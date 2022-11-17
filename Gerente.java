public class Gerente extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica(int senha) {
        return true;
    }
}
