package app1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="UserInfo")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
	@Id
	private String username;
	private String password;
	public Object getUserId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getusername() {
		// TODO Auto-generated method stub
		return null;
	}
	
  
}
