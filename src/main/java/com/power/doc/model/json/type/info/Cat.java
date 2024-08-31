package com.power.doc.model.json.type.info;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * animal cat 🐱
 *
 * @author linwumingshi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Cat extends Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = -5775506044918669428L;
    /**
     * can climb
     */
    private boolean climb;

    /**
     * nickName
     */
    private String nickName;

    public Cat() {
        this.nickName = "mi mi \uD83D\uDC31";
    }

    public Cat(String name, boolean climb) {
        super(name);
        this.nickName = "mi mi \uD83D\uDC31";
        this.climb = climb;
    }
}
