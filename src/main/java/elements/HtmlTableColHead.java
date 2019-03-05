package elements;

public class HtmlTableColHead extends HtmlElement {

    private HtmlTag TABLECOLHEAD_OPEN_TAG = HtmlTag.TH_OPEN;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag TABLECOLHEAD_CLOSE_TAG = HtmlTag.TH_CLOSE;

    @Override
    protected HtmlTag getStartTag() {
        return TABLECOLHEAD_OPEN_TAG;
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
                TABLECOLHEAD_CLOSE_TAG.text;
    }

}
