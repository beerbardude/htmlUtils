package elements;

import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlAttributeTest {

    @Test
    public void test_getText() {
        for (HtmlAttribute attribute : HtmlAttribute.values()) {
            if (attribute.text.equals("type=")) {
                assertTrue(true);
            } else if (attribute.text.equals("name=")) {
                assertTrue(true);
            } else if (attribute.text.equals("id=")) {
                assertTrue(true);
            } else if (attribute.text.equals("value=")) {
                assertTrue(true);
            } else if (attribute.text.equals("disabled")) {
                assertTrue(true);
            } else if (attribute.text.equals("selected")) {
                assertTrue(true);
            } else if (attribute.text.equals("checked")) {
                assertTrue(true);
            } else {
                assertFalse(true);
            }
        }
    }

    @Test
    public void test_makeNameAttribute() {
        String actual = HtmlAttribute.makeNameAttribute("theName");

        assertEquals(" name=\"theName\"", actual);
    }

    @Test
    public void test_makeNameAttribute_Null() {
        String actual = HtmlAttribute.makeNameAttribute(null);

        assertEquals(" name=\"null\"", actual);
    }

    @Test
    public void test_makeIdAttribute() {
        String actual = HtmlAttribute.makeIdAttribute("theId");

        assertEquals(" id=\"theId\"", actual);
    }

    @Test
    public void test_makeIdAttribute_Null() {
        String actual = HtmlAttribute.makeIdAttribute(null);

        assertEquals(" id=\"null\"", actual);
    }

    @Test
    public void test_makeValueAttribute() {
        String actual = HtmlAttribute.makeValueAttribute("theValue");

        assertEquals(" value=\"theValue\"", actual);
    }

    @Test
    public void test_makeValueAttribute_Null() {
        String actual = HtmlAttribute.makeValueAttribute(null);

        assertEquals(" value=\"null\"", actual);
    }

    @Test
    public void test_makeCheckedAttribute() {
        String actual = HtmlAttribute.makeCheckedAttribute();

        assertEquals(" checked", actual);
    }

    @Test
    public void test_makeSelectedAttribute() {
        String actual = HtmlAttribute.makeSelectedAttribute();

        assertEquals(" selected", actual);
    }

    @Test
    public void test_makeDisabledAttribute() {
        String actual = HtmlAttribute.makeDisabledAttribute();

        assertEquals(" disabled", actual);
    }

}
