package elements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlOptionTest {

    @Test
    public void test_HtmlOptionClass() {
        HtmlOption element = HtmlFactory.createOption();

        assertEquals(HtmlOption.class, element.getClass());
    }

    @Test
    public void test_HtmlOption() {
        HtmlOption element = HtmlFactory.createOption();

        assertEquals("<option></option>", element.print());
    }

    @Test
    public void test_HtmlOptionSelected() {
        HtmlOption element = HtmlFactory.createOption();

        element.selected(true);

        assertEquals("<option selected></option>", element.print());
    }

    @Test
    public void test_HtmlOptionDeselected() {
        HtmlOption element = HtmlFactory.createOption();

        element.selected(true);
        element.selected(false);

        assertEquals("<option></option>", element.print());
    }

    @Test
    public void test_HtmlOptionContent() {
        HtmlOption element = HtmlFactory.createOption();

        element.setContent("This is an option");

        assertEquals("<option>This is an option</option>", element.print());
    }

    @Test
    public void test_HtmlOptionIdAndContent() {
        HtmlOption element = HtmlFactory.createOption();

        element.setContent("This is an option");
        element.setId("This is the ID");

        assertEquals("<option id=\"This is the ID\">This is an option</option>", element.print());
    }

}
