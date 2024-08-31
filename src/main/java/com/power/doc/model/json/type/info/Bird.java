package com.power.doc.model.json.type.info;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * animal bird
 *
 * @author linwumingshi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Bird extends Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = -6823489844097910354L;
    
    /**
     * wingSpan
     */
    private double wingSpan;
    /**
     * nickName
     */
    private String nickName;

    public Bird() {
        this.nickName = "bird";
    }

    public Bird(String name, double wingSpan) {
        super(name);
        this.nickName = "bird";
        this.wingSpan = wingSpan;
    }

}