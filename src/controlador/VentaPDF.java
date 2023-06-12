package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.InterFacturacion;

public class VentaPDF {

    private String nombreCliente;
    private String documentoCliente;
    private String telefonoCliente;
    private String direccionCliente;

    private String fechaActual = "";
    private String nombreArchivoPDFVenta = "";
    private String ultimoIDCabecera;

    //metodo para obtener los datos del cliente
    public void DatosCliente(int idCliente) {

        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cliente where idCliente = '" + idCliente + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                nombreCliente = rs.getString("nombre") + " " + rs.getString("apellido");
                documentoCliente = rs.getString("cedula");
                telefonoCliente = rs.getString("telefono");
                direccionCliente = rs.getString("direccion");
                
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener Datos del Cliente, en : " + e);
        }

    }
    
    //metodo para obtener el ultimo ID de la tabla de cabecera
    public void ObtenerUltimoIDCabecera(){
        
        Connection cn = Conexion.conectar();
        String sql = "select LPAD(idCabeceraVenta,5,'0') from tb_cabecera_venta order by idCabeceraVenta desc limit 1;";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                    ultimoIDCabecera = rs.getString("LPAD(idCabeceraVenta,5,'0')");
                    System.out.println(ultimoIDCabecera);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el ultimo ID de Ventas, en : " + e);
        }
    }
    
    //metodo para generar Factura de Venta
    public void generarFacturaVentaPDF(){
        
        try {
            
            //cargar la fecha Actual
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            
            //cambiar el formato de la fecha de / a _
            String fechaNueva = "";
            
            for (int i = 0; i < fechaActual.length() ; i++) {
                if (fechaActual.charAt(i) == '/') {
                    fechaNueva = fechaActual.replace("/", "_");
                }
            }
            
            nombreArchivoPDFVenta ="Factura - " + ultimoIDCabecera + " - " + "Venta_" + nombreCliente + "_" + fechaNueva + ".pdf";
            
            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombreArchivoPDFVenta);
            
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Image img = Image.getInstance("src/img/ventas.png");
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            
            fecha.add(Chunk.NEWLINE);//agregar nueva linea
            fecha.add("Factura: " + ultimoIDCabecera + "\nFecha: " + fechaActual + "\n\n");
            
            PdfPTable encabezado = new PdfPTable(4);
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(0);//quitar el borde de la tabla
            
            //tamanio de las celdas
            float [] columnasEncabezado = new float[]{20f, 30f, 70f, 40f};
            encabezado.setWidths(columnasEncabezado);
            encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //agregar celdas
            encabezado.addCell(img);
            
            String ruc = "10736338951"; 
            String nombre = "VILLANUEVA S.A.C"; 
            String telefono = "926856094"; 
            String direccion = "Villa el Salvador"; 
            String razon = "Si puedes imaginarlo, puedes programarlo";
            
            encabezado.addCell("");
            encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nTELÉFONO: " + telefono + "\nDIRECCIÓN: " + direccion + "\nRAZÓN SOCIAL: " + razon);
            encabezado.addCell(fecha);
            
            //agregamos encabezado
            doc.add(encabezado);
            
            /**CUERPO**/
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);//nueva linea
            cliente.add("Datos del Cliente: " + "\n\n");
            doc.add(cliente);
            
            /**DATOS DEL CLIENTE**/
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);//quitar el borde de la tabla

            //tamanio de las celdas
            float [] columnasCliente = new float[]{30f, 40f, 30f, 40f};
            tablaCliente.setWidths(columnasCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            PdfPCell clienteDocumento = new PdfPCell(new Phrase("Documento/RUC: ", negrita));
            PdfPCell clienteNombre = new PdfPCell(new Phrase("Nombre: ", negrita));
            PdfPCell clienteTelefono = new PdfPCell(new Phrase("Teléfono: ", negrita));
            PdfPCell clienteDireccion = new PdfPCell(new Phrase("Dirección: ", negrita));
            
            //quitar bordes
            clienteDocumento.setBorder(0);
            clienteNombre.setBorder(0);
            clienteTelefono.setBorder(0);
            clienteDireccion.setBorder(0);
            
            //agregar celda a la tabla
            tablaCliente.addCell(clienteDocumento);
            tablaCliente.addCell(clienteNombre);
            tablaCliente.addCell(clienteTelefono);
            tablaCliente.addCell(clienteDireccion);
            tablaCliente.addCell(documentoCliente);
            tablaCliente.addCell(nombreCliente);
            tablaCliente.addCell(telefonoCliente);
            tablaCliente.addCell(direccionCliente);
            
            //agregamos el documento
            doc.add(tablaCliente);
            
            //Espacio en Blanco
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            
            /**AGREGAR PRODUCTOS**/
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);//quitar el borde de la tabla
            
            //tamanio de celda
            float [] columnasProducto = new float[]{15f, 45f, 20f, 20f};
            tablaProducto.setWidths(columnasProducto);
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell productoCantidad = new PdfPCell(new Phrase("Cantidad: ", negrita));
            PdfPCell productoDescripcion = new PdfPCell(new Phrase("Descripcion: ", negrita));
            PdfPCell productoPrecioU = new PdfPCell(new Phrase("PrecioUnitario: ", negrita));
            PdfPCell productoPrecioTotal = new PdfPCell(new Phrase("PrecioTotal: ", negrita));

            //quitar bordes
            productoCantidad.setBorder(0);
            productoDescripcion.setBorder(0);
            productoPrecioU.setBorder(0);
            productoPrecioTotal.setBorder(0);
            
            //Agregar Color al Encabezado
            productoCantidad.setBackgroundColor(BaseColor.LIGHT_GRAY);
            productoDescripcion.setBackgroundColor(BaseColor.LIGHT_GRAY);
            productoPrecioU.setBackgroundColor(BaseColor.LIGHT_GRAY);
            productoPrecioTotal.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            //agregar celda
            tablaProducto.addCell(productoCantidad);
            tablaProducto.addCell(productoDescripcion);
            tablaProducto.addCell(productoPrecioU);
            tablaProducto.addCell(productoPrecioTotal);
            
            for (int i = 0; i < InterFacturacion.jTable_productos.getRowCount() ; i++) {
                String producto = InterFacturacion.jTable_productos.getValueAt(i, 1).toString();
                String cantidad = InterFacturacion.jTable_productos.getValueAt(i, 2).toString();
                String precio = InterFacturacion.jTable_productos.getValueAt(i, 3).toString();
                String total = InterFacturacion.jTable_productos.getValueAt(i, 7).toString();
                
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(producto);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
            }
            
            //agregar Elemento
            doc.add(tablaProducto);
            
            
            /**Total Pagar**/
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a Pagar: " + InterFacturacion.txt_total_pagar.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            /**firma**/
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelacion y Firma\n\n");
            firma.add("________________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
             /**Gracias por su compra**/
            Paragraph msg = new Paragraph();
            msg.add(Chunk.NEWLINE);
            msg.add("!Gracias por su Compra!");
            msg.setAlignment(Element.ALIGN_CENTER);
            doc.add(msg);
            
            //Cerrar el documento y el archivo
            doc.close();
            archivo.close();
            
            //abrir el documento al ser generado
            Desktop.getDesktop().open(file);
            
            
        } catch (DocumentException | IOException e) {
            System.out.println("Error al generar Factura de Venta en, : " + e);
        }
        
    }
    
    
}
