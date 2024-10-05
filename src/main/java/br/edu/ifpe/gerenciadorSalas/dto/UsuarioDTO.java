package br.edu.ifpe.gerenciadorSalas.dto;

import br.edu.ifpe.gerenciadorSalas.model.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {
    private String nome;
    private TipoUsuario tipo;
}
