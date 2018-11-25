package com.example.asus.unitconverter2;

/**
 * Created by ASUS on 6/7/2018.
 */

public class ConverterTemp {
    public enum Unit {
        CELCIUS,
        FAHRENHEIT,
        REAUMUR,
        CELVIN,
        RANKINE;

        public static Unit fromString(String text) {
            if (text != null) {
                for (Unit unit : Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;


    public ConverterTemp(Unit from, Unit to) {
        double constant = 1;
        switch (from) {
            case CELCIUS:
                if (to == Unit.FAHRENHEIT) {
                    constant = 33.8;
                } else if (to == Unit.REAUMUR) {
                    constant = 0.8;
                } else if (to == Unit.CELVIN) {
                    constant = 274.15;
                } else if (to == Unit.RANKINE) {
                    constant = 491.67;
                }
                break;

            case FAHRENHEIT:
                if (to == Unit.CELCIUS) {
                    constant = 33.8;
                } else if (to == Unit.REAUMUR) {
                    constant = 0.8;
                } else if (to == Unit.CELVIN) {
                    constant = 274.15;
                } else if (to == Unit.RANKINE) {
                    constant = 491.67;
                }
                break;

            case REAUMUR:
                if (to == Unit.CELCIUS) {
                    constant = 33.8;
                } else if (to == Unit.FAHRENHEIT) {
                    constant = 0.8;
                } else if (to == Unit.CELVIN) {
                    constant = 274.15;
                } else if (to == Unit.RANKINE) {
                    constant = 491.67;
                }
                break;

            case CELVIN:
                if (to == Unit.CELCIUS) {
                    constant = 33.8;
                } else if (to == Unit.FAHRENHEIT) {
                    constant = 0.8;
                } else if (to == Unit.REAUMUR) {
                    constant = 274.15;
                } else if (to == Unit.RANKINE) {
                    constant = 491.67;
                }
                break;

            case RANKINE:
                if (to == Unit.CELCIUS) {
                    constant = 33.8;
                } else if (to == Unit.FAHRENHEIT) {
                    constant = 0.8;
                } else if (to == Unit.REAUMUR) {
                    constant = 274.15;
                } else if (to == Unit.CELVIN) {
                    constant = 491.67;
                }
                break;

        }
        multiplier = constant;

    }
        public double convert(double input) {

        return input * multiplier;

    }



}