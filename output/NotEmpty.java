// ---------------------------------
// Ecriture dans un fichier de la classe 
// nom dans le workspace courant 
// output\NotEmpty.java
// 
// ---------------------------------

package output; 

public class NotEmpty extends List { 

	//attribut tail
      List tail;

	//attribut head
      List head;

      // Le constucteur complet.
      public NotEmpty( List tail, List head)  { 
            this.tail = tail; 
            this.head = head; 

      } 


      // teste si empty ou pas
      public final boolean  isEmpty( )  { 
            return false;
      } 

      // Calcule la longueur de la liste
      public final int  length( )  { 
            return 1 + tail.length();
      } 

      // concatenation purement fonctionnelle.
      public final List append( )  { 
            return tail.append(l).cons(head);
      } 

      // ajout a la fin.
      public final NotEmpty putLast( )  { 
            return tail.putlast(e).cons(head);
      } 

      // inversion purement fonctionenelle.
      public final List reverse( )  { 
            return tail.reverse().putLast(head);
      } 

      // redefinition.
      public final String  toString( )  { 
            return head+" "+ tail.toString();
      } 
} 

