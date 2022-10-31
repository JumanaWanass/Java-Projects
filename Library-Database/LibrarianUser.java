public class LibrarianUser implements Records
{
        private String librarianId;
        private String Name;
        private String Email;
        private String Address;
        private String PhoneNumber;

        public LibrarianUser(String librarianId, String name, String email, String address, String phoneNumber)
        {   
            this.librarianId = librarianId;
            this.Name = name;
            this.Email = email;
            this.Address = address;
            this.PhoneNumber = phoneNumber;
        }
        
        public void setLibrarianId(String librarianId) 
        {
            this.librarianId = librarianId;
        }

        public String getName()
        {
            return Name;
        }

        public void setName(String name) 
        {
            Name = name;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) 
        {
            Email = email;
        }

        public String getAddress() 
        {
            return Address;
        }

        public void setAddress(String address) 
        {
            Address = address;
        }

        public String getPhoneNumber() 
        {
            return PhoneNumber;
        }

        public String getSearchKey()
        {
            return this.librarianId;
        }

        public void setPhoneNumber(String phoneNumber)
        {
            PhoneNumber = phoneNumber;
        }

        public String lineRepresentation()
        {
            String LibrarianData = this.librarianId + "," + this.Name + "," + this.Email + "," + this.Address + "," + this.PhoneNumber + "\n";
            return LibrarianData;
        }
       
}