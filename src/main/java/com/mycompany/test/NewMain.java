/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desarrollo7
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjectNode json;
        try {
            // TODO code application logic here
            json = (ObjectNode) new ObjectMapper().readTree("{\n"
                    + "    \"maltConfirmationCase\": {\n"
                    + "        \"maltConfirmationCasePartesDano\": {\n"
                    + "            \"FOOT_BAR\": {\n"
                    + "                \"BROKEN\": false,\n"
                    + "                \"LOOSE\": false,\n"
                    + "                \"MISSING\": false\n"
                    + "            },\n"
                    + "            \"SIDE_CARRY_HANDLE\": {\n"
                    + "                \"Broken\": false,\n"
                    + "                \"Loose\": false\n"
                    + "            },\n"
                    + "            \"HANDLE\": {},\n"
                    + "            \"ADD-A_BAG\": {\n"
                    + "                \"Clip Base Broken\": false,\n"
                    + "                \"Clip Base Loose\": false,\n"
                    + "                \"Strap\": false\n"
                    + "            },\n"
                    + "            \"TIRE\": {\n"
                    + "                \"Shreaded\": false,\n"
                    + "                \"Other\": false\n"
                    + "            },\n"
                    + "            \"LINING\": {\n"
                    + "                \"Ripped\": false,\n"
                    + "                \"Other\": false,\n"
                    + "                \"Seam Open\": false\n"
                    + "            },\n"
                    + "            \"HOUSING\": {\n"
                    + "                \"Cracked/Broken\": false\n"
                    + "            },\n"
                    + "            \"BOTTOM_HANDLE/CUP\": {\n"
                    + "                \"Brooken\": false,\n"
                    + "                \"Loose\": false\n"
                    + "            },\n"
                    + "            \"TOP_CARRY_HANDLE\": {\n"
                    + "                \"Broken\": false,\n"
                    + "                \"Loose\": false\n"
                    + "            },\n"
                    + "            \"SKID_PLATE/BAR\": {\n"
                    + "                \"Damaged\": false,\n"
                    + "                \"Other\": false,\n"
                    + "                \"Loose Seam\": false,\n"
                    + "                \"Missing\": false\n"
                    + "            },\n"
                    + "            \"OTHER\": {\n"
                    + "                \"Seams\": false,\n"
                    + "                \"Corner Guard\": false,\n"
                    + "                \"Compres Clip\": false,\n"
                    + "                \"TSA Lock\": false,\n"
                    + "                \"Sanps\": false,\n"
                    + "                \"Other\": false,\n"
                    + "                \"LOGO\": false\n"
                    + "            },\n"
                    + "            \"BEARINGS\": {\n"
                    + "                \"Dirty\": false,\n"
                    + "                \"Missing\": false\n"
                    + "            },\n"
                    + "            \"FOOT\": {\n"
                    + "                \"Loose\": false,\n"
                    + "                \"Other\": false,\n"
                    + "                \"Missing\": false\n"
                    + "            },\n"
                    + "            \"WHEELS\": {},\n"
                    + "            \"RETRACTABLE_HANDLE\": {\n"
                    + "                \"Retracting Tubes\": false,\n"
                    + "                \"Top Handle\": false\n"
                    + "            },\n"
                    + "            \"ZIPPER\": {\n"
                    + "                \"Zip Tape-Outer Pocket\": false,\n"
                    + "                \"Puller-Main\": false,\n"
                    + "                \"Slider-Inside\": false,\n"
                    + "                \"Inside\": false,\n"
                    + "                \"Puller-Inside\": false,\n"
                    + "                \"Zip teeth-Main\": false,\n"
                    + "                \"Zip-teeth-Outer Pocket\": false,\n"
                    + "                \"Zip Tape-Main\": false,\n"
                    + "                \"Zip teeth-Inside\": false,\n"
                    + "                \"Puller-Outer-Pocket\": false,\n"
                    + "                \"Slider-Main\": false,\n"
                    + "                \"Slider-Outer Pocket\": false\n"
                    + "            }\n"
                    + "        }\n"
                    + "    },\n"
                    + "    \"maltCase\": {\n"
                    + "        \"casePartesDano\": [\n"
                    + "            \"HINGES\"\n"
                    + "        ],\n"
                    + "        \"caseMaltSku\": \"1121257889\",\n"
                    + "        \"caseImagesUrls\": [\n"
                    + "            \"https://cdn.novaip.us/travelpro/pros_files/2357/adjuntos_oportunidades/akhkxibhziPhone 3.png\"\n"
                    + "        ]\n"
                    + "    }\n"
                    + "}");
            System.out.println("JSON " + json.toString());
        } catch (IOException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
