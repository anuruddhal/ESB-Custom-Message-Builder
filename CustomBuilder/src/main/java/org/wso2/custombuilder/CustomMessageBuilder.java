package org.wso2.custombuilder;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.format.PlainTextBuilder;


/**
 * Created by anuruddha on 6/24/15.
 */
public class CustomMessageBuilder extends PlainTextBuilder {

    @Override
    public OMElement processDocument(String content, String contentType, MessageContext msgContext) throws AxisFault {
        content=cleanInvalidXmlChars(content, "");
        return super.processDocument(content, contentType, msgContext);
    }


    public static String cleanInvalidXmlChars(String text, String replacement) {
        String re = "[^\\x09\\x0A\\x0D\\x20-\\xD7FF\\xE000-\\xFFFD\\x10000-x10FFFF]";
        return text.replaceAll(re, replacement);
    }
}
