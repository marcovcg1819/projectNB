/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlparser;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author marco.castrousam
 */
public class UrlParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            try {
                URL myURL;

                myURL = new URL("http://localhost:8080/imagencinco/rest/webservice/findAllImages");
                SAXReader sr = new SAXReader();
                Document document = sr.read(myURL);
                List lista = document.selectNodes("//images/image");
                Iterator iter = lista.iterator();

                while (iter.hasNext()) {
                    Element row = (Element) iter.next();
                    System.out.println(row.attribute(0).getText());
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }
}
