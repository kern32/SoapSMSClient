package start.point;

import soap.ws.artifact.Balance;
import soap.ws.artifact.BalanceResponse;
import soap.ws.artifact.Service;
import soap.ws.artifact.ServiceSoap;

/**
 * Created by kernel32 on 30.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ServiceSoap serviceSoap = service.getServiceSoap();
        Balance parameters = new Balance();
        parameters.setLogin("");
        parameters.setPsw("");
        BalanceResponse balance = serviceSoap.getBalance(parameters);
        String result = balance.getBalanceresult().getBalance();
        System.out.println(result);
    }
}
