package ua.com.goit.gojava.andriidnikitin.domain.service.util;

import java.sql.SQLException;

import ua.com.goit.gojava.andriidnikitin.dao.util.MyShopDaoException;

public class MyShopException extends Exception {

	private static final long serialVersionUID = 8788269382188843317L;

	public MyShopException(String string) {
		super(string);
	}

	public MyShopException() {
		super();
	}

	public MyShopException(MyShopDaoException e) {
		super(e);
	}

	public MyShopException(SQLException e) {
		super(e);
	}

}
