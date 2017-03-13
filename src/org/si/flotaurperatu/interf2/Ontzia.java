package org.si.flotaurperatu.interf2;
import java.awt.Color;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;


/**
 * Este TransferHandler va a ser capaz de tratar Transferables que
 * contengan Color, String o Image. De esta forma si se arrastra una imagen se
 * pondrá como icono del JLabel, un texto como etiqueta y un color como fondo
 */
public class Ontzia
        extends TransferHandler
{
   //~ Variables/Inicializadores estaticos -------------------------------------

   /**  */
   protected static DataFlavor dataFlavorColor;

   static
   {
      try
      {
         dataFlavorColor = new DataFlavor( 
               DataFlavor.javaJVMLocalObjectMimeType + ";class=java.awt.Color" );
      }
      catch( ClassNotFoundException e )
      {
         // TODO Auto-generated catch block
         e.printStackTrace(  );
         Ontzia.dataFlavorColor = null;
      }
   }

   //~ Variables de instancia --------------------------------------------------

   /**  */
   protected DataFlavor[] dataFlavorPermitidos;

   //~ Metodos -----------------------------------------------------------------

   /**
    * .<br>
    *
    * @param arg0  .<br>
 *
    * @param arg1  .<br>
 *
    *
    * @return .<br>
 *
    */
   @Override
   public boolean canImport( 
      JComponent arg0,
      DataFlavor[] arg1 )
   {
      for( int j = 0;j < arg1.length;j++ )
      {
         if( arg1[j].equals( DataFlavor.imageFlavor ) )
         {
            return true;
         }
         else if( arg1[j].equals( DataFlavor.stringFlavor ) )
         {
            return true;
         }
         else if( arg1[j].equals( Ontzia.dataFlavorColor ) )
         {
            return true;
         }
      }

      return false;
   }

   /**
    * .<br>
    *
    * @param arg0  .<br>
 *
    *
    * @return .<br>
 *
    */
   @Override
   public int getSourceActions( JComponent arg0 )
   {
      return TransferHandler.MOVE | TransferHandler.COPY |
      TransferHandler.LINK;
   }

   /**
    * .<br>
    *
    * @param arg0  .<br>
 *
    * @param arg1  .<br>
 *
    *
    * @return .<br>
 *
    */
   @Override
   public boolean importData( 
      JComponent arg0,
      Transferable arg1 )
   {
      try
      {
         JLabel jLabelAux = (JLabel)arg0;

         if( arg1.isDataFlavorSupported( DataFlavor.imageFlavor ) )
         {
            Image imageAux =
               (Image)arg1.getTransferData( DataFlavor.imageFlavor );
            jLabelAux.setIcon( new ImageIcon( imageAux ) );
         }
         else if( arg1.isDataFlavorSupported( DataFlavor.stringFlavor ) )
         {
            String stringAux =
               (String)arg1.getTransferData( DataFlavor.stringFlavor );
            jLabelAux.setText( stringAux );
         }
         else if( arg1.isDataFlavorSupported( 
               Ontzia.dataFlavorColor ) )
         {
            Color colorAux =
               (Color)arg1.getTransferData( 
                  Ontzia.dataFlavorColor );
            jLabelAux.setBackground( colorAux );
         }
         else
         {
            return false;
         }

         return true;
      }
      catch( UnsupportedFlavorException e )
      {
         e.printStackTrace(  );
      }
      catch( IOException e )
      {
         e.printStackTrace(  );
      }

      return false;
   }

   /**
    * .<br>
    *
    * @param argumentos  .<br>
 *
    */
   public static void main( String[] argumentos )
   {
      final JLabel jLabel =
         new JLabel( "Arrastra aqui texto, colores o imagenes" );
      jLabel.setOpaque( true );

      Ontzia ontzia = new Ontzia(  );
      jLabel.setTransferHandler( ontzia);

      JFrame frame = new JFrame(  );
      frame.add( jLabel );

      frame.setVisible( true );
      frame.pack(  );
   }
}