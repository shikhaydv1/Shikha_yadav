function validation(){
    var ac=Document.getElementById("#accountnumber");
    if(ac.value==""){
        
        Document.getElementById("#Ac").style.visibility="visible";
        return false;
    }
    else{
        return true;
    }
}