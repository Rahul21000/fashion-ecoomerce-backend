package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.model.Payment;

import java.util.List;

public interface PaymentService {
    Payment addPayment(Payment payment);
    Payment getPayment(Long paymentId);
    List<Payment> getAllPayment();
    Payment updatePayment(Long paymentId,Payment payment);
    void deletePayment(Long paymentId);
    void deleteAllPayment();
}
