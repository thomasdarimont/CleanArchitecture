package biz.paluch.clean.architecture.applicationmodel;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 01.08.13 07:51
 */
public class Item
{
    private String item;

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }
}
