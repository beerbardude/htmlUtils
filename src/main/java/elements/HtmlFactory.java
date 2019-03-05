package elements;

public class HtmlFactory {

    public static HtmlElement createInput() {
        return new HtmlInput();
    }

    public static HtmlElement createSelect() {
        return new HtmlSelect();
    }

    public static HtmlOption createOption() {
        return new HtmlOption();
    }

    public static HtmlLabel createLabel() { return new HtmlLabel(); }

    public static HtmlTable createTable(int rows, int cols) {
        return new HtmlTable(rows, cols);
    }

    public static HtmlTable createTableWithHeader(int rows, int cols) {
        return new HtmlTableWithHead(rows, cols);
    }

    public static HtmlTableRow createTableRow(int cols) {
        return new HtmlTableRow(cols);
    }

    public static HtmlTableRowHead createTableRowHead(int cols) {
        return new HtmlTableRowHead(cols);
    }

    public static HtmlTableCol createTableCol() {
        return new HtmlTableCol();
    }

    public static HtmlTableColHead createTableColHead() {
        return new HtmlTableColHead();
    }

}
