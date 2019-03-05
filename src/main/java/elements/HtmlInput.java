package elements;

public class HtmlInput extends HtmlElement {

    private HtmlTag INPUT_OPEN_TAG = HtmlTag.INPUT;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;


    HtmlInput(){}

    @Override
    protected HtmlTag getStartTag() {
        return INPUT_OPEN_TAG;
    }

    @Override
    protected HtmlTag getCloseTag() {
        return CLOSE_TAG;
    }

    @Override
    public void addOption(HtmlOption option) {

    }

}


