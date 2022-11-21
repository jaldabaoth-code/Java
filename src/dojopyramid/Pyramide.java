package dojopyramid;/*
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

public class Pyramide {
    private static final int FIRST_FLOOR_HEIGHT = 3;
  
    private int nbFloors;
      public static void main(String args[]) {
          int nbFloors = 5;
  
          Pyramide p = new Pyramide(nbFloors);
          p.print();
      }
  
      public Pyramide(int nbFloors) {
          this.nbFloors = nbFloors;
      }
  
      public void print() {
          for(int i = 0; i < nbFloors; ++i) {
              printFloor(i);
          }
      }
  
      public void printFloor(int iFloor) {
          int nbLine = FIRST_FLOOR_HEIGHT + iFloor;
          for(int i = 0; i < nbLine; ++i) {
              if((iFloor == nbFloors - 1) && (i >= nbLine - 5)) {
                  printDoorLine(iFloor, i);
              } 
              else {
                  printLine(iFloor, i);
              }
          }
      }
  
      public void printLine(int iFloor, int iNbLine) {
          int halfWidth = getHalfWidth(iFloor, iNbLine);
  
          System.out.println( 
              " ".repeat(getMaxHalfWidth() - halfWidth) +
              "/" + "*".repeat(2 * halfWidth - 1) + "\\"  
          ); 
      }
      public void printDoorLine(int iFloor, int iNbLine) {
          int halfWidth = getHalfWidth(iFloor, iNbLine);
  
          System.out.println( 
              " ".repeat(getMaxHalfWidth() - halfWidth) +
              "/" + 
              "*".repeat(halfWidth - 3) + 
              ((iNbLine == FIRST_FLOOR_HEIGHT + iFloor - 3) ? "|||$|" : "|||||") +
              "*".repeat(halfWidth - 3) + 
              "\\"  
          ); 
      }
  
      public int getMaxHalfWidth() {
          return getHalfWidth(nbFloors - 1, nbFloors + FIRST_FLOOR_HEIGHT - 1);
      } 
  
      public int getHalfWidth(int iFloor, int iNbLine) {
          return 1 + 4 * iFloor + iFloor * (iFloor + 1)/2 + iNbLine;
      }
  }