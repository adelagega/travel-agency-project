package service;

import model.Payment;
import model.PaymentStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PaymentService {
   private List <Payment> payments;

    public PaymentService(List<Payment> payments) {
        this.payments=new ArrayList<>(payments);
    }

    public List<Payment> getPaymentByState(PaymentStatus status){
        return payments.stream()
                .filter(payment -> payment.getPaymentStatus().equals(status))
                .collect(Collectors.toList());
    }
}
