package com.ewalllet.repository;

import java.util.List;

import com.ewalllet.model.Ewallet;
import com.ewalllet.model.Statement;

public interface EwalletService {
	public List<Ewallet> getWallets();
	public Ewallet addWallet();
	public void addMoney();
	public void update();
	public Ewallet getById();
	public void deleteById();
	public List<Statement> getStatementsById();
	public List<Statement> getStatements();
}
