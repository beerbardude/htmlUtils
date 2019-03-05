package elements;

public enum HtmlTag {

    INPUT("<input"),
    SELECT("<select"),
    SELECT_CLOSE("</select>"),
    OPTION("<option"),
    OPTION_CLOSE("</option>"),
    TABLE_OPEN("<table"),
    TABLE_CLOSE("</table>"),
    TR_OPEN("<tr"),
    TR_CLOSE("</tr>"),
    TD_OPEN("<td"),
    TD_CLOSE("</td>"),
    TH_OPEN("<th"),
    TH_CLOSE("</th>"),
    CLOSE_TAG(">"),
    BREAK("<br>"),
    PARAGRAPH("<p>"),
    LABEL_OPEN("<label"),
    LABEL_CLOSE("</label>"),
    HORIZONTAL_RULER("<hr>"),
    H2_OPEN("<h2>"),
    H2_CLOSE("</h2>"),
    EMPTY("");

    public String text;

    HtmlTag(String tag) {
        this.text = tag;
    }
}
