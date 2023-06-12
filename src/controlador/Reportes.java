package controlador;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Reportes {

    /**
     * *****************************************************************
     * metodo para crear reporte de los clientes registrados en el sistema
     * ******************************************************************
     */
    public void ReportesCliente() {
        Document documento = new Document();

        try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Clientes.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nReporte Creado por \nJose Villanueva ©LPO\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Clientes \n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Nombre");
            tabla.addCell("Documento");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idCliente, concat(nombre,' ',apellido) as nombres, cedula, telefono, direccion from tb_cliente");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));

                    } while (rs.next());

                    documento.add(tabla);
                }

            } catch (SQLException e) {

                System.out.println("Error en : " + e);

            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {

            System.out.println("Error 1 en : " + e);

        } catch (FileNotFoundException ex) {

            System.out.println("Error 2 en : " + ex);

        } catch (IOException ex) {

            System.out.println("Error 3 en : " + ex);

        }

    }

    /**
     * *****************************************************************
     * metodo para crear reporte de los Productos registrados en el sistema
     * ******************************************************************
     */
    public void ReportesProductos() {
        Document documento = new Document();

        try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Productos.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nReporte Creado por \nJose Villanueva ©LPO\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Productos \n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            //ancho de columnas
            float[] columsWidths = {3, 5, 4, 5, 7, 5, 6};

            PdfPTable tabla = new PdfPTable(columsWidths);
            tabla.addCell("Cod.");
            tabla.addCell("Nombre");
            tabla.addCell("Cant.");
            tabla.addCell("Precio");
            tabla.addCell("Descripcion");
            tabla.addCell("Por. IGV");
            tabla.addCell("Categoria");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select p.idProducto, p.nombre, p.cantidad, p.precio, p.descripcion, p.porcentajeIva, c.descripcion as categoria "
                        + "from tb_producto as p, tb_categoria as c "
                        + "where p.idCategoria = c.idCategoria;");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));

                    } while (rs.next());

                    documento.add(tabla);
                }

            } catch (SQLException e) {

                System.out.println("Error en : " + e);

            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {

            System.out.println("Error 1 en : " + e);

        } catch (FileNotFoundException ex) {

            System.out.println("Error 2 en : " + ex);

        } catch (IOException ex) {

            System.out.println("Error 3 en : " + ex);

        }

    }

    /**
     * *****************************************************************
     * metodo para crear reporte de las Categorias registradas en el sistema
     * ******************************************************************
     */
    public void ReportesCategorias() {
        Document documento = new Document();

        try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Categorias.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nReporte Creado por \nJose Villanueva ©LPO\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Categorias \n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Codigo");
            tabla.addCell("Descripcion");
            tabla.addCell("Estado");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from tb_categoria");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));

                    } while (rs.next());

                    documento.add(tabla);
                }

            } catch (SQLException e) {

                System.out.println("Error en : " + e);

            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {

            System.out.println("Error 1 en : " + e);

        } catch (FileNotFoundException ex) {

            System.out.println("Error 2 en : " + ex);

        } catch (IOException ex) {

            System.out.println("Error 3 en : " + ex);

        }

    }

    /**
     * *****************************************************************
     * metodo para crear reporte de las Ventas registradas en el sistema
     * ******************************************************************
     */
    public void ReportesVentas() {
        Document documento = new Document();

        try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Ventas.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            //formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nReporte Creado por \nJose Villanueva ©LPO\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Ventas \n\n");

            documento.open();
            //agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            //ancho de columnas
            float[] columsWidths = {3, 9, 4, 5, 3};

            PdfPTable tabla = new PdfPTable(columsWidths);
            tabla.addCell("Codigo");
            tabla.addCell("Cliente");
            tabla.addCell("Tot. Pagar");
            tabla.addCell("Fecha Venta");
            tabla.addCell("Estado");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select cv.idCabeceraVenta as id, concat(c.nombre,' ',c.apellido) as cliente, cv.valorPagar as total, cv.fechaVenta as fecha, if(cv.estado = 1, 'Activo', 'Inactivo') as estado "
                        + "from tb_cabecera_venta as cv, tb_cliente as c "
                        + "where cv.idCliente = c.idCliente;");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));

                    } while (rs.next());

                    documento.add(tabla);
                }

            } catch (SQLException e) {

                System.out.println("Error en : " + e);

            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado");

        } catch (DocumentException e) {

            System.out.println("Error 1 en : " + e);

        } catch (FileNotFoundException ex) {

            System.out.println("Error 2 en : " + ex);

        } catch (IOException ex) {

            System.out.println("Error 3 en : " + ex);

        }

    }
}
