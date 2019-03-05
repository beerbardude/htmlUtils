package elements;

public class HtmlLabel extends HtmlElement {

    private HtmlTag LABEL_OPEN_TAG = HtmlTag.LABEL_OPEN;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag LABEL_CLOSE_TAG = HtmlTag.LABEL_CLOSE;

    @Override
    protected HtmlTag getStartTag() {
        return LABEL_OPEN_TAG;
    }

    @Override
    protected HtmlTag getCloseTag() {
        return CLOSE_TAG;
    }

    @Override
    public void addOption(HtmlOption option) {

    }

    @Override
    public String print() {
        return super.print() +
                LABEL_CLOSE_TAG.text;
    }
}
