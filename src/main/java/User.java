public class User {

    public Long id;

    private String lastName;

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = "lastName=" + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    @Override
    public String toString() {
        if (id == null) {
            return null;
        }
        return "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName;
    }
}
