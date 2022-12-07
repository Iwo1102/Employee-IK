package ie.atu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Employee Test")
class EmployeeTest {

    Employee Tester = new Employee("Aaron", "123456", "12345678910", "male", "Part-time");
    @BeforeEach
   void beforeEach()
    {}

    @Test
    void nameTest()
    {
        assertEquals("Aaron", Tester.setName("Aaron"));
    }
    @Test
    void nameTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joel", "","","", ""));
        assertEquals("Name has to have minimum 5 characters and Maximum 22", e_message.getMessage());
    }

    @Test
    void IDTest()
    {
        assertEquals("123456", Tester.setID("123456"));
    }
    @Test
    void IDTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joels","12345","", "", "" ));
        assertEquals("Invalid PPS number, must be 6 digits long", e_message.getMessage());
    }

    @Test
    void phoneTest()
    {
        assertEquals("12345678910", Tester.setPhone("12345678910"));
    }
    @Test
    void phoneTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joels","123456","123456789","", ""));
        assertEquals("Invalid phone number, must be 11 digits long", e_message.getMessage());
    }

    @Test
    void GenderTest()
    {
        assertEquals("male", Tester.setGender("male"));
    }
    @Test
    void GenderTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joels","123456","12345678910","hello", ""));
        assertEquals("Can be male, female or non-binary", e_message.getMessage());
    }

    @Test
    void employTest()
    {
        assertEquals("part-time", Tester.setEmploy("part-time"));
    }
    @Test
    void employTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joels","123456","12345678910","hello","part-time"));
        assertEquals("Can be male, female or non-binary", e_message.getMessage());
    }


    @AfterEach
    void afterEach()
    {}

}