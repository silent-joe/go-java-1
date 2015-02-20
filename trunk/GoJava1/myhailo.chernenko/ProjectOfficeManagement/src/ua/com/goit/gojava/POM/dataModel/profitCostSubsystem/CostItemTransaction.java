package ua.com.goit.gojava.POM.dataModel.profitCostSubsystem;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import ua.com.goit.gojava.POM.dataModel.common.FinancialDocument;

public class CostItemTransaction implements Serializable {

	private static final long serialVersionUID = -916804494020185343L;
	private long id = 0;
	private Date date = Calendar.getInstance().getTime();
	private String description = "";
	private long sum = 0;
	private FinancialDocument doc;
	
	public long getId() {
		
		return id;
		
	}
	
	public void setId(long id) {
		
		this.id = id;
		
	}
	
	public Date getDate() {
		
		return date;
		
	}
	
	public void setDate(Date date) {
		
		this.date = date;
		
	}
	
	public String getDescription() {
		
		return description;
		
	}
	
	public void setDescription(String description) {
		
		this.description = description;
		
	}
	
	public long getSum() {
		
		return sum;
		
	}
	
	public void setSum(long sum) {
		
		this.sum = sum;
		
	}
	
	public FinancialDocument getDoc() {
		
		return doc;
		
	}
	
	public void setDoc(FinancialDocument doc) {
		
		this.doc = doc;
		
	}
	
}