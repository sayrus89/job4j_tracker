package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(0));
    }

    @Test
    public void whenMultipleCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1", "2", "4", "5", "3", "6"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(0));
        ValidateInput input1 = new ValidateInput(out, in);
        int selected1 = input1.askInt("Enter menu");
        assertThat(selected1, is(1));
        ValidateInput input2 = new ValidateInput(out, in);
        int selected2 = input2.askInt("Enter menu");
        assertThat(selected2, is(2));
        ValidateInput input3 = new ValidateInput(out, in);
        int selected3 = input3.askInt("Enter menu");
        assertThat(selected3, is(4));
        ValidateInput input4 = new ValidateInput(out, in);
        int selected4 = input4.askInt("Enter menu");
        assertThat(selected4, is(5));
        ValidateInput input5 = new ValidateInput(out, in);
        int selected5 = input5.askInt("Enter menu");
        assertThat(selected5, is(3));
        ValidateInput input6 = new ValidateInput(out, in);
        int selected6 = input6.askInt("Enter menu");
        assertThat(selected6, is(6));
    }

    @Test
    public void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}