package io.tharindu.wallet.service;

import io.tharindu.wallet.domain.Transaction;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class TransactionServiceTest {


    private TransactionServiceImpl service;

    @Test
    @DisplayName("Testing addTransaction method")
    void testAddTransaction () {
        Transaction tx = new Transaction ();
        tx.setCreated ( LocalDateTime.now () );
        tx.setSender ( RandomStringUtils.randomAlphabetic ( 5 ) );
        tx.setReceiver ( RandomStringUtils.randomAlphabetic ( 5 ) );
        tx.setRemark ( "testAddTransaction" );
        tx.setValue ( 5 );
        Transaction output = service.addTransaction ( tx );

    }

}