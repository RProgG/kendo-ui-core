
package com.kendoui.taglib.stockchart;


import com.kendoui.taglib.BaseTag;






import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class CategoryAxisItemNotesDataItemLabelTag extends  BaseTag  /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        CategoryAxisItemNotesDataItemTag parent = (CategoryAxisItemNotesDataItemTag)findParentWithClass(CategoryAxisItemNotesDataItemTag.class);


        parent.setLabel(this);

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
        return "stockChart-categoryAxisItem-notes-dataItem-label";
    }

    public void setBorder(com.kendoui.taglib.stockchart.CategoryAxisItemNotesDataItemLabelBorderTag value) {
        setProperty("border", value);
    }

    public void setTemplate(CategoryAxisItemNotesDataItemLabelTemplateFunctionTag value) {
        setEvent("template", value.getBody());
    }

    public String getBackground() {
        return (String)getProperty("background");
    }

    public void setBackground(String value) {
        setProperty("background", value);
    }

    public String getColor() {
        return (String)getProperty("color");
    }

    public void setColor(String value) {
        setProperty("color", value);
    }

    public String getFont() {
        return (String)getProperty("font");
    }

    public void setFont(String value) {
        setProperty("font", value);
    }

    public String getFormat() {
        return (String)getProperty("format");
    }

    public void setFormat(String value) {
        setProperty("format", value);
    }

    public String getPosition() {
        return (String)getProperty("position");
    }

    public void setPosition(String value) {
        setProperty("position", value);
    }

    public float getRotation() {
        return (float)getProperty("rotation");
    }

    public void setRotation(float value) {
        setProperty("rotation", value);
    }

    public String getTemplate() {
        return (String)getProperty("template");
    }

    public void setTemplate(String value) {
        setProperty("template", value);
    }

    public String getText() {
        return (String)getProperty("text");
    }

    public void setText(String value) {
        setProperty("text", value);
    }

    public boolean getVisible() {
        return (boolean)getProperty("visible");
    }

    public void setVisible(boolean value) {
        setProperty("visible", value);
    }

//<< Attributes

}
