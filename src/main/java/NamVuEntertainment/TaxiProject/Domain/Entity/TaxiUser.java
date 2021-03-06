package NamVuEntertainment.TaxiProject.Domain.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import org.hibernate.criterion.IlikeExpression;

@Entity
@Table(name = "user")
public class TaxiUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserId;
	@Column
	private String UserName;
	@Column
	@JsonIgnore
	private String Password;
//	@Column
//	private byte[] PasswordHash;
//	@Column
//	private String ImagePath;
	@Column
	private String Name;
//	@Column
//	private String Phone;
//	@Column
//	private String Email;
//	@Column
//	private String Address;
//	@Column
//	private Date Created;
//	@Column
//	private Date Updated;
//	@Column
//	private Boolean IsVerified;
//	@Column
//	private String VerificationToken;
//	@Column
//	private String ResetToken;
//	@Column
//	private Date ResetTokenExpires;
//	@Column
//	private String Role;
	
	

	public TaxiUser() {
	}

	public TaxiUser(String userName, String password, String name) {
		UserName = userName;
		Password = password;
		Name = name;
	}



	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

//	public byte[] getPasswordHash() {
//		return PasswordHash;
//	}
//
//	public void setPasswordHash(byte[] passwordHash) {
//		PasswordHash = passwordHash;
//	}
//
//	public String getImagePath() {
//		return ImagePath;
//	}
//
//	public void setImagePath(String imagePath) {
//		ImagePath = imagePath;
//	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

//	public String getPhone() {
//		return Phone;
//	}
//
//	public void setPhone(String phone) {
//		Phone = phone;
//	}
//
//	public String getEmail() {
//		return Email;
//	}
//
//	public void setEmail(String email) {
//		Email = email;
//	}
//
//	public String getAddress() {
//		return Address;
//	}
//
//	public void setAddress(String address) {
//		Address = address;
//	}
//
//	public Date getCreated() {
//		return Created;
//	}
//
//	public void setCreated(Date created) {
//		Created = created;
//	}
//
//	public Date getUpdated() {
//		return Updated;
//	}
//
//	public void setUpdated(Date updated) {
//		Updated = updated;
//	}
//
//	public Boolean getIsVerified() {
//		return IsVerified;
//	}
//
//	public void setIsVerified(Boolean isVerified) {
//		IsVerified = isVerified;
//	}
//
//	public String getVerificationToken() {
//		return VerificationToken;
//	}
//
//	public void setVerificationToken(String verificationToken) {
//		VerificationToken = verificationToken;
//	}
//
//	public String getResetToken() {
//		return ResetToken;
//	}
//
//	public void setResetToken(String resetToken) {
//		ResetToken = resetToken;
//	}
//
//	public Date getResetTokenExpires() {
//		return ResetTokenExpires;
//	}
//
//	public void setResetTokenExpires(Date resetTokenExpires) {
//		ResetTokenExpires = resetTokenExpires;
//	}
//
//	public String getRole() {
//		return Role;
//	}
//
//	public void setRole(String role) {
//		Role = role;
//	}

//     private Customer Customer ;
//     private Driver Driver ;
//     private List<Like> Likes; 
//     private ICollection<Comment> Comments; 
//     private ICollection<Notify> Notifies ;
}
