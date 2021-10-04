package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqName1() {
        License first = new License();
        first.setModel("Chevrolet");
        License second = new License();
        second.setModel("Chevrolet");
        assertThat(first, is(second));
    }
}