package model.beans;

public class LoginUser {
	int idUser;
	String emailUser;
	String passwdUser;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPasswdUser() {
		return passwdUser;
	}

	public void setPasswdUser(String passwdUser) {
		this.passwdUser = passwdUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailUser == null) ? 0 : emailUser.hashCode());
		result = prime * result + idUser;
		result = prime * result + ((passwdUser == null) ? 0 : passwdUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginUser other = (LoginUser) obj;
		if (emailUser == null) {
			if (other.emailUser != null)
				return false;
		} else if (!emailUser.equals(other.emailUser))
			return false;
		if (idUser != other.idUser)
			return false;
		if (passwdUser == null) {
			if (other.passwdUser != null)
				return false;
		} else if (!passwdUser.equals(other.passwdUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoginUser [idUser=" + idUser + ", emailUser=" + emailUser + ", passwdUser=" + passwdUser + "]";
	}

}
