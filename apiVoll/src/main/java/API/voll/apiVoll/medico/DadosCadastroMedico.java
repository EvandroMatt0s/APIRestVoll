package API.voll.apiVoll.medico;

import API.voll.apiVoll.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
                                  DadosEndereco endereco) {
}
