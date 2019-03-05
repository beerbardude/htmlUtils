package elements;

import java.util.ArrayList;
import java.util.List;

public class HtmlSelect extends HtmlElement {

    private HtmlTag SELECT_OPEN_TAG = HtmlTag.SELECT;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag SELECT_CLOSE_TAG = HtmlTag.SELECT_CLOSE;

    private List<HtmlOption> options = new ArrayList<HtmlOption>();


    HtmlSelect() {
        super();
    }

    @Override
    protected HtmlTag getStartTag() {
        return SELECT_OPEN_TAG;
    }

    @Override
    protected HtmlTag getCloseTag() {
        return CLOSE_TAG;
    }

    @Override
    public String print() {
        return super.print() +
                printOptions() +
                SELECT_CLOSE_TAG.text;
    }

    @Override
    public void addOption(HtmlOption option) {
        options.add(option);
    }

    private String printOptions() {
        StringBuilder optionsString = new StringBuilder();
        for(HtmlElement option : options) {
            optionsString.append(option.print());
        }
        return optionsString.toString();
    }


}
