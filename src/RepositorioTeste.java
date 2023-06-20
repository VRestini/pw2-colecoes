public class RepositorioTeste {

    public static void main(String[] args) {

        RepositorioUsuario repositorio = new RepositorioUsuario();

        Usuario u1 = new Usuario();
        u1.setNome("admin");
        u1.setSenha("admin123");
        repositorio.adicionar(u1);
        repositorio.exibirQtd();

        Usuario u2 = new Usuario();
        u2.setNome("financeiro");
        u2.setSenha("fin123");
        repositorio.adicionar(u2);
        repositorio.exibirQtd();
    }

}
