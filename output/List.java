// ---------------------------------
// Ecriture dans un fichier de la classe 
// nom dans le workspace courant 
// output\List.java
// 
// ---------------------------------

package output; 

public abstract class List extends String { 

      // Le constucteur complet.
      public List( )  { 

      } 


      // teste si la liste est vide  ou pas.
      public abstract boolean  isEmpty( ) ; 


      // la longueur
      public abstract int  length( ) ; 


      // concatenation de deux listes
      public abstract List append( List l) ; 


      // Conversion.
      public abstract String  toString( ) ; 


      // Insertion en tete de liste
      public NotEmpty cons( String  e)  { 
            return new NotEmpty(e, this);
      } 

      // Ajout en fin de liste
      public abstract NotEmpty putlast( String  e) ; 


      // Inversion d'une liste
      public abstract List reverse( ) ; 

} 

