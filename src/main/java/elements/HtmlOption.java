package elements;

public class HtmlOption extends HtmlElement {

    private HtmlTag OPTION_OPEN_TAG = HtmlTag.OPTION;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag OPTION_CLOSE_TAG = HtmlTag.OPTION_CLOSE;

    HtmlOption(){}

    @Override
    protected HtmlTag getStartTag() {
        return OPTION_OPEN_TAG;
    }

    @Override
    protected HtmlTag getCloseTag() {
        return CLOSE_TAG;
    }

    @Override
    public String print() {
        return super.print() +
                OPTION_CLOSE_TAG.text;
    }

    @Override
    public void addOption(HtmlOption option) {

    }

}
