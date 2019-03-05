package elements;

import java.util.ArrayList;
import java.util.List;

public class HtmlTable extends HtmlElement {

    private HtmlTag TABLE_OPEN_TAG = HtmlTag.TABLE_OPEN;
    private HtmlTag CLOSE_TAG = HtmlTag.CLOSE_TAG;
    private HtmlTag TABLE_CLOSE_TAG = HtmlTag.TABLE_CLOSE;

    private HtmlTableRowHead rowHead;
    private List<HtmlTableRow> rows = new ArrayList<HtmlTableRow>();

    HtmlTable(int rows, int cols) {
        for(int index = 0; index < rows; index++) {
            this.addRow(HtmlFactory.createTableRow(cols));
        }
    }

    HtmlTable() {
    }

    @Override
    protected HtmlTag getStartTag() {
        return TABLE_OPEN_TAG;
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
                printRows() +
                TABLE_CLOSE_TAG.text;

    }

    public void addRow(HtmlTableRow row) {
        rows.add(row);
    }

    public void addRow() {
        if(rows.size() > 0) {
            int actualSize = rows.get(0).getCols();
            rows.add(HtmlFactory.createTableRow(actualSize));
        }
        else {
            rows.add(HtmlFactory.createTableRow(1));
        }
    }

    void addRowHead(HtmlTableRowHead row) {
        rowHead = row;
    }

    private String printRows() {
        StringBuilder result = new StringBuilder();
        result.append(printRowHead());
        for(HtmlTableRow row : this.rows) {
            result.append(row.print());
        }
        return result.toString();
    }

    public HtmlTableCol getCell(int row, int col) {
        if(row > 0 && col > 0) {
            return rows.get(row - 1).getCol(col - 1);
        }
        return null;
    }

    public HtmlTableColHead getHeadCell(int col) {
        if(col > 0) {
            return rowHead.getCol(col - 1);
        }
        return null;
    }

    public int getRows() {
        return this.rows.size();
    }

    private String printRowHead() {
        if(rowHead != null) {
            return this.rowHead.print();
        }
        return HtmlTag.EMPTY.text;
    }
}
