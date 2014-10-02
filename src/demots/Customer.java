package demots;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chiayin
 */
public class Customer {
    private int custId;
    private String name;
    private String gender;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    
    private static int nextId = 1;
    
    public Customer() {
        custId = nextId; nextId++;
    }
    
    public Customer(String name, String gender, String birthDate, String phone, String address, String email) {
        this.name = name;           this.gender = gender; 
        this.birthDate = birthDate; this.phone = phone;
        this.address = address;     this.email = email;
        custId = nextId; nextId++;
    }
    
    public int getId() { return custId; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getBirthDate() { return birthDate; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    
    public void setName(String name){this.name=name;}
    public void setAddress(String addr){address=addr;}
    public void setPhone(String ph){phone=ph;}
    public void setBirthDate(String bd){birthDate=bd;}
    public void setGender(String gender){this.gender=gender;}
    public void setEmail(String email){this.email=email;}
    
    public int compare(Customer c1, Customer c2) {
        int ret = (c1.name).compareTo(c2.name);
        if(ret != 0) {
            return ret;
        } else {
            return (c1.address).compareTo(c2.address);
        }
    }
}
