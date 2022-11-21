package ZZZZZdojopyramid;

import java.util.ArrayList;

/*
Enoncé

La pyramide de Sastantua est un exercice extrait de la piscine de l’école 42 que les candidat peuvent faire en bonus.

Voici une pyramide de taille 5 :
$ ./sastantua 5
*/

//                                   /*\
//                                  /***\
//                                 /*****\
//                              /***********\
//                             /*************\
//                            /***************\
//                           /*****************\
//                        /***********************\
//                       /*************************\
//                      /***************************\
//                     /*****************************\
//                    /*******************************\
//                /***************************************\
//               /*****************************************\
//              /*******************************************\
//             /*********************************************\
//            /***********************************************\
//           /*************************************************\
//       /*********************************************************\
//      /***********************************************************\
//     /****************************|||||****************************\
//    /*****************************|||||*****************************\
//   /******************************|||$|******************************\
//  /*******************************|||||*******************************\
// /********************************|||||********************************\

public class Pyramide2 {
    private static final int FIRST_FLOOR_HEIGHT = 3;

    private int nbFloors;

    public static void main(String args[]) {
        int nbFloors = 5;

        Pyramide2 p = new Pyramide2(nbFloors);
        p.print();
    }

    public Pyramide2(int nbFloors) {
        this.nbFloors = nbFloors;
    }

    private ArrayList<Integer> calculateAllHalfWidths() {
        ArrayList<Integer> halfWidthList = new ArrayList<Integer>();

        int nbStars = 1;

        for (int iFloor = 0; iFloor < nbFloors; ++iFloor) {
            int nbLine = FIRST_FLOOR_HEIGHT + iFloor;

            for (int iLine = 0; iLine < nbLine; ++iLine) {
                halfWidthList.add(nbStars);
                nbStars++;
            }

            nbStars += 2;
        }

        return halfWidthList;
    }

    public void print() {
        ArrayList<Integer> halfWidthList = calculateAllHalfWidths(); 
        
        int iLineAbs = 0;
        int maxHalfWidth = halfWidthList.get(halfWidthList.size() - 1);

        for (int iFloor = 0; iFloor < nbFloors; ++iFloor) {
            int nbLine = FIRST_FLOOR_HEIGHT + iFloor;

            for (int iLine = 0; iLine < nbLine; ++iLine) {
                int halfWidth = halfWidthList.get(iLineAbs);
                iLineAbs++;
            
                if ((iFloor == nbFloors - 1) && (iLine >= nbLine - 5)) {
                    printDoorLine(halfWidth, maxHalfWidth, iLine, iFloor);
                } else {
                    printLine(halfWidth, maxHalfWidth);
                }
            }
        }
    }

    public void printLine(int halfWidth, int maxHalfWidth) {
        System.out.println(" ".repeat(maxHalfWidth - halfWidth) + "/" + "*".repeat(2 * halfWidth - 1) + "\\");
    }

    public void printDoorLine(int halfWidth, int maxHalfWidth, int iNbLine, int iFloor) {
        System.out.println(" ".repeat(maxHalfWidth - halfWidth) + "/" + "*".repeat(halfWidth - 3)
                + ((iNbLine == FIRST_FLOOR_HEIGHT + iFloor - 3) ? "|||$|" : "|||||") + "*".repeat(halfWidth - 3)
                + "\\");
    }
}