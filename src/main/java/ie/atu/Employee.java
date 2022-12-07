package ie.atu;

public class Employee {

    String name;
    String ID;
    String phone;

    Employee(String name, String ID, String phone)
    {
        this.name = setName(name);
        this.ID = setID(ID);
        this.phone= setPhone(phone);
    }

    public String setName(String i) {
        if (i.length() >= 5 && i.length() <= 22)
        {
            return i;
        }
        else
        {
            throw new IllegalArgumentException("Name has to have minimum 5 characters and Maximum 22");
        }
    }

    public String setID(String s) {
        if (s.length() == 6)
        {
            return s;
        }
        else
        {
            throw new IllegalArgumentException("Invalid PPS number, must be 6 digits long");
        }
    }

    public String setPhone(String s) {
        if (s.length() == 11)
        {
            return s;
        }
        else
        {
            throw new IllegalArgumentException("Invalid phone number, must be 11 digits long");
        }
    }
}
