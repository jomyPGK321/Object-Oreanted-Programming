package encapsulation;

public class reg1 {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		
		 {
	            if (name.matches("^[a-zA-Z]*$"))
	            {
	            	this.name = name;
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		
		{
            if (address.matches("^[a-zA-Z0-9]*$"))
            {
            	this.address = address;
                return true;
            }
            else
            {
                return false;
            }
        }
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		 {
	            if (contactNumber.matches("^[0-9]*$"))
	            {
	            	this.contactNumber = contactNumber;
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		  {
	            if (email.contains("@"))
	            {
	            	this.email = email;
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
		
	}
	public String getProofType() {
		return proofType;
	}
	public boolean setProofType(String proofType) {
		
		{
            if (proofType.matches("^[a-zA-Z]*$"))
            {
            	this.proofType = proofType;
                return true;
            }
            else
            {
                return false;
            }
        }
	}
	public String getProofID() {
		return proofID;
	}
	public boolean setProofID(String proofID) {
		
		{
            if (proofID.matches("^[0-9]*$"))
            {
            	this.proofID = proofID;
                return true;
            }
            else
            {
                return false;
            }
        }
	}
	
	

}
