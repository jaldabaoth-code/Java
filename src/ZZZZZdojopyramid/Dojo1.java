package ZZZZZdojopyramid;/*
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

public class Dojo1 {
    public static void main(String args[]) {
        String stars = "*";
        int stage = 0 ; 
        int countStar = 1;
        int etage = 5;
        int height = 3;
        String space = " ";
        //int spaceCounter = etage * height;
        int spaceCounter = etage * height + (((((etage + height)-1) + height) * etage)/2-4);
         

        for (int i = 0; i < etage; i++) {
          /*  for (int j = 0; j < (etage - i); j++) {

                System.out.print(space);
            } */
                      
            for (int j = 0; j < height; j++) { 
                     
               System.out.println( space.repeat(spaceCounter) + "/" + stars.repeat(countStar) + "\\");
               
                countStar+=2;
              spaceCounter--;
            }
            height += 1;
            countStar += 6;

            spaceCounter -= 3;
        }
    }    
}