package elements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlSelectTest {

    @Test
    public void test_createHtmlSelect() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();

        assertEquals("<select></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectWithName() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        htmlSelect.setName("theName");

        assertEquals("<select name=\"theName\"></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectWithId() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        htmlSelect.setId("theId");

        assertEquals("<select id=\"theId\"></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectWithNameNull() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        htmlSelect.setName(null);

        assertEquals("<select></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectWithOption() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option = HtmlFactory.createOption();
        htmlSelect.addOption(option);

        assertEquals("<select><option></option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectWithOption_Value() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option = HtmlFactory.createOption();
        option.setValue("theValue");
        htmlSelect.addOption(option);

        assertEquals("<select><option value=\"theValue\"></option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddOptionThenOptionValue() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option = HtmlFactory.createOption();
        htmlSelect.addOption(option);
        option.setValue("theValue");

        assertEquals("<select><option value=\"theValue\"></option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddTwoOptionsWithValue() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option1 = HtmlFactory.createOption();
        htmlSelect.addOption(option1);
        option1.setValue("theValue");
        HtmlOption option2 = HtmlFactory.createOption();
        htmlSelect.addOption(option2);
        option2.setValue("theValueOption2");

        assertEquals("<select><option value=\"theValue\"></option><option value=\"theValueOption2\"></option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddOptionAndContent() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option = HtmlFactory.createOption();
        htmlSelect.addOption(option);
        option.setValue("theValue");
        option.setContent("THE_TEXT");

        assertEquals("<select><option value=\"theValue\">THE_TEXT</option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddOptionWithSelectedOption2() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option1 = HtmlFactory.createOption();
        htmlSelect.addOption(option1);
        option1.setValue("theValue");
        option1.setContent("OPTION1");

        HtmlOption option2 = HtmlFactory.createOption();
        htmlSelect.addOption(option2);
        option2.setContent("OPTION2");
        option2.setValue("theValueOption2");
        option2.selected(true);

        assertEquals("<select><option value=\"theValue\">OPTION1</option><option value=\"theValueOption2\" selected>OPTION2</option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddOptionWithSelectedOption1() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option1 = HtmlFactory.createOption();
        htmlSelect.addOption(option1);
        option1.setValue("theValue");
        option1.setContent("OPTION1");
        option1.selected(true);

        HtmlOption option2 = HtmlFactory.createOption();
        htmlSelect.addOption(option2);
        option2.setContent("OPTION2");
        option2.setValue("theValueOption2");

        assertEquals("<select><option value=\"theValue\" selected>OPTION1</option><option value=\"theValueOption2\">OPTION2</option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddOptionWithUnSelectOption2() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option1 = HtmlFactory.createOption();
        htmlSelect.addOption(option1);
        option1.setValue("theValue");
        option1.setContent("OPTION1");

        HtmlOption option2 = HtmlFactory.createOption();
        htmlSelect.addOption(option2);
        option2.setContent("OPTION2");
        option2.setValue("theValueOption2");
        option2.selected(true);

        assertEquals("<select><option value=\"theValue\">OPTION1</option><option value=\"theValueOption2\" selected>OPTION2</option></select>", htmlSelect.print());

        option2.selected(false);
        assertEquals("<select><option value=\"theValue\">OPTION1</option><option value=\"theValueOption2\">OPTION2</option></select>", htmlSelect.print());
    }

    @Test
    public void test_createHtmlSelectAddTwoOptionsWithValueAndContent() {
        HtmlElement htmlSelect = HtmlFactory.createSelect();
        HtmlOption option1 = HtmlFactory.createOption();
        htmlSelect.addOption(option1);
        option1.setValue("theValue");
        option1.setContent("OPTION1");

        HtmlOption option2 = HtmlFactory.createOption();
        htmlSelect.addOption(option2);
        option2.setContent("OPTION2");
        option2.setValue("theValueOption2");

        assertEquals("<select><option value=\"theValue\">OPTION1</option><option value=\"theValueOption2\">OPTION2</option></select>", htmlSelect.print());
    }
}
