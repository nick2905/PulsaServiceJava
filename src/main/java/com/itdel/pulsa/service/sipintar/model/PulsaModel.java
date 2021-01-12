package com.itdel.pulsa.service.sipintar.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "pulsas")
public class PulsaModel {
    @Id
    private String id;
    private Number pulsaPrice;
    private Number priceIdr;

    public PulsaModel(){

    }

    public PulsaModel(String id, Number pulsaPrice, Number priceIdr) {
        this.id = id;
        this.pulsaPrice = pulsaPrice;
        this.priceIdr = priceIdr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getPulsaPrice() {
        return pulsaPrice;
    }

    public void setPulsaPrice(Number pulsaPrice) {
        this.pulsaPrice = pulsaPrice;
    }

    public Number getPriceIdr() {
        return priceIdr;
    }

    public void setPriceIdr(Number priceIdr) {
        this.priceIdr = priceIdr;
    }

    @Override
    public String toString() {
        return "PulsaModel{" +
                "id='" + id + '\'' +
                ", pulsaPrice=" + pulsaPrice +
                ", priceIdr=" + priceIdr +
                '}';
    }
}
