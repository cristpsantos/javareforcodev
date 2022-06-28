package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	private OnlinePaymentService onlinePayment;
		
	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public void processContract(Contract contract, Integer months) throws ParseException {
		
		for (int i=1; i<=months; i++) {
			Date date = contract.getDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, i);
			date = cal.getTime();
			
			Double parcialValue = onlinePayment.interest(contract.getTotalValue() / months,  i);
			Double finalValue = onlinePayment.paymentFee(parcialValue);
			
			contract.getInstallments().add(new Installment(date, finalValue));			
		}		
	}
}
