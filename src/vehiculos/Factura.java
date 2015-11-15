
package vehiculos;

import javax.swing.JOptionPane;

/**
 * UNIVERSIDAD DE CUNDINAMARCA
 * Ingenieria de Sistemas
 * Estudiantes: - Leidy Arevalo
 *              - Santiago Lozano
 *              - Victor Pinzon
 * 
 * Profesor: Diego Arce
 * 
 * @author 
 * @version 1.0
 * 
 * Esta clase sirve para manejar el mapeo entre el formulario de insertar cliente y la tabla tabl_fact
 */

    public class Factura {

            private int cons_fact;
            private String nume_fact = new String();
            private String fech_fact = new String(); 
            private int cons_clie;
            private int cons_vend;
            private int cons_cons;
            private int cons_vehi;
           


//-------------------------------------------------------------------------------
//Constructores

//       Constructor vacio
            public Factura(){

            }
            
//       Constructor que pide todos los parametros
            public Factura(int Icons_fact, String Inume_fact, String Ifech_fact, int Icons_clie, int Icons_vend, int Icons_cons, int Icons_vehi){
            cons_fact = Icons_fact;
            nume_fact = Inume_fact;
            fech_fact = Ifech_fact;
            cons_clie = Icons_clie;
            cons_vend = Icons_vend;
            cons_cons = Icons_cons;
            cons_vehi = Icons_vehi;
            }
        /**
        * Costructor que filtra por el consecutivo y crea la instancia con el registro
        * @param Ccons_fact
        */    
            public Factura(int Ccons_fact){
                this.CrudBuscarFactura(Ccons_fact);
            }
            
//-------------------------------------------------------------------------------
//Métodos GET y SET

            public int getcons_fact(){
                    return cons_fact;
            }

            public void setcons_fact(int newVal){
                    cons_fact = newVal;
            }

            public String getnume_fact(){
                    return nume_fact;
            }

            public void setnume_fact(String newVal){
                    nume_fact = newVal;
            }

            public String getfech_fact(){
                    return fech_fact;
            }

            public void setfech_fact(String newVal){
                    fech_fact = newVal;
            }

            public int getcons_clie(){
                    return cons_clie;
            }

            public void setcons_clie(int newVal){
                    cons_clie = newVal;
            }

            public int getcons_vend(){
                    return cons_vend;
            }

            public void setcons_vend(int newVal){
                    cons_vend = newVal;
            }

            public int getcons_cons(){
                    return cons_cons;
            }

            public void setcons_cons(int newVal){
                    cons_cons = newVal;
            }

            public int getcons_vehi(){
                    return cons_vehi;
            }

            public void setcons_vehi(int newVal){
                    cons_vehi = newVal;
            }
                      
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Métodos CRUD
        
//      Para crear registros en la tabla tabl_fact


             public void CrudInsertarFactura(String Inume_fact, String Ifech_fact, int Icons_clie,
                     int Icons_vend, int Icons_cons, int Icons_vehi){
                
                Conexion IC = new Conexion();
                
                int intAux;
                intAux = IC.queryUpdate("INSERT INTO `tabl_fact`(nume_fact, fech_fact, cons_clie, "
                        + "cons_vend, cons_cons, cons_vehi) VALUES ("+ Inume_fact +"','"+ Ifech_fact 
                        +"','"+ Icons_clie +"','"+ Icons_vend +"','"+ Icons_cons +"','"+ Icons_vehi + "')");
                JOptionPane.showMessageDialog(null, "Se creo el registro con exito", "MENSAJE", 2);
            }
            
//...............................................................................
	/** para mostrar una FACTURA filtrando por el el consecutivo
	 * @param Fcons_fact	 */

            public void CrudBuscarFactura(int Fcons_fact){
                
                Conexion BC = new Conexion();
                String[][]strResultado = BC.resultadoQuery(BC.queryConsulta("SELECT cons_fact, nume_fact, fech_fact, "
                        + "cons_clie, cons_vend, cons_cons, cons_vehi FROM tabl_fact WHERE cons_fact = " 
                        + Fcons_fact + ";"));

                cons_fact = Integer.parseInt(strResultado[0][0]);
                nume_fact = strResultado[0][1];
                fech_fact = strResultado[0][2];
                cons_clie = Integer.parseInt(strResultado[0][3]);
                cons_vend = Integer.parseInt(strResultado[0][4]);                        
                cons_cons = Integer.parseInt(strResultado[0][5]);
                cons_vehi = Integer.parseInt(strResultado[0][6]);
            }
//...............................................................................
	//Para modificar el registro de una factura
            
          
            public void CrudActualizarFactura(int Ncons_fact, String Nnume_fact, String Nfech_fact, int Ncons_clie, 
                    int Ncons_vend, int Ncons_cons, int Ncons_vehi){
                Conexion AC = new Conexion();

                String[][]strResultado = AC.resultadoQuery(AC.queryConsulta("SELECT `cons_fact`, `nume_fact`, `fech_fact`, "
                        + "`cons_clie`, `cons_vend`, `cons_cons`, `cons_vehi` FROM `tabl_fact`  "
                        + "WHERE cons_fact = " + Ncons_fact + ";" ));
                if (strResultado[0][0]!= null){
                AC.queryUpdate("UPDATE tabl_fact SET cons_fact = " + Ncons_fact + ", nume_fact = '" + Nnume_fact 
                        + "', fech_fact = '" + Nfech_fact + "', cons_clie = '" + Ncons_clie 
                        + "', cons_vend = '" + Ncons_vend + "', cons_cons = '" + Ncons_cons + "', cons_vehi = '" + Ncons_vehi  
                        +"'WHERE cons_fact=" + Ncons_fact);

                cons_fact = Ncons_fact;
                nume_fact = Nnume_fact;
                fech_fact = Nfech_fact;
                cons_clie = Ncons_clie;
                cons_vend = Ncons_vend;
                cons_cons = Ncons_cons;
                cons_vehi = Ncons_vehi;

                String strMensaje = "Se modifico LA FACTURA con éxito";
                   JOptionPane.showMessageDialog(null, strMensaje,  "MODIFICAR VENTA", 2);

               }
               else
               {
                   String strMensaje = "No se pudo modificar la FACTURA";
                   JOptionPane.showMessageDialog(null, strMensaje,  "MODIFICAR VENTA", 0);

               }
            }
//...............................................................................
        //	Para mostrar la lista de la tabla tabl_fact

        public Factura[] CrudListaFactura(){

            int intCont;
            int intTama=0;

            Conexion CC = new Conexion();
  
            try{
            String [][]strRes = CC.resultadoQuery(CC.queryConsulta("SELECT COUNT(`cons_fact`) "
                + "AS TANTOS FROM tabl_fact;"));
            
            intTama = Integer.parseInt(strRes[0][0]);
            System.out.print("\n El tamaño es:" + intTama + "\n");
            
            Factura[] mVentas = new Factura[intTama]; //Constructor Arreglo
                        
            strRes = CC.resultadoQuery(CC.queryConsulta("SELECT cons_fact, nume_fact, fech_fact, cons_clie, "
                    + "cons_vend, cons_cons, cons_vehi FROM tabl_fact"));

            for (intCont=0; intCont<(intTama); intCont++){
            Factura tabl_factAux = new Factura((Integer.parseInt(strRes[intCont][0])), strRes[intCont][1],
                    strRes[intCont][2],(Integer.parseInt(strRes[intCont][3])),
                    (Integer.parseInt(strRes[intCont][4])),(Integer.parseInt(strRes[intCont][5])),
                    (Integer.parseInt(strRes[intCont][6]))); // Crea instancia
            mVentas[intCont] = tabl_factAux; //Guardar en el vector
            }
            
            System.out.print("Fueron " + intTama + " facturas");//Muestra cuantas ventas hay
            return mVentas;//Retorna las ventas
            }

            catch(Exception ex){
            String strMensaje = "Se presento un problema con la lista de facturas";
            JOptionPane.showMessageDialog(null, strMensaje, "PROBLEMA CON LA LISTA", 0);
            System.out.print(ex);
            return null;
            }
        }
                        
//==========================================================================================================================
// Main para hacer pruebas             

        public static void main(String[] args) {
                Factura mR =new Factura();
//            cons_fact
//            nume_fact
//            fech_fact 
//            cons_clie;
//            cons_vend;
//            cons_cons;
//            cons_vehi;
        //...................................................................................   
        //Prueba insertar un Venta 
//                mR.CrudInsertarVenta(1, 1, 1, 2, 400000000, "20/06/2015");     
        //...................................................................................
        //pueba para buscar una Venta
                mR.CrudBuscarFactura(1); 
        //mR.CrudBuscarVenta(1);
               System.out.print("\n-El nuevo Venta es: " + mR.getcons_fact()+ " - " + mR.getnume_fact() + " - " + mR.getfech_fact()+ " - " +  mR.getcons_clie() +" - " + mR.getcons_vend() +" - " + mR.getcons_cons() +" - " + mR.getcons_vehi() + "\n");
//        //...................................................................................
//        //Prueba para actualizar una Venta
//                mR.CrudActualizarVenta(1, 1, 1, 1, 2, 400000000, "20/06/2015");
//        // miR.CrudActualizarVenta(1);        
//                System.out.print("\n-La Venta modificada es: " +  mR.getintIdUsuario() + " - " + mR.getintIdCliente()+ " - " +  mR.getintIdVehiculo() +" - " + mR.getintCantidadVehiculos() +" - " + mR.getintPrecioTotal() +" - " + mR.getintFechaVenta() + "\n");
       
       
                      
        }
    }

