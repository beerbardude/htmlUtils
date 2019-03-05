package elements;

import java.util.ArrayList;
import java.util.List;

public class HtmlTableRow extends HtmlElement {

    private HtmlTag TABLEROW_OPEN_TAG = HtmlTag.TR_OPEN;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag TABLEROW_CLOSE_TAG = HtmlTag.TR_CLOSE;

    private List<HtmlTableColHead> headCols = new ArrayList<HtmlTableColHead>();
    private List<HtmlTableCol> cols = new ArrayList<HtmlTableCol>();

    HtmlTableRow(int cols) {
        for(int index = 0; index < cols; index++) {
            this.addCol(HtmlFactory.createTableCol());
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

    public HtmlTableCol getCol(int col) {
        return cols.get(col);
    }

    @Override
    public String print() {
        return super.print() +
                printCols() +
                printHeadCols() +
                TABLEROW_CLOSE_TAG.text;
    }

    private String printCols() {
        StringBuilder result = new StringBuilder();
        for(HtmlTableCol col : cols) {
            result.append(col.print());
        }
        return result.toString();
    }

    private String printHeadCols() {
        StringBuilder result = new StringBuilder();
        for(HtmlTableColHead col : headCols) {
            result.append(col.print());
        }
        return result.toString();
    }

    public void addCol(HtmlTableCol col) {
        cols.add(col);
    }


    public int getCols() {
        return this.cols.size();
    }
}
