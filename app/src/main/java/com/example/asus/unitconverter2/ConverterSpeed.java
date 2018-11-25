package com.example.asus.unitconverter2;

/**
 * Created by ASUS on 6/7/2018.
 */

public class ConverterSpeed {
    public enum Unit {
        METERSECOND,
        METERHOUR,
        KILOMETERSECOND,
        KILOMETERHOUR,
        MILESECOND,
        MILEHOUR,
        LIGHTVELOCITY,
        MACH;

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

    public ConverterSpeed(Unit from, Unit to) {
        double constant = 1;

        switch (from) {
            case METERSECOND:
                if (to == Unit.METERHOUR) {
                    constant = 3600 ;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 0.001;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 3.6;
                } else if (to == Unit.MILESECOND) {
                    constant = 0.00062;
                } else if (to == Unit.MILEHOUR) {
                    constant = 2.23694;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 3.33564e-9;
                } else if (to == Unit.MACH) {
                    constant = 0.0029;
                }
                break;

            case METERHOUR:
                if (to == Unit.METERSECOND) {
                    constant = 0.00027 ;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 2.77e-7;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 0.001;
                } else if (to == Unit.MILESECOND) {
                    constant = 1.72e-7;
                } else if (to == Unit.MILEHOUR) {
                    constant = 0.00062;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 9.26567e-13;
                } else if (to == Unit.MACH) {
                    constant = 8.09848e-7;
                }
                break;

            case KILOMETERSECOND:
                if (to == Unit.METERSECOND) {
                    constant = 1000 ;
                } else if (to == Unit.METERHOUR) {
                    constant = 3600000;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 3600;
                } else if (to == Unit.MILESECOND) {
                    constant = 0.62;
                } else if (to == Unit.MILEHOUR) {
                    constant = 2236.94;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 3.33564e-6;
                } else if (to == Unit.MACH) {
                    constant = 2.91545;
                }
                break;

            case KILOMETERHOUR:
                if (to == Unit.METERSECOND) {
                    constant = 0.27 ;
                } else if (to == Unit.METERHOUR) {
                    constant = 1000;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 0.00027;
                } else if (to == Unit.MILESECOND) {
                    constant = 0.00017;
                } else if (to == Unit.MILEHOUR) {
                    constant = 0.62;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 9.26567e-10;
                } else if (to == Unit.MACH) {
                    constant = 0.00080;
                }
                break;

            case MILESECOND:
                if (to == Unit.METERSECOND) {
                    constant = 1609.34 ;
                } else if (to == Unit.METERHOUR) {
                    constant = 5793638.4;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 1.60;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 5793.64;
                } else if (to == Unit.MILEHOUR) {
                    constant = 3600;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 5.36819e-6;
                } else if (to == Unit.MACH) {
                    constant = 4.69;
                }
                break;

            case MILEHOUR:
                if (to == Unit.METERSECOND) {
                    constant = 0.44 ;
                } else if (to == Unit.METERHOUR) {
                    constant = 1609.34;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 0.00044;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 1.60;
                } else if (to == Unit.MILESECOND) {
                    constant = 0.00027;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 1.49116e-9;
                } else if (to == Unit.MACH) {
                    constant = 0.0013;
                }
                break;

            case LIGHTVELOCITY:
                if (to == Unit.METERSECOND) {
                    constant = 2.998e+8 ;
                } else if (to == Unit.METERHOUR) {
                    constant = 1.079e+12;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 299792;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 1.079e9;
                } else if (to == Unit.MILESECOND) {
                    constant = 186282;
                } else if (to == Unit.MILEHOUR) {
                    constant = 6.706e8;
                } else if (to == Unit.MACH) {
                    constant = 874030;
                }
                break;

            case MACH:
                if (to == Unit.METERSECOND) {
                    constant = 343 ;
                } else if (to == Unit.METERHOUR) {
                    constant = 1.235e6;
                } else if (to == Unit.KILOMETERSECOND) {
                    constant = 1225.04;
                } else if (to == Unit.KILOMETERHOUR) {
                    constant = 1234.8;
                } else if (to == Unit.MILESECOND) {
                    constant = 0.21;
                } else if (to == Unit.MILEHOUR) {
                    constant = 767.26;
                } else if (to == Unit.LIGHTVELOCITY) {
                    constant = 1.14412e-6;
                }
                break;
        }

        multiplier = constant;
    }

    public double convert(double input) {

        return input * multiplier;
    }
}
