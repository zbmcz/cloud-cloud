package com.boming.cloud.entities;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class PaymentEntity {

    private Long id;

    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
