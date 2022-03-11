// ---------------------------------
// Ecriture dans un fichier de la classe 
// nom dans le workspace courant 
// output\List.java
// 
// ---------------------------------

package output; 

public abstract class List extends Object { 



      // teste si la liste est vide  ou pas.
      public abstract boolean  isEmpty( //TODO) ; 


      // la longueur
      public abstract int  length( //TODO) ; 


      // concatenation de deux listes
      public abstract List append( //TODO) ; 


      // Conversion.
      public abstract String  toString( //TODO) ; 


      // Insertion en tete de liste
      public NotEmpty cons( )  { 
      } 

      // Ajout en fin de liste
      public abstract NotEmpty putlast( //TODO) ; 


      // Inversion d'une liste
      public abstract List reverse( //TODO) ; 

} 

