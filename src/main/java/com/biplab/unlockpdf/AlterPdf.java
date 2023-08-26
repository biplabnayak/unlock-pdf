package com.biplab.unlockpdf;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Main class to unlock pdf
 */
public class AlterPdf {

    private static String FILE_NAME = "sample";
    private static String FILE_PATH = "/Users/biplabnayak/Downloads";
    private static String EXT = ".PDF";

    private static final List<Integer> pages = Arrays.asList(2,3); // This starts with 0

    public static void main(String[] args) throws Exception {

        File inFile = new File(FILE_PATH + File.separator + FILE_NAME + EXT);
        File outFile = new File(FILE_PATH + File.separator + FILE_NAME + "_unlocked" + EXT);
        PDDocument document = PDDocument.load(inFile);

        PDDocument newDoc = new PDDocument();

        for (int i : pages) {
            newDoc.addPage(document.getPage(i));

        }

        newDoc.getPage(0).setRotation(90);
        newDoc.save(outFile);

    }
}
