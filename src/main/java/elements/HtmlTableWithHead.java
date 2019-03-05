package elements;

class HtmlTableWithHead extends HtmlTable {

    HtmlTableWithHead(int rows, int cols) {
        for (int index = 0; index < rows; index++) {
            if(index == 0) {
                this.addRowHead(HtmlFactory.createTableRowHead(cols));
            }
            else {
                this.addRow(HtmlFactory.createTableRow(cols));
            }
        }
    }
}
