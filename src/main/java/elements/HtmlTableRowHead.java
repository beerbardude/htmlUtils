package elements;

import java.util.ArrayList;
import java.util.List;

class HtmlTableRowHead extends HtmlElement {

    private HtmlTag TABLEROW_OPEN_TAG = HtmlTag.TR_OPEN;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag TABLEROW_CLOSE_TAG = HtmlTag.TR_CLOSE;

    private List<HtmlTableColHead> cols = new ArrayList<HtmlTableColHead>();

    HtmlTableRowHead(int cols) {
        for (int index = 0; index < cols; index++) {
            this.addCol(HtmlFactory.createTableColHead());
        }
    }

    @Override
    protected HtmlTag getStartTag() {
        return TABLEROW_OPEN_TAG;
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
                printCols() +
                TABLEROW_CLOSE_TAG.text;
    }

    private String printCols() {
        StringBuilder result = new StringBuilder();
        for(HtmlTableColHead col : cols) {
            result.append(col.print());
        }
        return result.toString();
    }

    private void addCol(HtmlTableColHead col) {
        cols.add(col);
    }

    public HtmlTableColHead getCol(int cellIndex) {
        return cols.get(cellIndex);
    }
}
