import java.util.HashMap;
public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Lekhan","Kumar");
        logininfo.put("Brometheus","PASSWORD");
        logininfo.put("BroCode","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
