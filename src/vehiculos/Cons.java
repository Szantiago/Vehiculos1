/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import javax.swing.JOptionPane;
import vehiculos.*;
/**
 *
 * @author L3Li
 */
public class Cons {
    	private int cons_cons;
	private String nomb_cons = new String();
	private int cons_muni ;
        private String codi_pobl = new String();
	private int tele_cons;
	private String dire_cons = new String();
        private String nombre_muni = new String();
        private int cons_conse;
	private Conexion conMiconexion;
        
        public Cons (){}
        
        public Cons(int Ccons_cons, String Cnomb_cons){
        cons_cons = Ccons_cons;
        nomb_cons=Cnomb_cons;
        
        }
        
        public Cons(int Ccons_muni, String Ccodi_pobl, String Cnombre_muni){
        cons_muni = Ccons_muni;
        codi_pobl=Ccodi_pobl;
        nombre_muni= Cnombre_muni;
        }
        public Cons(int Ccons_consr, String Cnomb_cons, String Ccodi_pobl, String Ctele_cons, String Cdire_cons){
           
	}
        
        
         public int getcons_cons(){
		return cons_cons;
         }
         
         public void setcons_cons(int newVal){
		cons_cons = newVal;
	}
           
         public String getnomb_cons(){
		return nomb_cons;
         }
         
         public void setnomb_cons(String newVal){
		nomb_cons = newVal;
           }        
         
         public String getcodi_pobl(){
		return codi_pobl;
         }
         public int getcons_muni(){
		return cons_muni;
         }
         
         public String getnombre_muni (){
                return nombre_muni;
         }
         public void setcodi_pobl(String newVal){
		nomb_cons = newVal;
           }      
           
         public int gettele_cons(){
		return tele_cons;
         }
         
         public void settele_cons(int newVal){
		tele_cons = newVal;
	}
         
         public String getdire_cons(){
		return dire_cons;
         }
         
         public void setdire_cons(String newVal){
		dire_cons = newVal;
           }      
           
         public int getcons_conse(){
		return cons_conse;
         }
         
         public void setcons_conse(int newVal){
		cons_conse = newVal;
	}
         
        public void crudCrearConsencionario(String strnomb_cons, String strcodi_pobl, int Inttele_cons, String strdire_cons){
        
            conMiconexion = new Conexion();
            //int intAux;          
            conMiconexion.queryUpdate("INSERT INTO tabl_cons( nomb_cons, codi_pobl,"
                    + " tele_cons, dire_cons) VALUES('" +strnomb_cons +"','" +
                    strcodi_pobl + "','"+ Inttele_cons + "','" + strdire_cons +"');");
            
            String strMensaje = "Se creo con éxito";
            JOptionPane.showMessageDialog (null, strMensaje,  "Crear Consecionario ", 2);   
         }
        
        public void crudActualizarConsencionario(String strnomb_cons, String intcodi_pobl, int Inttele_cons, String strdire_cons, int Intcons_cons) {

            conMiconexion = new Conexion();
	   String [][]strReg = conMiconexion.resultadoQuery(conMiconexion.queryConsulta("SELECT nomb_cons, codi_pobl, tele_cons, dire_cons, cons_cons FROM tabl_cons WHERE cons_cons =" + Intcons_cons +  ";"));
	   if(strReg[0][0] != null)
	   {
               
               conMiconexion.queryUpdate("UPDATE tabl_cons SET  nomb_cons= "
                       + strnomb_cons + ", codi_pobl= "+ intcodi_pobl
                       + ", tele_cons= '"+ Inttele_cons+ "', dire_cons= '"+ strdire_cons +  "' WHERE  cons_cons = " + Intcons_cons +";");
               
                cons_conse = Intcons_cons;
                nomb_cons = strnomb_cons;
                codi_pobl= intcodi_pobl;
                tele_cons = Inttele_cons;
                dire_cons = strdire_cons;
        
                
             
               String strMensaje = "Se modifico con éxito";
               JOptionPane.showMessageDialog(null, strMensaje,  "MODIFICAR ", 2);
	   }
	   else
	   {
               String strMensaje = "No se pudo modificar ";
               JOptionPane.showMessageDialog(null, strMensaje,  "MODIFICAR ", 0);

	   }
            
	}
        
        public void crudMostrarConsecionario(String nombre_cons){

            conMiconexion = new Conexion();

            String [][]strReg = conMiconexion.resultadoQuery(conMiconexion.queryConsulta(
                                    "SELECT nomb_cons FROM tabl_conss WHERE  nomb_cons = " + nombre_cons +  ";")); 
           
            nombre_cons = strReg[0][0];
            //strNombre = strReg[0][1];
            
	}
        
        public Cons[] crudListaPoblado(){
		
            int intCont;
            int intTama = 0;
            conMiconexion = new Conexion();

            try
            {
                String [][]strReg = conMiconexion.resultadoQuery(conMiconexion.queryConsulta( 
                                                "SELECT COUNT(cons_muni) AS TAL FROM tabl_muni where cons_muni < 101;"));

                intTama = Integer.parseInt(strReg[0][0]);
                System.out.print("\n el tamaño es:" + intTama + "\n");
                
                strReg = conMiconexion.resultadoQuery(conMiconexion.queryConsulta(
                        "SELECT cons_muni, codi_pobl,nomb_muni FROM tabl_muni where cons_muni < 101 ORDER BY cons_muni;"));                

                Cons [] Lista = new Cons[intTama];

                for (intCont = 0; intCont <(intTama); intCont++)
                {
                    Cons PobladoAux = new Cons (Integer.parseInt(strReg[intCont][0]), 
                            strReg[intCont][1],strReg[intCont][2]);
                                        
                    Lista[intCont] = PobladoAux;

                }
                return Lista;
            }
            catch(Exception ex)
            {
                String strMensaje = "Se presento un problema con la lista de Poblado 1";
                JOptionPane.showMessageDialog(null, strMensaje,  "PROBLEMA CON LA LISTA", 0);
                System.out.print(ex);
                return null;
            }          
	}
        
        public Cons[] crudListaConsecionario(){
		
            int intCont;
            int intTama = 0;
            conMiconexion = new Conexion();

            try
            {
                String [][]strReg = conMiconexion.resultadoQuery(conMiconexion.queryConsulta( 
                                                "SELECT COUNT(cons_cons) AS TAL FROM tabl_cons ;"));

                intTama = Integer.parseInt(strReg[0][0]);
                //System.out.print("\n el tamaño es:" + intTama + "\n");
                
                strReg = conMiconexion.resultadoQuery(conMiconexion.queryConsulta(
                        "SELECT cons_cons, nomb_cons FROM tabl_cons ORDER BY cons_cons;"));                

                Cons [] Lista = new Cons[intTama];

                for (intCont = 0; intCont <(intTama); intCont++)
                {
                    Cons ConsecioAux = new Cons (Integer.parseInt(strReg[intCont][0]), 
                            strReg[intCont][1]);
                                        
                    Lista[intCont] = ConsecioAux;

                }
                return Lista;
            }
            catch(Exception ex)
            {
                String strMensaje = "Se presento un problema con la lista de Consecionario";
                JOptionPane.showMessageDialog(null, strMensaje,  "PROBLEMA CON LA LISTA", 0);
                System.out.print(ex);
                return null;
            }          
	}
        
        
        public static void main(String[] args) {
          
//prueba para la conexi�n
//        Conexion CC = new Conexion();
//        String R[][] = CC.resultadoQuery(CC.queryConsulta("SELECT `codi_pobl` FROM `tabl_cons` WHERE `codi_pobl`=25;"));
//        System.out.print("\n Código Poblado: " + R[0][0] + " - " + R[0][4] + "\n");
        
//-------------------------------------------------------------------------------
  
//Prueba clase Concesionario
    
        Cons miObjeto = new Cons();
        
 //...................................................................................
      

//se crea el vector para recibir el vector de Poblado
        Cons[] lisTabla = miObjeto.crudListaConsecionario();
        
        System.out.print("\n\t\t La lista de poblado: \n" );
        
//Bucle para listar los colores del vector
        
        for(int intCont=0; intCont < lisTabla.length; intCont++)
        {
            System.out.print("\n" + lisTabla[intCont].getcons_cons() + " - " +lisTabla[intCont].getnomb_cons());
        }
    }
}
