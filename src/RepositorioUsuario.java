import java.util.ArrayList;

public class RepositorioUsuario {

    ArrayList <Usuario> listaUsuarios = new ArrayList<>();

    public void adicionar(Usuario usuario) {

        listaUsuarios.add(usuario);
        System.out.println("Usuário add");
        usuario.log();

    }
    public void exibirQtd(){
        System.out.println("qtd de usuários: " + listaUsuarios.size());
    }


}
