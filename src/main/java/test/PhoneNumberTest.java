package main.java.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberTest {
    @Test
    public void tests() {
        assertEquals(true, PhoneNumber.validPhoneNumber("(123) 456-7890"));
        assertEquals(true, PhoneNumber.validPhoneNumber("(098) 123 4567"));
    }

    @Test
    public void basicTests() {
        String msg = "Follow the phone formatting instructions carefully";
        assertEquals(msg, true, PhoneNumber.validPhoneNumber("(123) 456 7890"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertEquals(msg, true, PhoneNumber.validPhoneNumber("(098) 123 4567"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(123)456 7890"));
    }

    @Test
    public void formCharTests() {
        String msg = "Pay attention to the formatting of the string and surrounding characters";
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("abc(123)456-7890"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(123)456-7890abc"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("abc(123)456-7890abc"));
    }

    @Test
    public void charTests() {
        String msg = "Be careful with characters surrounding the phone number";
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("abc(123) 456-7890"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(123) 456-7890abc"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("abc(123) 456-7890abc"));
    }

    @Test
    public void badCharTests() {
        String msg = "Be careful with non-digit characters inside phone number";
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(123) 456-78f0"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(123) 4e6-7890"));
        assertEquals(msg, false, PhoneNumber.validPhoneNumber("(*23) 456-7890"));
    }
}