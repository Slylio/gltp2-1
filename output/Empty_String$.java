// ---------------------------------
// Ecriture dans un fichier de la classe 
// nom dans le workspace courant 
// output\Empty_String$.java
// 
// ---------------------------------

package output; 

public class Empty_String$ extends List { 

      // Le constucteur complet.
      public Empty_String$( )  { 

      } 


      // teste si empty ou pas
      public final boolean  isEmpty( )  { 
            return true;
      } 

      // Calcule la longueur de la liste
      public final int  length( )  { 
            return 0;
      } 

      // Conversion en chaine
      public final String  toString( )  { 
            return "";
      } 

      // concatenation
      public final List append( final List l)  { 
            return l;
      } 

      // inversion
      public final List reverse( )  { 
            return this;
      } 

      // ajout a la fin
      public final NotEmpty putLast( final String  e)  { 
            return new NotEmpty(e,this);
      } 
} 

