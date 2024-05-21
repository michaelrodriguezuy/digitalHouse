package service;

import java.util.List;

import model.Checkout;

public interface ICheckoutService {

    public Checkout buildCheckout(List<String> productIds);


}
