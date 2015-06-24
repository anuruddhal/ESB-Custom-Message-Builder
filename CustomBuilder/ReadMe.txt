Applies To       : WSO2 ESB 4.8.1
Associated JIRA  : https://support.wso2.com/jira/browse/DGCITPROD-15


DESCRIPTION
-----------
This project contains a custom message builder to filter invalid xml characters in message.


INSTALLATION INSTRUCTIONS
-------------------------
(i) Shutdown the ESB server, if you have already started.

(ii) Go inside CustomeBuilder Directory and execute command.
     mvn clean install

(ii) Go to CustomBuilder/target directory and copy org.wso2.custombuilder-1.0.jar file to <ESB_HOME>/repository/components/lib directory.

(iii) Open axis2.xml file located at <ESB_HOME>/repository/conf/axis2/axis2.xml  and replace
       <messageBuilder contentType="text/plain"
                               class="org.apache.axis2.format.PlainTextBuilder"/>
       with
      <messageBuilder contentType="text/plain"
                                class="org.wso2.custombuilder.CustomMessageBuilder"/>

(iv) Restart the server with :
       Linux/Unix :  sh wso2server.sh