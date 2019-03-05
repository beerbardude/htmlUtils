package elements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlInputTest {

    @Test
    public void test_createHtmlInput() {
        HtmlElement htmlInput = HtmlFactory.createInput();

        assertEquals("<input>", htmlInput.print());
    }

    @Test
    public void test_createHtmlRadioInput() {
        HtmlElement htmlInputRadio = HtmlFactory.createInput();
        htmlInputRadio.setInputType(HtmlInputType.RADIO);

        assertEquals("<input type=\"radio\">", htmlInputRadio.print());
    }

    @Test
    public void test_createHtmlRadioInput_createHtmlInputCheckBox() {
        HtmlElement htmlInputRadio = HtmlFactory.createInput();
        htmlInputRadio.setInputType(HtmlInputType.RADIO);

        HtmlElement htmlInputCheckBox = HtmlFactory.createInput();
        htmlInputCheckBox.setInputType(HtmlInputType.CHECKBOX);

        assertEquals("<input type=\"radio\">", htmlInputRadio.print());
        assertEquals("<input type=\"checkbox\">", htmlInputCheckBox.print());
    }

    @Test
    public void test_createHtmlRadioInputWithName() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.RADIO);
        inputElement.setName("thisIsTheName");

        assertEquals("<input type=\"radio\" name=\"thisIsTheName\">", inputElement.print());
    }

    @Test
    public void test_createHtmlCheckBoxInputWithName() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.CHECKBOX);
        inputElement.setName("thisIsTheName");

        assertEquals("<input type=\"checkbox\" name=\"thisIsTheName\">", inputElement.print());
    }

    @Test
    public void test_createHtmlInputWithName() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setName("thisIsTheName");

        assertEquals("<input name=\"thisIsTheName\">", inputElement.print());
    }

    @Test
    public void test_createHtmlCheckBoxInputWithNameAndId() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.CHECKBOX);
        inputElement.setName("thisIsTheName");
        inputElement.setId("theId");

        assertEquals("<input type=\"checkbox\" name=\"thisIsTheName\" id=\"theId\">", inputElement.print());
    }

    @Test
    public void test_createHtmlCheckBoxInputWithNameAndIdAndValue() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.CHECKBOX);
        inputElement.setName("thisIsTheName");
        inputElement.setId("theId");
        inputElement.setValue("theValue");

        assertEquals("<input type=\"checkbox\" name=\"thisIsTheName\" id=\"theId\" value=\"theValue\">", inputElement.print());
    }

    @Test
    public void test_createHtmlRadioInputWithId() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.RADIO);
        inputElement.setId("theId");

        assertEquals("<input type=\"radio\" id=\"theId\">", inputElement.print());
    }

    @Test
    public void test_createHtmlRadioInputWithValue() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.RADIO);
        inputElement.setValue("theValue");

        assertEquals("<input type=\"radio\" value=\"theValue\">", inputElement.print());
    }

    @Test
    public void test_createTwoHtmlCheckBoxInputsWithNameAndIdAndValue() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.setInputType(HtmlInputType.CHECKBOX);
        inputElement.setName("thisIsTheName");
        inputElement.setId("theId");
        inputElement.setValue("theValue");

        HtmlElement inputElement2 = HtmlFactory.createInput();;
        inputElement2.setInputType(HtmlInputType.CHECKBOX);
        inputElement2.setName("secondName");
        inputElement2.setId("secondId");
        inputElement2.setValue("secondValue");

        assertEquals("<input type=\"checkbox\" name=\"thisIsTheName\" id=\"theId\" value=\"theValue\">", inputElement.print());
        assertEquals("<input type=\"checkbox\" name=\"secondName\" id=\"secondId\" value=\"secondValue\">", inputElement2.print());
    }

    @Test
    public void test_createHtmlCheckBoxInputWithCheckedAndThenUncheck() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.checked(true);

        assertEquals("<input checked>", inputElement.print());

        inputElement.checked(false);
        assertEquals("<input>", inputElement.print());
    }

    @Test
    public void test_createHtmlCheckBoxInputWithUncheckedAndThenCheck() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.checked(false);

        assertEquals("<input>", inputElement.print());

        inputElement.checked(true);
        assertEquals("<input checked>", inputElement.print());
    }

    @Test
    public void test_createHtmlCheckBoxInputWithCheck() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.checked(true);

        assertEquals("<input checked>", inputElement.print());
    }

    @Test
    public void test_createHtmlInputWithDisabled() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.disabled(true);

        assertEquals("<input disabled>", inputElement.print());
    }

    @Test
    public void test_createHtmlInputWithDisabledUnset() {
        HtmlElement inputElement = HtmlFactory.createInput();
        inputElement.disabled(true);

        assertEquals("<input disabled>", inputElement.print());

        inputElement.disabled(false);

        assertEquals("<input>", inputElement.print());
    }

}
