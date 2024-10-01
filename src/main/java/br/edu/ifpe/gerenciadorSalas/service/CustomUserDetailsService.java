package br.edu.ifpe.gerenciadorSalas.service;

/*import br.edu.ifpe.gerenciadorSalas.model.Usuario;
import br.edu.ifpe.gerenciadorSalas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Busca o usuário pelo email
        Usuario usuario = usuarioRepository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email));
        
        // Retorna os detalhes do usuário, incluindo email e senha
        return org.springframework.security.core.userdetails.User
            .withUsername(usuario.getEmail())
            .password(usuario.getSenha()) // Aqui deve estar a senha criptografada
            .roles("USER") // Adicione papéis conforme necessário
            .build();
    }
}
*/