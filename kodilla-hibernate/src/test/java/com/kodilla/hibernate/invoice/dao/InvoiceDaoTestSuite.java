package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("11/02/2021");

        Product fifa = new Product("Fifa");
        Product nba = new Product("NBA");
        Product grid = new Product("Grid");

        Item itemFifa = new Item (fifa, new BigDecimal(199), 1);
        Item itemNba = new Item (nba, new BigDecimal(259), 3);
        Item itemGrid = new Item (grid, new BigDecimal(125), 18);

        itemFifa.setInvoice(invoice);
        itemNba.setInvoice(invoice);
        itemGrid.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemFifa);
        items.add(itemNba);
        items.add(itemGrid);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        Optional<Invoice> invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assertions.assertTrue(invoiceReadFromDB.isPresent());
        Assertions.assertNotEquals(0, invoiceReadFromDB.get().getId());
        Assertions.assertEquals(3, invoiceReadFromDB.get().getItems().size());

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }


}
