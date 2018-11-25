package com.example.asus.unitconverter2;

/**
 * Created by ASUS on 6/6/2018.
 */

public class ConverterWeight {
    public enum Unit {
        KILOGRAM,
        GRAM,
        MICROGRAM,
        POUND,
        OUNCE,
        TON,
        QUINTAL,
        CARAT,
        DALTON;

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

    public ConverterWeight (Unit from, Unit to) {
        double constant = 1;

        switch (from) {
            case KILOGRAM:
                if (to == Unit.GRAM) {
                    constant = 1000 ;
                } else if (to == Unit.MICROGRAM) {
                    constant = 1000000000;
                } else if (to == Unit.POUND) {
                    constant = 2.20;
                } else if (to == Unit.OUNCE) {
                    constant = 35.27;
                } else if (to == Unit.TON) {
                    constant = 0.001;
                } else if (to == Unit.QUINTAL) {
                    constant = 100;
                } else if (to == Unit.CARAT) {
                    constant = 5000;
                } else if (to == Unit.DALTON) {
                    constant = 6.02e26;
                }
                break;

            case GRAM:
                if (to == Unit.KILOGRAM) {
                    constant = 0.001 ;
                } else if (to == Unit.MICROGRAM) {
                    constant = 1000000;
                } else if (to == Unit.POUND) {
                    constant = 0.0022;
                } else if (to == Unit.OUNCE) {
                    constant = 0.035;
                } else if (to == Unit.TON) {
                    constant = 1e-6;
                } else if (to == Unit.QUINTAL) {
                    constant = 1e-5;
                } else if (to == Unit.CARAT) {
                    constant = 5;
                } else if (to == Unit.DALTON) {
                    constant = 6.022e23;
                }
                break;

            case MICROGRAM:
                if (to == Unit.KILOGRAM) {
                    constant = 1e-9 ;
                } else if (to == Unit.GRAM) {
                    constant = 1e-6;
                } else if (to == Unit.POUND) {
                    constant = 2.20e-9;
                } else if (to == Unit.OUNCE) {
                    constant = 3.52e-8;
                } else if (to == Unit.TON) {
                    constant = 1e-12;
                } else if (to == Unit.QUINTAL) {
                    constant = 1e-11;
                } else if (to == Unit.CARAT) {
                    constant = 5e-6;
                } else if (to == Unit.DALTON) {
                    constant = 6.022e17;
                }
                break;

            case POUND:
                if (to == Unit.KILOGRAM) {
                    constant = 0.453 ;
                } else if (to == Unit.GRAM) {
                    constant = 453.59;
                } else if (to == Unit.MICROGRAM) {
                    constant = 4.5e+8;
                } else if (to == Unit.OUNCE) {
                    constant = 16;
                } else if (to == Unit.TON) {
                    constant = 0.00045;
                } else if (to == Unit.QUINTAL) {
                    constant = 0.0045;
                } else if (to == Unit.CARAT) {
                    constant = 2267.96;
                } else if (to == Unit.DALTON) {
                    constant = 2.7e26;
                }
                break;

            case OUNCE:
                if (to == Unit.KILOGRAM) {
                    constant = 0.028 ;
                } else if (to == Unit.GRAM) {
                    constant = 453.59;
                } else if (to == Unit.MICROGRAM) {
                    constant = 2.8e7;
                } else if (to == Unit.POUND) {
                    constant = 0.0625;
                } else if (to == Unit.TON) {
                    constant = 2.83e-5;
                } else if (to == Unit.QUINTAL) {
                    constant = 0.00028;
                } else if (to == Unit.CARAT) {
                    constant = 141.74;
                } else if (to == Unit.DALTON) {
                    constant = 1.7e25;
                }
                break;

            case TON:
                if (to == Unit.KILOGRAM) {
                    constant = 1000 ;
                } else if (to == Unit.GRAM) {
                    constant = 1000000;
                } else if (to == Unit.MICROGRAM) {
                    constant = 1e12;
                } else if (to == Unit.POUND) {
                    constant = 2204.62;
                } else if (to == Unit.OUNCE) {
                    constant = 35274;
                } else if (to == Unit.QUINTAL) {
                    constant = 10;
                } else if (to == Unit.CARAT) {
                    constant = 5e6;
                } else if (to == Unit.DALTON) {
                    constant = 6.02e29;
                }
                break;

            case QUINTAL:
                if (to == Unit.KILOGRAM) {
                    constant = 100;
                } else if (to == Unit.GRAM) {
                    constant = 100000;
                } else if (to == Unit.MICROGRAM) {
                    constant = 1e11;
                } else if (to == Unit.POUND) {
                    constant = 220.46;
                } else if (to == Unit.OUNCE) {
                    constant = 3527.4;
                } else if (to == Unit.TON) {
                    constant = 0.1;
                } else if (to == Unit.CARAT) {
                    constant = 500000;
                } else if (to == Unit.DALTON) {
                    constant = 6.02e28;
                }
                break;

            case CARAT:
                if (to == Unit.KILOGRAM) {
                    constant = 0.0002;
                } else if (to == Unit.GRAM) {
                    constant = 0.2;
                } else if (to == Unit.MICROGRAM) {
                    constant = 200000;
                } else if (to == Unit.POUND) {
                    constant = 0.000440925;
                } else if (to == Unit.OUNCE) {
                    constant = 0.0070;
                } else if (to == Unit.TON) {
                    constant = 2e-7;
                } else if (to == Unit.QUINTAL) {
                    constant = 2e-6;
                } else if (to == Unit.DALTON) {
                    constant = 1.20e23;
                }
                break;

            case DALTON:
                if (to == Unit.KILOGRAM) {
                    constant = 1.66054e-27;
                } else if (to == Unit.GRAM) {
                    constant = 1.66054e-24;
                } else if (to == Unit.MICROGRAM) {
                    constant = 1.66054e-18;
                } else if (to == Unit.POUND) {
                    constant = 3.66086e-27;
                } else if (to == Unit.OUNCE) {
                    constant = 5.85738e-26;
                } else if (to == Unit.TON) {
                    constant = 1.66054e-30;
                } else if (to == Unit.QUINTAL) {
                    constant = 1.66054e-29;
                } else if (to == Unit.CARAT) {
                    constant = 8.30269e-24;
                }
                break;
        }

        multiplier = constant;
    }

    public double convert(double input) {

        return input * multiplier;
    }
}
