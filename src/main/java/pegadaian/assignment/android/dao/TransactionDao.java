package pegadaian.assignment.android.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pegadaian.assignment.android.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Integer> {
}
