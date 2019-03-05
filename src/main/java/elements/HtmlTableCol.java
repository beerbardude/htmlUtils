package elements;

public class HtmlTableCol extends HtmlElement {

    private HtmlTag TABLECOL_OPEN_TAG = HtmlTag.TD_OPEN;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag TABLECOL_CLOSE_TAG = HtmlTag.TD_CLOSE;

    @Override
    protected HtmlTag getStartTag() {
        return TABLECOL_OPEN_TAG;
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
                TABLECOL_CLOSE_TAG.text;
    }
}
