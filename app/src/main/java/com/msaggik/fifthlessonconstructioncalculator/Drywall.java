package com.msaggik.fifthlessonconstructioncalculator;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drywall implements Serializable {
    private int widthDrywall;
    private int lengthDrywall;
    private int costDrywall;
}
