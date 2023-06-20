public class Usuario {

    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<senha.length(); i++) {
            builder.append("*");
        }
        return builder.toString();
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void log() {
        System.out.println("Usuário: " + nome);
        System.out.println("Senha: " + getSenha());
    }



}
