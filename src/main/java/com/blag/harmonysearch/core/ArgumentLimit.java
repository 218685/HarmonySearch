package com.blag.harmonysearch.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArgumentLimit
{
    private double origin;
    private double bound;

    boolean IsWithinLimits(double number)
    {
        return origin <= number && number <= bound;
    }
}