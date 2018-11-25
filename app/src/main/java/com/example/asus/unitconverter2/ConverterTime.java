package com.example.asus.unitconverter2;

import static com.example.asus.unitconverter2.ConverterTime.Unit.SECOND;

/**
 * Created by ASUS on 6/7/2018.
 */

public class ConverterTime {
    public enum Unit {
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK,
        MONTH,
        YEAR,
        DECADE,
        CENTURY,
        MILLENNIUM;

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

    public ConverterTime (Unit from, Unit to){
        double constant = 1;

        switch (from) {
            case SECOND:
                if (to == Unit.MINUTE) {
                    constant = 0.0166;
                } else if (to == Unit.HOUR) {
                    constant = 0.000277;
                } else if (to == Unit.DAY) {
                    constant = 1.15e-5;
                } else if (to == Unit.WEEK) {
                    constant = 1.653e-6;
                } else if (to == Unit.MONTH) {
                    constant = 3.80e-7;
                } else if (to == Unit.YEAR) {
                    constant = 3.171e-8;
                } else if (to == Unit.DECADE) {
                    constant = 3.171e-9;
                } else if (to == Unit.CENTURY) {
                    constant = 3.171e-10;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 3.171e-11;
                }
                break;

            case MINUTE:
                if (to == Unit.SECOND) {
                    constant = 60 ;
                } else if (to == Unit.HOUR) {
                    constant = 0.0166;
                } else if (to == Unit.DAY) {
                    constant = 0.00069;
                } else if (to == Unit.WEEK) {
                    constant = 9.92e-5;
                } else if (to == Unit.MONTH) {
                    constant = 2.28e-5;
                } else if (to == Unit.YEAR) {
                    constant = 1.90e-6;
                } else if (to == Unit.DECADE) {
                    constant = 1.90e-7;
                } else if (to == Unit.CENTURY) {
                    constant = 1.90e-8;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 1.90e-9;
                }
                break;

            case HOUR:
                if (to == Unit.SECOND) {
                    constant = 3600 ;
                } else if (to == Unit.MINUTE) {
                    constant = 60;
                } else if (to == Unit.DAY) {
                    constant = 0.041;
                } else if (to == Unit.WEEK) {
                    constant = 0.0059;
                } else if (to == Unit.MONTH) {
                    constant = 0.0013;
                } else if (to == Unit.YEAR) {
                    constant = 0.00011;
                } else if (to == Unit.DECADE) {
                    constant = 1.14e-5;
                } else if (to == Unit.CENTURY) {
                    constant = 1.14e-6;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 1.14e-7;
                }
                break;

            case DAY:
                if (to == Unit.SECOND) {
                    constant = 86400 ;
                } else if (to == Unit.MINUTE) {
                    constant = 1440;
                } else if (to == Unit.HOUR) {
                    constant = 24;
                } else if (to == Unit.WEEK) {
                    constant = 0.14;
                } else if (to == Unit.MONTH) {
                    constant = 0.032;
                } else if (to == Unit.YEAR) {
                    constant = 0.0027;
                } else if (to == Unit.DECADE) {
                    constant = 0.00027;
                } else if (to == Unit.CENTURY) {
                    constant = 0.000027;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 0.0000027;
                }
                break;

            case WEEK:
                if (to == Unit.SECOND) {
                    constant = 604800 ;
                } else if (to == Unit.MINUTE) {
                    constant = 10080;
                } else if (to == Unit.HOUR) {
                    constant = 168;
                } else if (to == Unit.DAY) {
                    constant = 7;
                } else if (to == Unit.MONTH) {
                    constant = 0.23;
                } else if (to == Unit.YEAR) {
                    constant = 0.019;
                } else if (to == Unit.DECADE) {
                    constant = 0.0019;
                } else if (to == Unit.CENTURY) {
                    constant = 0.00019;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 0.000019;
                }
                break;

            case MONTH:
                if (to == Unit.SECOND) {
                    constant = 2.62e6 ;
                } else if (to == Unit.MINUTE) {
                    constant = 43799.9;
                } else if (to == Unit.HOUR) {
                    constant = 729.9;
                } else if (to == Unit.DAY) {
                    constant = 30.41;
                } else if (to == Unit.WEEK) {
                    constant = 4.34;
                } else if (to == Unit.YEAR) {
                    constant = 0.083;
                } else if (to == Unit.DECADE) {
                    constant = 0.0083;
                } else if (to == Unit.CENTURY) {
                    constant = 0.00083;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 0.000083;
                }
                break;

            case YEAR:
                if (to == Unit.SECOND) {
                    constant = 3.15e7 ;
                } else if (to == Unit.MINUTE) {
                    constant = 525600;
                } else if (to == Unit.HOUR) {
                    constant = 8760;
                } else if (to == Unit.DAY) {
                    constant = 365;
                } else if (to == Unit.WEEK) {
                    constant = 52.14;
                } else if (to == Unit.MONTH) {
                    constant = 12;
                } else if (to == Unit.DECADE) {
                    constant = 0.1;
                } else if (to == Unit.CENTURY) {
                    constant = 0.01;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 0.001;
                }
                break;

            case DECADE:
                if (to == Unit.SECOND) {
                    constant = 3.15e8 ;
                } else if (to == Unit.MINUTE) {
                    constant = 5.25e6;
                } else if (to == Unit.HOUR) {
                    constant = 87600;
                } else if (to == Unit.DAY) {
                    constant = 3650;
                } else if (to == Unit.WEEK) {
                    constant = 521.4;
                } else if (to == Unit.MONTH) {
                    constant = 120;
                } else if (to == Unit.YEAR) {
                    constant = 10;
                } else if (to == Unit.CENTURY) {
                    constant = 0.1;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 0.01;
                }
                break;

            case CENTURY:
                if (to == Unit.SECOND) {
                    constant = 3.15e9 ;
                } else if (to == Unit.MINUTE) {
                    constant = 5.25e7;
                } else if (to == Unit.HOUR) {
                    constant = 876000;
                } else if (to == Unit.DAY) {
                    constant = 36500;
                } else if (to == Unit.WEEK) {
                    constant = 5214.4;
                } else if (to == Unit.MONTH) {
                    constant = 1200;
                } else if (to == Unit.YEAR) {
                    constant = 100;
                } else if (to == Unit.DECADE) {
                    constant = 10;
                } else if (to == Unit.MILLENNIUM) {
                    constant = 0.1;
                }
                break;

            case MILLENNIUM:
                if (to == Unit.SECOND) {
                    constant = 3.15e10 ;
                } else if (to == Unit.MINUTE) {
                    constant = 5.25e8;
                } else if (to == Unit.HOUR) {
                    constant = 8760000;
                } else if (to == Unit.DAY) {
                    constant = 365000;
                } else if (to == Unit.WEEK) {
                    constant = 52144.2;
                } else if (to == Unit.MONTH) {
                    constant = 12000;
                } else if (to == Unit.YEAR) {
                    constant = 1000;
                } else if (to == Unit.DECADE) {
                    constant = 100;
                } else if (to == Unit.CENTURY) {
                    constant = 10;
                }
                break;
        }

        multiplier = constant;
    }
        public double convert(double input) {

        return input * multiplier;
        }
}

