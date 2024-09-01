package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.model.Shipment;

import java.util.List;

public interface ShipmentService {
    Shipment addShipment(Shipment shipment);
    Shipment getShipment(Long shipmentId);
    List<Shipment> getAllShipment();
    Shipment updateShipment(Long shipmentId,Shipment shipment);
    void deleteShipment(Long shipmentId);
    void deleteAllShipment();
}
