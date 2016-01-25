package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Version;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import java.sql.Timestamp;



@Entity
@Table(name="diretor")
public class Diretor extends Model{
    
    //private static final long serialVersionUID = 1L;
    
    @Id
    public Long id;
    
    public String nome;
    
    @Version
    public Timestamp lasUpdate;
    
    public static Model.Finder<Long, Diretor> find = new Model.Finder<Long, Diretor>(Long.class, Diretor.class){};
}