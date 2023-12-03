<%

String psw=request.getParameter("psw");
String psw_repeat =request.getParameter("psw_repeat");


if(psw.equals(psw_repeat))
{
    out.print("successfully registered");
}
else{
    out.print("passwords is different, please try again");
}





%>
