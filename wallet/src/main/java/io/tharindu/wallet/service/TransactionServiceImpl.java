package io.tharindu.wallet.service;

import io.tharindu.wallet.domain.Transaction;
import io.tharindu.wallet.repository.TransactionRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    @NonNull
    private TransactionRepository transactionRepository;

    @Override
    public Transaction addTransaction ( Transaction transaction ) {
        return transactionRepository.save ( transaction );
    }
}
