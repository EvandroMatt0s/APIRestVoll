package API.voll.apiVoll.medico;

import API.voll.apiVoll.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,

        String nome,
        String telefone,
        DadosEndereco endereco) {
}
