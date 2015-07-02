package sample.spring.chapter08.bankapp.dao;

import java.util.List;

import sample.spring.chapter08.bankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
	List<FixedDepositDetails> getInactiveFixedDeposits();
	void setFixedDepositsAsActive(List<FixedDepositDetails> fds);
	List<FixedDepositDetails> findFixedDepositsByBankAccount(int bankAccountId);
}
