package org.example;

import org.example.proxy.Account;
import org.example.proxy.EbankService;
import org.example.proxy.EbankServiceService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EbankService stup = new EbankServiceService().getEbankServicePort();
        List<Account> list =stup.getAccounts();
        for (int i=0;i<list.size();i++){
            System.out.println("Fullname =>"+list.get(i).getFullname());
        }

    }
}