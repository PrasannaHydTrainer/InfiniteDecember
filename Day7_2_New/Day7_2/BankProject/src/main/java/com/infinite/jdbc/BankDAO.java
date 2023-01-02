package com.infinite.jdbc;

import java.sql.SQLException;

public interface BankDAO {

	String createAccount(Bank bank) throws SQLException, ClassNotFoundException;
}
