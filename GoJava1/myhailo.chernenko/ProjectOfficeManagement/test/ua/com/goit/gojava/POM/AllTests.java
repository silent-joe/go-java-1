package ua.com.goit.gojava.POM;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//import ua.com.goit.gojava.POM.dataModel.*;





import ua.com.goit.gojava.POM.dataModel.cash.*;
import ua.com.goit.gojava.POM.dataModel.common.*;
import ua.com.goit.gojava.POM.dataModel.documents.*;
import ua.com.goit.gojava.POM.dataModel.profitcost.*;
import ua.com.goit.gojava.POM.persistence.fileDB.*;

@RunWith(Suite.class)
@SuiteClasses({ 
		BankAccountTest.class,
		CashMovementEntryTest.class,
		CashMovementStatementTest.class,

		DateConverterTest.class,
		FinancialStatementTest.class,
		MoneyTest.class,

		PaymentDocumentTest.class,
		
		CostItemTest.class, 
		CostItemTransactionTest.class,
		ProjectFinResultTransactionTest.class, 
		ProjectStageTest.class,
		ProjectTest.class,
		
		DataManagerTest.class,
		ProjectDAOTest.class,
		CostItemDAOTest.class
		
	})

public class AllTests {

}
