package org.example.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.entities.Account;
import java.util.List;
@WebService(name = "ebankService")
public class EbankService {
    @WebMethod()
    public double convertion(double montant){
        return montant*23;
    }
    @WebMethod()
    public Account getAccount(@WebParam(name = "id") int id){
        return new Account(id,"hakim","hakim@gmail.com");
    }
    @WebMethod()
    public List<Account> getAccounts(){
        return List.of(
                new Account(1,"hakim","hakim@gmail.com"),
                new Account(2,"hasan","hasan@gmail.com"),
                new Account(3,"noura","noura@gmail.com")
        );
    }
}
