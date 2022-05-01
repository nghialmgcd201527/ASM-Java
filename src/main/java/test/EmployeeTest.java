package main.java.test;

import main.java.others.Account;
import main.java.others.Employee;
import org.junit.Test;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class EmployeeTest {
    List<Employee> employees = new ArrayList<>();
    Employee employee1 = new Employee("leminhnghia", "minhnghia", "lmnghia911@gmail.com", "Employee");
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsEmpty() {
        assertTrue(employees.isEmpty());
        employees.add(employee1);
        assertFalse(employees.isEmpty());
        employees.remove(employee1);
        assertTrue(employees.isEmpty());
    }

    @Test
    public void EmployeeRole()
    {
        Employee employee = new Employee();
        employee.setAccess("Employee");
        String roleToCheck = employee.getAccess();
        assertEquals("Employee", roleToCheck);
    }

    @Test
    public void testUsingStrictRegex() {
        Employee admin = new Employee("admin", "admin", "admin@gmail.com", "Admin");
        String emailAddress = admin.getEmail();
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        assertTrue(patternMatches(emailAddress, regexPattern));
    }

    private boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    @org.junit.Test
    public void getAccess() {
        String expectedResult = "Admin";
        Employee admin = new Employee("admin", "admin", "admin@gmail.com", "Admin");
        String actualResult = admin.getAccess();
        assertEquals(expectedResult, actualResult);
    }
}