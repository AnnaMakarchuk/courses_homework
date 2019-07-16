package com.Anna.UnknownPattern_12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReceiptService {
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/M/yyyy");
    private static List<Reciept> recieptList = new ArrayList<>();


    public static List<Reciept> createRecieptList() {
        recieptList.add(new Reciept("Ann", "Dc. Braun", "augomentin",
                LocalDate.parse("11/05/2019", FORMATTER)));
        recieptList.add(new Reciept("Vika", "Dc. Braun", "peniciline",
                LocalDate.parse("14/04/2019", FORMATTER)));
        return recieptList;
    }

    public List<Reciept> dateExtension(String date) {
        LocalDate expiredDate = LocalDate.parse(date, FORMATTER);
        recieptList = ReceiptService.createRecieptList();
        List<Reciept> copyReceipt = new ArrayList<>();
        for (Reciept receipt : recieptList) {
            if (receipt.getReceiptDuration().isBefore(LocalDate.now())) {
                System.out.println("old receipt " + receipt);
                copyReceipt.add(receipt.clone(expiredDate));
            }
        }
        return copyReceipt;
    }
}
