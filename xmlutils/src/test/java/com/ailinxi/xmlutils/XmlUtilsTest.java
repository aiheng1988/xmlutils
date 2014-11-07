package com.ailinxi.xmlutils;

/**
 * @author aiheng@jd.com
 * @date 2014年11月7日 下午5:26:57
 * @desc 
 */
public class XmlUtilsTest
{

    public static void main(String[] args)
        throws Exception
    {
        User user = new User("ahern88", "123");
        String xml = XmlUtils.beanToXml(user);
        User u = XmlUtils.xmlToBean(xml, User.class);
        System.out.println(u.getName() + " " + u.getPassword());
    }

}
