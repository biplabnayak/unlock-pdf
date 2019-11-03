package com.biplab.unlockpdf;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;

/**
 * Main class to unlock pdf
 */
public class UnlockPdf {

    private static String FILE_NAME = "Aug 2019";
    private static String FILE_PATH = "/Users/biplabnayak/Desktop/docs/creditcard";
    private static String PASSWORD = "DUMMY";
    private static String EXT = ".PDF";

    public static void main(String[] args) throws Exception {

        File inFile = new File(FILE_PATH + File.separator + FILE_NAME + EXT);
        File outFile = new File(FILE_PATH + File.separator + FILE_NAME + "_unlocked" + EXT);
        PDDocument document = PDDocument.load(inFile, PASSWORD);

        document.setAllSecurityToBeRemoved(true);

        document.save(outFile);

    }
}
