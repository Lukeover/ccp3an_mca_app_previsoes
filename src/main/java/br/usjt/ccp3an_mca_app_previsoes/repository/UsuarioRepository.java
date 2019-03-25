package br.usjt.ccp3an_mca_app_previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.ccp3an_mca_app_previsoes.model.bean.Usuario;
@Repository
public interface UsuarioRepository 
					extends JpaRepository<Usuario, Long>{
	public Usuario findOneByLoginAndSenha (String login, String senha);

}
