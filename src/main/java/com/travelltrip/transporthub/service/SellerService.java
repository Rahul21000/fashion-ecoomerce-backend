package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.model.Seller;

import java.util.List;

public interface SellerService {
    Seller addSeller(Seller seller);
    Seller getSeller(Long sellerId);
    List<Seller> getAllSeller();
    Seller updateSeller(Long sellerId,Seller seller);
    void deleteSeller(Long sellerId);
    void deleteAllSeller();
}
