package com.philpieper.remiorganizer;

public class BlockplanDaten
{
    public String[][][] blockplan;
    public int[][][] stundenplan;
    private int zaehler;
    public BlockplanDaten()
    {
        blockplan = new String[10][11][3];
        stundenplan = new int[6][5][2];

        //Blockplan eig nur für die Raumzuweisung
        //blockplan[Block][Zeile im Block][Spalte im Block]
        //Block LKA
        blockplan[0][0][0]="D";
        blockplan[0][0][1]="Kg";
        blockplan[0][0][2]="C21";

        blockplan[0][1][0]="E5";
        blockplan[0][1][1]="Bkr";
        blockplan[0][1][2]="C25";

        blockplan[0][2][0]="E5";
        blockplan[0][2][1]="Mo";
        blockplan[0][2][2]="C28";

        blockplan[0][3][0]="EK";
        blockplan[0][3][1]="Br";
        blockplan[0][3][2]="K18";

        blockplan[0][4][0]="EK";
        blockplan[0][4][1]="Co";
        blockplan[0][4][2]="K16";

        blockplan[0][5][0]="EW";
        blockplan[0][5][1]="Ldk";
        blockplan[0][5][2]="C27";

        blockplan[0][6][0]="M";
        blockplan[0][6][1]="Eh";
        blockplan[0][6][2]="C23";

        blockplan[0][7][0]="M";
        blockplan[0][7][1]="Pli";
        blockplan[0][7][2]="C22";

        blockplan[0][8][0]="PH";
        blockplan[0][8][1]="Fs";
        blockplan[0][8][2]="B4";

        //stundenplan[Stunde/Zeile][Wochentag/Spalte][A oder B Woche]
        //LKA-0,LKB-1,GK1-2,GK2-3,GK3-4,GK5-5,GK6-6,Gk7-7,GK9-8,GKX-9,GKS-10
        //Mo-Fr 1/2Std
        stundenplan[0][0][0] = 8;
        stundenplan[0][1][0] = 1;
        stundenplan[0][2][0] = 9;
        stundenplan[0][3][0] = 0;
        stundenplan[0][4][0] = 7;

        //Mo-Fr 3/4Std
        stundenplan[1][0][0] = 0;
        stundenplan[1][1][0] = 5;
        stundenplan[1][2][0] = 3;
        stundenplan[1][3][0] = 4;
        stundenplan[1][4][0] = 6;

        //Mo-Fr 5Std
        stundenplan[2][0][0] = 2;
        stundenplan[2][1][0] = 4;
        stundenplan[2][2][0] = 5;
        stundenplan[2][3][0] = 2;
        stundenplan[2][4][0] = 1;

        //Mo-Fr 6Std
        stundenplan[3][0][0] = 9;
        stundenplan[3][1][0] = 7;
        stundenplan[3][2][0] = 8;
        stundenplan[3][3][0] = 2;
        stundenplan[3][4][0] = 1;

        //Mo-Fr 8/9Std
        //stundenplan[4][0][0] = ;
        //stundenplan[4][1][0] = ;
        //stundenplan[4][2][0] = ;
        stundenplan[4][2][0] = 1;
        stundenplan[4][2][1] = 0;
        stundenplan[4][3][0] = 3;
        stundenplan[4][3][1] = 6;

        //Mo-Fr 10/11Std
        // stundenplan[5][0][0] = 5;
        // stundenplan[5][1][0] = 5;
        // stundenplan[5][2][0] = 5;
        // stundenplan[5][3][0] = 5;
        // stundenplan[5][4][0] = 5;

    }

}

