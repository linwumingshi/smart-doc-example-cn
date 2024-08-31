package com.power.doc.model.json.type.info;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * animal dog 🐕
 *
 * @author linwumingshi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Dog extends Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = 5874593888222613145L;

    /**
     * can bark
     */
    private boolean bark;
    /**
     * nickName
     */
    private String nickName;

    public Dog() {
        this.nickName = "wang wang \uD83D\uDC15";
    }

    public Dog(String name, boolean bark) {
        super(name);
        this.nickName = "wang wang \uD83D\uDC15";
        this.bark = bark;
    }
}