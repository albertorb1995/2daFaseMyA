/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.util.Date;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.text.SimpleDateFormat;  

/**
 *
 * @author Zireael
 */
public class LectorXML {
    
    public String ccc;
    public String nombre;
    public String apellido1;
    public String apellido2;
    public String direccion;
    public Date fnac;
    public long saldo;
    
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    
    public void readClientData() {
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("Clientes.xml"));
            
            NodeList clientes = document.getElementsByTagName("clientes");
            
            for (int i = 0; i < clientes.getLength() ; i++) {
                Node cli = clientes.item(i);
                if (cli.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) cli;
                    ccc = getNodo("ccc", elemento);
                    nombre = getNodo("nombre", elemento);
                    apellido1 = getNodo("apellido1", elemento);
                    apellido2 = getNodo("apellido2", elemento);
                    direccion = getNodo("direccion", elemento);
                    fnac = new SimpleDateFormat(getNodo("fnac", elemento)).parse(getNodo("fnac", elemento));
                    saldo = Long.parseLong(getNodo("direccion", elemento));
                }
            }           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getNodo(String etiqueta, Element elemento) {
        NodeList nodo = elemento.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node valornodo = (Node) nodo.item(0);
        return valornodo.getNodeValue();
    }
}
