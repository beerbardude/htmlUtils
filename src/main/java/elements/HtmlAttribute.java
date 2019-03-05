package elements;

import javax.annotation.Nonnull;

public enum HtmlAttribute {

    TYPE("type="),
    NAME("name="),
    ID("id="),
    VALUE("value="),
    DISABLED("disabled"),
    SELECTED("selected"),
    CHECKED("checked");

    String text;

    private static String SPACE = " ";

    HtmlAttribute(String text) {
        this.text = text;
    }

    public static String makeTypeAttribute(HtmlInputType type) {
        if(type != null) {
            return SPACE + TYPE.text + "\"" + type.text + "\"";
        }
        return "";
    }

    public static String makeNameAttribute(@Nonnull String name) {
        return SPACE + NAME.text + "\"" + name + "\"";
    }

    public static String makeIdAttribute(@Nonnull String id) {
        return SPACE + ID.text + "\"" + id + "\"";
    }

    public static String makeValueAttribute(@Nonnull String value) {
        return SPACE + VALUE.text + "\"" + value + "\"";
    }

    public static String makeCheckedAttribute() {
        return SPACE + CHECKED.text;
    }

    public static String makeDisabledAttribute() {
        return SPACE + DISABLED.text;
    }

    public static String makeSelectedAttribute() {
        return SPACE + SELECTED.text;
    }


}
