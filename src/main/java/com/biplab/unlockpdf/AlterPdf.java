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

    private static String FILE_NAME = "DEMAND LETTER";
    private static String FILE_PATH = "D:\\codebase\\github\\biplabnayak\\unlock-pdf\\pdfs";
    private static String EXT = ".pdf";

    private static final List<Integer> pages = Arrays.asList(1); // This starts with 0

    public static void main(String[] args) throws Exception {

        File inFile = new File(FILE_PATH + File.separator + FILE_NAME + EXT);
        File outFile = new File(FILE_PATH + File.separator + FILE_NAME + "_altered" + EXT);
        PDDocument document = PDDocument.load(inFile);

        PDDocument newDoc = new PDDocument();

        for (int i : pages) {
            newDoc.addPage(document.getPage(i));

        }

        newDoc.save(outFile);

    }
}
