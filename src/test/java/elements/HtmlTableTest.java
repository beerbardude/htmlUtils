package elements;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HtmlTableTest {

    @Test
    public void test_createTable_minus1() {
        HtmlTable table = HtmlFactory.createTable(-1, -1);

        assertEquals("<table></table>", table.print());
    }

    @Test
    public void test_createTable_0_0() {
        HtmlTable table = HtmlFactory.createTable(0, 0);

        assertEquals("<table></table>", table.print());
    }

    @Test
    public void test_createTable_1_1() {
        HtmlTable table = HtmlFactory.createTable(1, 1);

        assertEquals("<table>" +
                    "<tr>" +
                        "<td></td>" +
                    "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_0_1() {
        HtmlTable table = HtmlFactory.createTable(0, 1);

        assertEquals("<table></table>", table.print());
    }

    @Test
    public void test_createTable_1_0() {
        HtmlTable table = HtmlFactory.createTable(1, 0);

        assertEquals("<table>" +
                "<tr>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_2_1() {
        HtmlTable table = HtmlFactory.createTable(2, 1);

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_1_3() {
        HtmlTable table = HtmlFactory.createTable(1, 3);

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_1_1WithContent() {
        HtmlTable table = HtmlFactory.createTable(1, 3);
        table.getCell(1, 1).setContent("Name");

        assertEquals("<table>" +
                "<tr>" +
                    "<td>Name</td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_2_2WithContent() {
        HtmlTable table = HtmlFactory.createTable(3, 3);
        table.getCell(2, 2).setContent("The Content");

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td>The Content</td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_AllWithContent() {
        HtmlTable table = HtmlFactory.createTable(3, 3);
        for(int row = 1; row <= 3; row++) {
            for(int col = 1; col <= 3; col++) {
                table.getCell(row, col).setContent(row + "." + col);
            }
        }
        assertEquals("<table>" +
                "<tr>" +
                    "<td>1.1</td>" +
                    "<td>1.2</td>" +
                    "<td>1.3</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>2.1</td>" +
                    "<td>2.2</td>" +
                    "<td>2.3</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>3.1</td>" +
                    "<td>3.2</td>" +
                    "<td>3.3</td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_AddRow() {
        HtmlTable table = HtmlFactory.createTable(0, 0);
        table.addRow(HtmlFactory.createTableRow(2));

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_1_2AddRow() {
        HtmlTable table = HtmlFactory.createTable(1, 2);
        table.addRow();

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_0_0AddRow() {
        HtmlTable table = HtmlFactory.createTable(0, 0);
        table.addRow();

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_0_0Add3Rows() {
        HtmlTable table = HtmlFactory.createTable(0, 0);
        table.addRow();
        table.addRow();
        table.addRow();

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_3_6Add2Rows() {
        HtmlTable table = HtmlFactory.createTable(3, 6);
        table.addRow();
        table.addRow();

        assertEquals("<table>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                "</tr>" +
                "</table>", table.print());
    }

    @Test
    public void test_createTable_2_1WithHeader() {
        HtmlElement table = HtmlFactory.createTableWithHeader(2, 1);

        assertEquals("<table><tr><th></th></tr><tr><td></td></tr></table>", table.print());
    }

    @Test
    public void test_createTable_0_0WithHeader() {
        HtmlElement table = HtmlFactory.createTableWithHeader(0, 0);

        assertEquals("<table></table>", table.print());
    }

    @Test
    public void test_createTable_2_3WithHeader() {
        HtmlElement table = HtmlFactory.createTableWithHeader(2, 3);

        assertEquals("<table><tr><th></th><th></th><th></th></tr><tr><td></td><td></td><td></td></tr></table>", table.print());
    }
}
