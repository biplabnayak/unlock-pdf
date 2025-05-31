package com.biplab.unlockpdf;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Main class to unlock pdf
 */
public class MergePdf {

    private static String FILE_PATH = "C:\\Users\\Admin\\Desktop";
    private static String EXT = ".pdf";

    private static final List<Integer> pages = Arrays.asList(1); // This starts with 0

    public static void main(String[] args) throws Exception {

        File file1 = new File(FILE_PATH + File.separator + "Dl_Front" + EXT);
        File file2 = new File(FILE_PATH + File.separator + "Dl_Back" + EXT);
        File op = new File(FILE_PATH + File.separator + "Dl_merged" + EXT);

        PDDocument newDoc = new PDDocument();

//        newDoc.addPage(PDDocument.load(file4).getPage(0));
//        newDoc.addPage(PDDocument.load(file1).getPage(0));
        newDoc.addPage(PDDocument.load(file1).getPage(0));
        newDoc.addPage(PDDocument.load(file2).getPage(0));

        newDoc.save(op);

    }
}
