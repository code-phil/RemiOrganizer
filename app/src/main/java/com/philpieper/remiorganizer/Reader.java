package com.philpieper.remiorganizer;

//Holt Daten vom Blockplan und vom Kursbelegungsscan und erstellt daraus die Daten für den Stundenplan
public class Reader {
    private BlockplanDaten blockplanDaten;
    private SchuelerDaten schuelerDaten;

    public Reader() {
        blockplanDaten = new BlockplanDaten();
        schuelerDaten = new SchuelerDaten();
    }

    private String readDataRaumSuche(int pKursbelegungSpalte) {
        for (int i = 0; i < 11; i++) {
            if (blockplanDaten.blockplan[schuelerDaten.getDataBlock(pKursbelegungSpalte)][i][0] == schuelerDaten.getDataFach(pKursbelegungSpalte)) {
                if (blockplanDaten.blockplan[schuelerDaten.getDataBlock(pKursbelegungSpalte)][i][1] == schuelerDaten.getDataLehrer(pKursbelegungSpalte)) {
                    return blockplanDaten.blockplan[schuelerDaten.getDataBlock(pKursbelegungSpalte)][i][2];
                }
            }
        }

        return null;
    }

    public String readDataStundenplan(int pStunde, int pTag, int pAoderB) {
        String fach = "";

        for (int i = 0; i < 11; i++) {

            if (schuelerDaten.getDataBlock(i) == blockplanDaten.stundenplan[pStunde][pTag][pAoderB]) {

                fach = schuelerDaten.getDataFach(i);
                fach = fach.toLowerCase();

                switch (fach) {
                    case "m":
                        fach = "Mathe";
                        break;
                    case "kre":
                        fach = "Religion";
                        break;
                    case "d":
                        fach = "Deutsch";
                        break;
                    case "e5":
                        fach = "Englisch";
                        break;
                }

                //return "Am "+pTag+"ten Tag, in der "+pStunde+"ten Sunde ist das Fach "+schuelerDaten.getDataFach(i)+" mit dem Lehrer "+schuelerDaten.getDataLehrer(i)+" in dem Raum "+readDataRaumSuche(i)+" dran";
                return fach + " " + readDataRaumSuche(i);
            }

        }
        return null;
    }
}
