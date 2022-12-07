package ie.atu;

public class Employee {

    String name;
    String ID;
    String phone;
    String gender;
    String Employ;

    Employee(String name, String ID, String phone, String gender, String Employ)
    {
        this.name = setName(name);
        this.ID = setID(ID);
        this.phone= setPhone(phone);
        this.gender = setGender(gender);
        this.Employ = setEmploy(Employ);
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

    public String setGender(String s) {
        switch (s)
        {
            case "male":
            case "female":
            case "non-binary":
                return s;
            default:
                throw new IllegalArgumentException("Can be male, female or non-binary");
        }
    }

    public String setEmploy(String s) {
        switch (s)
        {
            case "part-time":
            case "full-time":
                return s;
            default:
                throw new IllegalArgumentException("Can be full or part-time");
        }
    }
}
