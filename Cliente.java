public class Cliente implements Autenticavel {

    public String login;
    public int senha;

    @Override
    public boolean autentica(int senha) {
        return true;
    }
}
