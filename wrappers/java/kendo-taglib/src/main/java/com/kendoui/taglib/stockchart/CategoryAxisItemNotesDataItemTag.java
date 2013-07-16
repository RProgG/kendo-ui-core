
package com.kendoui.taglib.stockchart;


import com.kendoui.taglib.BaseTag;






import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class CategoryAxisItemNotesDataItemTag extends  BaseTag  /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        CategoryAxisItemNotesDataTag parent = (CategoryAxisItemNotesDataTag)findParentWithClass(CategoryAxisItemNotesDataTag.class);

        parent.addDataItem(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "stockChart-categoryAxisItem-notes-dataItem";
    }

    public void setIcon(com.kendoui.taglib.stockchart.CategoryAxisItemNotesDataItemIconTag value) {
        setProperty("icon", value);
    }

    public void setLabel(com.kendoui.taglib.stockchart.CategoryAxisItemNotesDataItemLabelTag value) {
        setProperty("label", value);
    }

    public void setLine(com.kendoui.taglib.stockchart.CategoryAxisItemNotesDataItemLineTag value) {
        setProperty("line", value);
    }

    public float getValue() {
        return (float)getProperty("value");
    }

    public void setValue(float value) {
        setProperty("value", value);
    }

//<< Attributes

}
