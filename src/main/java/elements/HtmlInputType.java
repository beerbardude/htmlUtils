package elements;

public enum HtmlInputType {

    RADIO("radio"),
    CHECKBOX("checkbox");

    String text;

    HtmlInputType(String type) {
        this.text = type;
    }
}


