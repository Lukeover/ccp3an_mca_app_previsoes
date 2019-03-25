package br.usjt.ccp3an_mca_app_previsoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ccp3an_mca_app_previsoes.model.bean.Usuario;
import br.usjt.ccp3an_mca_app_previsoes.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
	return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
	 usuario.getSenha()) != null;
	}


}
