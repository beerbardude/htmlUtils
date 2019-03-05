package elements;

public abstract class HtmlElement {

    public HtmlInputType type;
    public String name;
    public String id;
    public String value;
    public String checked;
    public String disabled;
    public String selected;
    public String content;

    HtmlElement() { }

    protected abstract HtmlTag getStartTag();
    protected abstract HtmlTag getCloseTag();

    public void setInputType(HtmlInputType type) {
        if(type != null) {
            this.type = type;
        }
    }

    private HtmlInputType getInputType() {
        return this.type;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = HtmlAttribute.makeNameAttribute(name);
        }
    }

    public void setId(String id) {
        if(id != null) {
            this.id = HtmlAttribute.makeIdAttribute(id);
        }
    }

    public void setValue(String value) {
        if(value != null) {
            this.value = HtmlAttribute.makeValueAttribute(value);
        }
    }

    public void checked(boolean checked) {
        if(checked) {
            this.checked = HtmlAttribute.makeCheckedAttribute();
        }
        else {
            this.checked = "";
        }
    }

    public void disabled(boolean disabled) {
        if(disabled) {
            this.disabled = HtmlAttribute.makeDisabledAttribute();
        }
        else {
            this.disabled = "";
        }
    }

    public void selected(boolean selected) {
        if(selected) {
            this.selected = HtmlAttribute.makeSelectedAttribute();
        }
        else {
            this.selected = "";
        }
    }

    public void setContent(String content) {
        if(content != null) {
            this.content = content;
        }
    }

    public String print() {
        return getStartTag().text +
                HtmlAttribute.makeTypeAttribute(getInputType()) +
                nullCheckString(this.name) +
                nullCheckString(this.id) +
                nullCheckString(this.value) +
                nullCheckString(this.checked) +
                nullCheckString(this.disabled) +
                nullCheckString(this.selected) +
                getCloseTag().text +
                nullCheckString(this.content);
    }

    private String nullCheckString(String string) {
        if(string != null) {
            return string;
        }
        return "";
    }

    public abstract void addOption(HtmlOption option);
}
