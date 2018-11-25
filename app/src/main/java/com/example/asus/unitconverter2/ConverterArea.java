package com.example.asus.unitconverter2;

/**
 * Created by ASUS on 6/6/2018.
 */

public class ConverterArea {
    public enum Unit {
        SquareMeter,
        SquareKilometer,
        HECTARE,
        ARE,
        BARN,
        SquareMile,
        SquareYard,
        SquareFeet,
        SquareInch,
        ACRE,
        SECTION;

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

    public ConverterArea(Unit from, Unit to) {
        double constant = 1;

        switch (from) {
            case SquareMeter:
                if (to == Unit.SquareKilometer) {
                    constant = 1.0e-16;
                } else if (to == Unit.HECTARE) {
                    constant = 1e-4;
                } else if (to == Unit.ARE) {
                    constant = 1e-2;
                } else if (to == Unit.BARN) {
                    constant = 1.0e28;
                } else if (to == Unit.SquareMile) {
                    constant = 3.86102159e-7;
                } else if (to == Unit.SquareYard) {
                    constant = 1.19599005;
                } else if (to == Unit.SquareFeet) {
                    constant = 1.19599005;
                } else if (to == Unit.SquareInch) {
                    constant = 1550.0031;
                } else if (to == Unit.ACRE) {
                    constant = 0.000247105381;
                } else if (to == Unit.SECTION) {
                    constant = 3.86102159e-7;
                }
                break;

            case SquareKilometer:
                if (to == Unit.SquareMeter) {
                    constant = 1000000;
                } else if (to == Unit.HECTARE) {
                    constant = 100;
                } else if (to == Unit.ARE) {
                    constant = 10000;
                } else if (to == Unit.BARN) {
                    constant = 1.0e34;
                } else if (to == Unit.SquareMile) {
                    constant = 0.386102159;
                } else if (to == Unit.SquareYard) {
                    constant = 1195990.05;
                } else if (to == Unit.SquareFeet) {
                    constant = 10763910.4;
                } else if (to == Unit.SquareInch) {
                    constant = 1.5500031e9;
                } else if (to == Unit.ACRE) {
                    constant = 247.105381;
                } else if (to == Unit.SECTION) {
                    constant = 0.386102159;
                }
                break;

            case HECTARE:
                if (to == Unit.SquareMeter) {
                    constant = 10000;
                } else if (to == Unit.SquareKilometer) {
                    constant = 0.01;
                } else if (to == Unit.ARE) {
                    constant = 100;
                } else if (to == Unit.BARN) {
                    constant = 1.0e32;
                } else if (to == Unit.SquareMile) {
                    constant = 0.00386102159;
                } else if (to == Unit.SquareYard) {
                    constant = 11959.9005;
                } else if (to == Unit.SquareFeet) {
                    constant = 10.7639104;
                } else if (to == Unit.SquareInch) {
                    constant = 15500031;
                } else if (to == Unit.ACRE) {
                    constant = 2.47105381;
                } else if (to == Unit.SECTION) {
                    constant = 0.003861021599;
                }
                break;

            case ARE:
                if (to == Unit.SquareMeter) {
                    constant = 100;
                } else if (to == Unit.SquareKilometer) {
                    constant = 0.0001;
                } else if (to == Unit.HECTARE) {
                    constant = 0.01;
                } else if (to == Unit.BARN) {
                    constant = 1.0e30;
                } else if (to == Unit.SquareMile) {
                    constant = 3.86102159e-5;
                } else if (to == Unit.SquareYard) {
                    constant = 11959.9005;
                } else if (to == Unit.SquareFeet) {
                    constant = 1076.39104 ;
                } else if (to == Unit.SquareInch) {
                    constant = 155000.31;
                } else if (to == Unit.ACRE) {
                    constant = 0.0247105381;
                } else if (to == Unit.SECTION) {
                    constant = 3.86102159e-5;
                }
                break;

            case BARN:
                if (to == Unit.SquareMeter) {
                    constant = 1.0e-28;
                } else if (to == Unit.SquareKilometer) {
                    constant = 1.0e-34;
                } else if (to == Unit.HECTARE) {
                    constant = 1.0e-32;
                } else if (to == Unit.ARE) {
                    constant = 1.0e-30;
                } else if (to == Unit.SquareMile) {
                    constant = 3.86102159e-35;
                } else if (to == Unit.SquareYard) {
                    constant = 1.19599005e-28;
                } else if (to == Unit.SquareFeet) {
                    constant = 1.07639104e-27;
                } else if (to == Unit.SquareInch) {
                    constant = 1.5500031e-35;
                } else if (to == Unit.ACRE) {
                    constant = 2.47105381e-32;
                } else if (to == Unit.SECTION) {
                    constant = 3.86102159e-35;
                }
                break;

            case SquareMile:
                if (to == Unit.SquareMeter) {
                    constant = 2589988.11;
                } else if (to == Unit.SquareKilometer) {
                    constant = 2.58998811;
                } else if (to == Unit.HECTARE) {
                    constant = 258.998811;
                } else if (to == Unit.ARE) {
                    constant = 25899.8811;
                } else if (to == Unit.BARN) {
                    constant = 2.58998811e34;
                } else if (to == Unit.SquareYard) {
                    constant = 3097600;
                } else if (to == Unit.SquareFeet) {
                    constant = 27878400;
                } else if (to == Unit.SquareInch) {
                    constant = 4014896;
                } else if (to == Unit.ACRE) {
                    constant = 640;
                } else if (to == Unit.SECTION) {
                    constant = 1;
                }
                break;

            case SquareYard:
                if (to == Unit.SquareMeter) {
                    constant = 0.83612736;
                } else if (to == Unit.SquareKilometer) {
                    constant = 8.3612736e-7;
                } else if (to == Unit.HECTARE) {
                    constant = 258.998811;
                } else if (to == Unit.ARE) {
                    constant = 25899.8811;
                } else if (to == Unit.BARN) {
                    constant = 2.58998811e34;
                } else if (to == Unit.SquareMile) {
                    constant = 3.22830579e-7;
                } else if (to == Unit.SquareFeet) {
                    constant = 9;
                } else if (to == Unit.SquareInch) {
                    constant = 1296;
                } else if (to == Unit.ACRE) {
                    constant = 0.00020661157;
                } else if (to == Unit.SECTION) {
                    constant = 3.22830579e-7;
                }
                break;

            case SquareFeet:
                if (to == Unit.SquareMeter) {
                    constant = 0.09290304;
                } else if (to == Unit.SquareKilometer) {
                    constant = 9.290304e-8;
                } else if (to == Unit.HECTARE) {
                    constant = 9.290304e-6;
                } else if (to == Unit.ARE) {
                    constant = 0.0009290304;
                } else if (to == Unit.BARN) {
                    constant = 9.290304e26;
                } else if (to == Unit.SquareMile) {
                    constant = 3.58700643e-8;
                } else if (to == Unit.SquareYard) {
                    constant = 0.111111111;
                } else if (to == Unit.SquareInch) {
                    constant = 144;
                } else if (to == Unit.ACRE) {
                    constant = 2.29568411e-5;
                } else if (to == Unit.SECTION) {
                    constant = 3.58700643e-8;
                }
                break;

            case SquareInch:
                if (to == Unit.SquareMeter) {
                    constant = 0.0006;
                } else if (to == Unit.SquareKilometer) {
                    constant = 6.45e-10;
                } else if (to == Unit.HECTARE) {
                    constant = 6.45e-8;
                } else if (to == Unit.ARE) {
                    constant = 6.45e-6;
                } else if (to == Unit.BARN) {
                    constant = 6.45e24;
                } else if (to == Unit.SquareMile) {
                    constant = 2.49e-10;
                } else if (to == Unit.SquareYard) {
                    constant = 0.00077;
                } else if (to == Unit.SquareFeet) {
                    constant = 0.00077;
                } else if (to == Unit.ACRE) {
                    constant = 1.59e-7;
                } else if (to == Unit.SECTION) {
                    constant =  2.49e-10;
                }
                break;

            case ACRE:
                if (to == Unit.SquareMeter) {
                    constant = 4046.86;
                } else if (to == Unit.SquareKilometer) {
                    constant = 0.0040;
                } else if (to == Unit.HECTARE) {
                    constant = 0.405;
                } else if (to == Unit.ARE) {
                    constant = 40.46;
                } else if (to == Unit.BARN) {
                    constant = 4.04e31;
                } else if (to == Unit.SquareMile) {
                    constant = 0.0015;
                } else if (to == Unit.SquareYard) {
                    constant = 4840;
                } else if (to == Unit.SquareFeet) {
                    constant = 43560;
                } else if (to == Unit.SquareInch) {
                    constant = 6.27e6;
                } else if (to == Unit.SECTION) {
                    constant = 0.0015;
                }
                break;

            case SECTION:
                if (to == Unit.SquareMeter) {
                    constant = 2589988.11;
                } else if (to == Unit.SquareKilometer) {
                    constant = 2.58998811;
                } else if (to == Unit.HECTARE) {
                    constant = 258.998811;
                } else if (to == Unit.ARE) {
                    constant = 25899.8811;
                } else if (to == Unit.BARN) {
                    constant = 2.58998811e34;
                } else if (to == Unit.SquareMile) {
                    constant = 1;
                }else if (to == Unit.SquareYard) {
                    constant = 3097600;
                } else if (to == Unit.SquareFeet) {
                    constant = 27878400;
                } else if (to == Unit.SquareInch) {
                    constant = 4014896;
                } else if (to == Unit.ACRE) {
                    constant = 640;
                }
                break;
        }

        multiplier = constant;
    }


    public double convert(double input)
    {
        return input * multiplier;
    }

}


