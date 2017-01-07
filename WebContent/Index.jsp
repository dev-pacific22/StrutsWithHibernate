<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
 
 
     
 <link rel="stylesheet" href="css/test.css">
 
 
<h1>Contact Manager</h1>
<s:actionerror/>
 
<s:form action="add" method="post">
    <s:textfield name="contact.firstName" label="Firstname">
    <s:textfield name="contact.lastName" label="Lastname">
    <s:textfield name="contact.emailId" label="Email">
    <s:textfield name="contact.cellNo" label="Cell No.">
    <s:textfield name="contact.website" label="Homepage">
    <s:textfield name="contact.birthDate" label="Birthdate">
    <s:submit value="Add Contact" align="center">
</s:submit></s:textfield></s:textfield></s:textfield></s:textfield></s:textfield></s:textfield></s:form>
 
 
<h2>Contacts</h2>

    <table>
<tbody><tr>
    <th>Name</th>
    <th>Email</th>
    <th>Cell No.</th>
    <th>Birthdate</th>
    <th>Homepage</th>
    <th>Delete</th>
</tr>
<s:iterator value="contactList" var="contact">
<tr>
        <td><s:property value="lastName"></s:property>, <s:property value="firstName"></s:property></td>
        <td><s:property value="emailId"></s:property></td>
        <td><s:property value="cellNo"></s:property></td>
        <td><s:property value="birthDate"></s:property></td>
      
    </tr>   
 </s:iterator>
</tbody></table>

 
 
