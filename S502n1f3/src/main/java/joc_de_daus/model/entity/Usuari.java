package joc_de_daus.model.entity;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuari implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Size(min = 3, message = "Error: El username ha de tenir una longitut mínima de 3 caracters")
	@Size(max = 20, message = "Error: El username ha de tenir una longitut de com a màxim 20 caracters")
	@NotNull(message = "Error: Username no informat")
	private String username;
	@Size(min = 8, message = "Error: El password ha de tenir una longitut mínima de 8 caracters")
	@Size(max = 128, message = "Error: El password ha de tenir una longitut de com a màxim 128 caracters")
	@NotNull(message = "Error: Password no informat")
	private String password;
	
	public Usuari() {
		
	}

	public Usuari(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}	
}
