package pl.vetpet.service;

import pl.vetpet.model.Bill;
import pl.vetpet.model.Invoice;

public interface InvoiceBillService {

    void createNewInvoice(Invoice invoice);

    void editInvoice(Invoice invoice);

    void deleteInvoice(Invoice invoice);

    void createNewBill(Bill bill);

    void editBill(Bill bill);

    void deleteBill(Bill bill);

    void findBill(Bill bill);

    void findInvoice(Invoice invoice);
}
