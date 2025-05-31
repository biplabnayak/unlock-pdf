package com.biplab.unlockpdf;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;

/**
 * Main class to unlock pdf
 */
public class UnlockPdf {

    private static String FILE_NAME = "02 -  AADHAAR";
    private static String FILE_PATH = "G:\\My Drive\\Documents - Abheek\\01 - Govt";
    private static String PASSWORD = "ABHE2021";
//    private static String PASSWORD = "AMVPN3345A16091990";
    private static String EXT = ".PDF";

    public static void main(String[] args) throws Exception {

        File inFile = new File(FILE_PATH + File.separator + FILE_NAME + EXT);
        File outFile = new File(FILE_PATH + File.separator + FILE_NAME + "_unlocked" + EXT);
        PDDocument document = PDDocument.load(inFile, PASSWORD);

        document.setAllSecurityToBeRemoved(true);

        document.save(outFile);

    }
}
