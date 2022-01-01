package com.appsdeveloperblog.estore.usersservice.handlers;

import com.appsdeveloperblog.estore.sagacoreapi.models.PaymentDetails;
import com.appsdeveloperblog.estore.sagacoreapi.models.User;
import com.appsdeveloperblog.estore.sagacoreapi.query.FetchUserPaymentDetailsQuery;
import org.springframework.stereotype.Component;

@Component
public class UserEventsHandler {

    public User getUserPaymentDetails(FetchUserPaymentDetailsQuery userPaymentDetails){
        PaymentDetails paymentDetails = PaymentDetails.builder()
                .cardNumber("123Card")
                .cvv("123")
                .name("NASH FORBES")
                .validUntilMonth(12)
                .validUntilYear(2040)
                .build();

        User userRest = User.builder()
                .firstName("Nashid")
                .lastName("Forbes")
                .userId(userPaymentDetails.getUserId())
                .paymentDetails(paymentDetails)
                .build();

        return userRest;
    }
}
