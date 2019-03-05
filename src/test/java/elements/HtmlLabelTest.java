package elements;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HtmlLabelTest {

    @Test
    public void test_HtmlLabelClass() {
        HtmlElement element = HtmlFactory.createLabel();

        assertEquals("<label></label>", element.print());
    }

    @Test
    public void test_HtmlLabelClass_WithContent() {
        HtmlElement element = HtmlFactory.createLabel();
        element.setContent("TheContent");

        assertEquals("<label>TheContent</label>", element.print());
    }

    @Test
    public void test_HtmlLabelClass_WithOverwriteContent() {
        HtmlElement element = HtmlFactory.createLabel();
        element.setContent("TheContent");
        element.setContent("ThisIsNewContent");

        assertEquals("<label>ThisIsNewContent</label>", element.print());
    }
}
