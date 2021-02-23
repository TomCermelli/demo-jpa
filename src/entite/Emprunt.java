package entite;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emprunt")
public class Emprunt {
	
	@Id
	private int id;
	
	@Column(name="DATE_DEBUT")
	private Date date_debut;
	
	@Column(name="DATE_FIN")
	private Date date_fin;
	
	@Column(name="DELAI")
	private int delai;
	
	@Column(name="ID_CLIENT")
	private int id_client;

}
