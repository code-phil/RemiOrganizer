package com.philpieper.remiorganizer;

public class SchuelerDaten
{
    private String[] fach;
    private String[] lehrer;
    private Integer[] block;

    public SchuelerDaten()
    {
        fach = new String[11];
        lehrer = new String[11];
        block = new Integer[11];

        //Kursbelegung, die das Program per OCR selber auslesen wird
        fach[0]="D";
        lehrer[0]="Nm";
        block[0]=2;

        fach[1]="E5";
        lehrer[1]="Bau";
        block[1]=9;

        fach[2]="KU";
        lehrer[2]="Str";
        block[2]=5;

        fach[3]="EK";
        lehrer[3]="Hnz";
        block[3]=7;

        fach[4]="M";
        lehrer[4]="Pli";
        block[4]=0;

        fach[5]="PH";
        lehrer[5]="Pli";
        block[5]=6;

        fach[6]="IF";
        lehrer[6]="Sto";
        block[6]=1;

        fach[7]="kRE";
        lehrer[7]="TeF";
        block[7]=8;

        fach[8]="SP2";
        lehrer[8]="Stb";
        block[8]=10;

        fach[9]="PKPHn";
        lehrer[9]="Sto";
        block[9]=4;

        fach[10]="Leer";
        lehrer[10]="Leer";
        block[10]=100;



    }

    public String getDataFach(int pIndex){
        if(pIndex>12){
            return null;
        }
        return fach[pIndex];
    }

    public String getDataLehrer(int pIndex){
        if(pIndex>12){
            return null;
        }
        return lehrer[pIndex];
    }

    public Integer getDataBlock(int pIndex){
        if(pIndex>12){
            return null;
        }
        return block[pIndex];
    }
}

